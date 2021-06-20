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
public class Token {
   private String lexeme;
   private String token_name;
   private String attribute_value;
   public Token(String token_name){
       this.settoken_name(token_name);
   }
    
    public void setlexeme(String lexeme1){
        this.lexeme = lexeme1;
    }
    
    public void settoken_name(String token_name1){
        this.token_name = token_name1;
    }
    
    public void setattribute(String attribute1){
        this.attribute_value = attribute1;
    }
    
    public String getlexeme(){
        return lexeme;
    }
    
    public String gettoken_name(){
        return token_name;
    }
    
    public String getattribute(){
        return attribute_value;
    }
    
    @Override
    public String toString(){
        return "Token{ Lexeme='" + getlexeme() +"', Token='" + gettoken_name() + "', Attribute value ='" + getattribute() + "'}";
    }

}
