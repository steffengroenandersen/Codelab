//Write a program to find square of a number. 

import java.util.Scanner;

public class Exercise6{
   public static void main(String[] args){
      //get number from user
      Scanner s = new Scanner(System.in);
      double number = s.nextInt();
      
      //calculate square
      double square = Math.pow(number, 2);
      
      //print results
      System.out.println("The square of " + number + " is " + square + ".");
   }
}