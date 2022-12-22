//Write a Java program to calculate factorial of a number. 

import java.util.Scanner;

public class Exercise5{
   public static void main(String[] args){
      //get input from user
      Scanner s = new Scanner(System.in);
      
      System.out.println("Please enter a number:");
      int input = s.nextInt();
      int answer = 1;
      
      
      //calculate factorial of input
      for(int i = input; i >= 1; i--){
         answer = answer * i;
      }
      
      //print results
      System.out.println(answer);
   }
}