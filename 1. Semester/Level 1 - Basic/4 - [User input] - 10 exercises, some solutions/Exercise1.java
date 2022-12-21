//Write a program to take two integer inputs from user
//and print sum and product of them. 

import java.util.*;


public class Exercise1{
   public static void main(String[] args){
      //get input from user
      Scanner scanner = new Scanner(System.in);
      int inputOne = 0;
      int inputTwo = 0;
      
      //get inputOne and validate
      try{
         inputOne = scanner.nextInt();
         inputTwo = scanner.nextInt();

      }catch(InputMismatchException e){
         System.out.println("Wrong format.");
      }
            
      
      //sum the input
      int output = inputOne + inputTwo;
      
      //print the input
      System.out.println(output);
         
   }
}