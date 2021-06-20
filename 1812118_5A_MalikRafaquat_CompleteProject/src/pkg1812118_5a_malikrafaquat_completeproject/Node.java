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
public class Node {
    
    int line_no;
    int ROW_NUM;
    String lexeme;
    String token;
    String attribute_value;
    Node nextnode;
    
    public Node(int ROW_NUM,int line_no, String lexeme,String token, String attribute_value){
       this.ROW_NUM = ROW_NUM;
       this.line_no = line_no;
       this.lexeme = lexeme;
       this.token = token;
       this.attribute_value = attribute_value;
       //this.nextnode= null;
    }
    
    
    @Override
    public String toString(){
      return "ROW_NUM "+ROW_NUM+" \tLine_No "+line_no+" { TOKEN = '" + token+ "', ATTRIBUTE VALUE ='" + attribute_value+ "', LEXEME ='" + lexeme + "'}";
    }
}
