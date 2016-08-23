

import java.util.Scanner;

public class testing { 

     public static void main(String[] args) { 
        
     Scanner input = new Scanner(System.in);   //need to create Scanner object to take input, object name is input
        
     System.out.println("Enter your name" );   
     String yourName = input.nextLine();        // take string input
        
     System.out.println("Enter your age" );
     int yourAge = input.nextInt();             // take int input

     System.out.println("Enter float:");
     float yourHeight = input.nextFloat();    // take float input
        
     System.out.println("Hello " + yourName);   //prints name, cursor put on new line

     } 

} 
