/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg1812118_5a_malikrafaquat_completeproject;

import java.io.File;
import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author rafaq
 */
public class project_step_1_2 {
    int line_counter = 1;
    
    public void read_from_file(){
        try{
            //F:\\BSCS\\Smester 05 Fall 2020\\CSC3201 Compiler Construction\\omar_project\\sourcecode.txt
           // C:\\\\Users\\\\rafaq\\\\OneDrive\\\\Desktop\\\\sourcecode.txt
            File file = new File("C:\\temp\\sourcecode.txt");
            Scanner input = new Scanner(file);
            project_steps_3_4_5_6 lexical_analysis = new project_steps_3_4_5_6();
            System.out.println("\t\t\tPRINTING PROJECTS");
            StringBuilder data = new StringBuilder();
            while(input.hasNextLine()) {
                data.append(input.nextLine()).append("\n");
            }
       //System.out.println(data);
            for(int i = 0;i< data.length();i++){
                if(data.charAt(i) == ' '){}
                else if(data.charAt(i) == '\n') line_counter++;
                else if(data.charAt(i) == '\t'){}
                else if (data.charAt(i) == '/') {
                    if (data.charAt(i + 1) == '/') {
                        while (data.charAt(i) != '\n')
                            i++;
                    } else if (data.charAt(i + 1) == '*') {
                        i++;
                        for (int j = 0; j < data.length(); j++,i++) {
                            if (data.charAt(i) == '*') {
                                if (data.charAt(i + 1) == '/') {
                                    break;
                                }
                            }
                        }
                        i++;
                    } else {
                        System.out.print(data.charAt(i));
                        i = lexical_analysis.arop(data.toString(),i,line_counter);
                        if(Objects.equals(lexical_analysis.getToken().gettoken_name(), "AROP")) {
                            System.out.print(" - " + lexical_analysis.getToken());
                        }
                        System.out.println();
                    }
                }else{
                       System.out.print(data.charAt(i));
                        if(data.charAt(i)=='<' || data.charAt(i)=='=' || data.charAt(i)=='>'){
                        i = lexical_analysis.relop(data.toString(),i,line_counter);
                          if(Objects.equals(lexical_analysis.getToken().gettoken_name(), "RELOP")) {
                            System.out.print(" - " + lexical_analysis.getToken());
                          }
                        }
                        if(data.charAt(i)=='+' || data.charAt(i)=='-' || data.charAt(i)=='*' || data.charAt(i)=='/'){
                        i = lexical_analysis.arop(data.toString(),i,line_counter);
                          if(Objects.equals(lexical_analysis.getToken().gettoken_name(), "AROP")) {
                            System.out.print(" - " + lexical_analysis.getToken());
                          }
                        }
                        if(data.charAt(i)=='=' || data.charAt(i)=='(' || data.charAt(i)==')' || data.charAt(i)=='{' || data.charAt(i)=='}' || data.charAt(i)==';'){
                        i = lexical_analysis.otop(data.toString(),i,line_counter);
                          if(Objects.equals(lexical_analysis.getToken().gettoken_name(), "OTOP")) {
                            System.out.print(" - " + lexical_analysis.getToken());
                          }
                        }
                        
                        i = lexical_analysis.recognize_keywords(data.toString(),i,line_counter);
                        if(Objects.equals(lexical_analysis.getToken().gettoken_name(), "KEYWORD")) {
                            System.out.print(" - " + lexical_analysis.getToken());
                        }
                        if(data.charAt(i) == '"'){
                         i = lexical_analysis.recognize_string_literal(data.toString(),i,line_counter);
                        if(Objects.equals(lexical_analysis.getToken().gettoken_name(), "SLITERAL")) {
                            System.out.print(" - " + lexical_analysis.getToken());
                        }
                        }
                       
                        i = lexical_analysis.recognize_identifier(data.toString(),i,line_counter);
                        if(Objects.equals(lexical_analysis.getToken().gettoken_name(), "ID")) {
                            System.out.print(" - " + lexical_analysis.getToken());
                        }
                        i = lexical_analysis.recognize_usigned_int(data.toString(),i,line_counter);
                        if(Objects.equals(lexical_analysis.getToken().gettoken_name(), "UINT")) {
                            System.out.print(" - " + lexical_analysis.getToken());
                        }
                        
                        if(Objects.equals(lexical_analysis.getToken().gettoken_name(), null)) {
                           if((data.charAt(i) != ' ')&&(data.charAt(i) != '\t')&&(data.charAt(i) != '\n')  && (i < data.length()-1) && (data.charAt(i) != '+')&&(data.charAt(i) != '-')&&(data.charAt(i) != '*')&&(data.charAt(i) != '/') &&(data.charAt(i) != '<')&&(data.charAt(i) != '>')&& (data.charAt(i) != ')')&&(data.charAt(i) != '(')&&(data.charAt(i) != '=')&&(data.charAt(i) != '"'&&(data.charAt(i) != '{')&&(data.charAt(i) != '}')&&(data.charAt(i) != ';'))){
                           if(lexical_analysis.list.find(Character.toString(data.charAt(i)))!= null){}
                           else{
                           System.out.println();
                           System.out.print(" - Error Unrrecognizable lexeme = "+data.charAt(i)+" found at Line Number = "+line_counter);
                           System.out.print(" - HNDLE UNRECOGNIZABLE LEXEME !!!!"); 
                           }
                           }
                        }
                       
                       
                       System.out.println();
                }
            }input.close();
            System.out.println();
            System.out.println("--------------PRINTING SYMBOL TABLE-------------");
            System.out.println();
            lexical_analysis.list.traverse();
        }catch(IOException e){
            System.out.println("An Error Occurred");
            e.printStackTrace();
        }
    }
}
