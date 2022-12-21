//Take name, roll number and field of interest from user
//and print in the format below:
//Hey, my name is xyz and my roll number is xyz.
//My field of interest are xyz. 

import java.util.Scanner;

public class Exercise4{
   public static void main(String[] args){
      //take inputs from user
      Scanner s = new Scanner(System.in);
      
      System.out.println("Input name:");
      String name = s.next();
      System.out.println("Input Roll number:");
      int rollNumber = s.nextInt();
      System.out.println("Input interests:");
      String interest = s.next();
      
      //print output
      System.out.println("Hey, my name is " + name + " and my roll number is " + rollNumber + ". My field of interests are " + interest + ".");
      
   
   
   }
}