/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg1812118_5a_malikrafaquat_completeproject;

/**
 *
 * @author rafaq
 */
public class project_step_8 {
    public String slr_parsing_table [][] ={{"state","id","+","*","(",")","$","E","T","F"},
                                           {"0","s5","","","s4","","","1","2","3"},
                                           {"1","","s6","","","","accept","","",""},
                                           {"2","","r2","s7","","r2","r2","","",""},
                                           {"3","","r4","r4","","r4","r4","","",""},
                                           {"4","s5","","","s4","","","8","2","3"},
                                           {"5","","r6","r6","","r6","r6","","",""},
                                           {"6","s5","","","s4","","","","9","3"},
                                           {"7","s5","","","s4","","","","","10"},
                                           {"8","","s6","","","s11","","","",""},
                                           {"9","","r1","s7","","r1","r1","","",""},
                                           {"10","","r3","r3","","r3","r3","","",""},
                                           {"11","","r5","r5","","r5","r5","","",""}
    };
    public String [] CFG_parse = {"E->E+T","E->T","T->T*F","T-> F","F->(E)","F->id"};
    
    public void process(){
        System.out.println();
        System.out.println("PRINTING  PRODUCTIONS OF GRAMMER");
        System.out.println();
        for(int i = 0;i < CFG_parse.length;i++){
            System.out.println(""+CFG_parse[i]); 
        }
                 System.out.println();
                 System.out.println("\t\t\t\t\tPRINTING SLR PARSING TABLE");
                 System.out.println();
                 System.out.println("\t  |\t\t\tACTION\t\t\t\t      |\t\tGOTO");
                 System.out.println("___________________________________________________________________________________________________________________");
                 
        for(int i = 0;i < slr_parsing_table.length; i++){
            for(int j = 0;j <slr_parsing_table[i].length;j++){
                System.out.printf("|%9s",slr_parsing_table[i][j]);
                       }
               System.out.println();
               System.out.println("___________________________________________________________________________________________________________________");
        }
                

    }
}
