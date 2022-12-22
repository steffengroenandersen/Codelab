//Define a program to find out whether a given
//number is even or odd. 

import java.util.Scanner;

public class Exercise5{
   public static void main(String[] args){
      
      // get number from user
      Scanner s = new Scanner(System.in);
      
      System.out.println("Enter number: ");
      int input = s.nextInt();
      
      if(input % 2 == 0){
         System.out.println("Even!");
      } else{
         System.out.println("Odd!");
      }
   }
}