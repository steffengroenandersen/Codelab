//Take integer inputs from user until he/she presses q
//( Ask to press q to quit after every integer input ).
//Print average and product of all numbers. 

import java.util.Scanner;

public class Exercise7{
   public static void main(String[] args){
      Scanner s = new Scanner(System.in);
      
      boolean shouldProgramRun = true;
      double number = 0;
      int counter = 0;
      
      while(shouldProgramRun){
         
         counter++; //count iterations
         
         //get input from user, q or integer
         
         System.out.println("Add number or press q to quit.");
         String input = s.next();
         
         //determine if program should quit
         if(input.equals("q")){
            System.out.println("Program shutting down...");
            shouldProgramRun = false;
            break;
         }
         
         //calculate and print avg and sum
         number = number + Double.parseDouble(input);
         
         System.out.println("Average " + number / counter );
         System.out.println("Sum: " + number);
         
         
         
      
      }
   }
}