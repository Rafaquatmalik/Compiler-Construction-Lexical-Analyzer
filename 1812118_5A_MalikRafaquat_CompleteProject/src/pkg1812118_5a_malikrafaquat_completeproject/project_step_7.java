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
public class project_step_7 {
    Node head;
    Node tail;
    
    public void add(int ROW_NUM,int line_no, String lexeme,String token, String attribute_value){
        Node node = new Node(ROW_NUM,line_no, lexeme, token,attribute_value);
        if(head == null){
            head = node;
            tail = node;
        }else{
            tail.nextnode = node;
            tail = node;
        }
    }
    
     public void traverse(){
        if(head != null){
            Node node = head;
            while(node != null){
               System.out.println(node);
               node = node.nextnode;
           }
       }
    } 
     
      public String find (String data){
        if(head==null)
            return null;
        if(head.lexeme.equals(data))
            return head.lexeme;
        
        Node node = head;
        while(node.nextnode!= null){
            node = node.nextnode;
            if(node.lexeme.equals(data))
                return head.lexeme;
        }
        return null;
    }
}
