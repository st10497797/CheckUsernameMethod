/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package checkusernamemethod;

import java.util.Scanner;
public class CheckUsernameMethod {

    public static boolean checkusername(String username){
        if(!username.contains("_")|| username.length()>5){
            return false;
        }else{
            
            return true;
            
        }
    }
    //end of the method
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scan = new Scanner(System.in);
        
        // capture user details
        System.out.println("Please enter your first name");
        String firstname = scan.nextLine();
        System.out.println("Please enter your last name");
        String lastname= scan.nextLine();
        
        while (true){
            System.out.println("Enter Username");
            String username = scan.nextLine();
            
            if (checkusername(username)){
                
                System.out.println("Username successfully captured");
                break;
            }else{
                System.out.println("Username is not correctly formatted");
            }
          
                
        }
    }
    
}
