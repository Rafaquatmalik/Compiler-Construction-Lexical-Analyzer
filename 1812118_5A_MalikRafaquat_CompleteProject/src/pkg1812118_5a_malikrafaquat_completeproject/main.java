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
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        project_step_1_2 obj = new project_step_1_2();
        try{
            obj.read_from_file();
        }catch(Exception e){
            System.out.println("Error Ocurred!!!");
        }
        
        project_step_8 obj1 = new project_step_8();
        try{
            obj1.process();
        }catch(Exception e){
            System.out.println("Error Ocurred!!!");
        }
    }
    
}
