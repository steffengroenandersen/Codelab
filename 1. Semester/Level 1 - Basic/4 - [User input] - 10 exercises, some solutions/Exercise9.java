//Write a program to enter the values of two variables 'a' and 'b' from keyboard 
//and then check if both the conditions 'a < 50' and 'a < b' are true. 

import java.util.Scanner;

public class Exercise9{
   public static void main(String[] args){
      //get two values from user
      Scanner s = new Scanner(System.in);
      
      System.out.println("Enter value 1:");
      int a = s.nextInt();
      
      System.out.println("Enter value 2:");
      int b = s.nextInt();
      
      //check if both conditions are true
      if(a < 50 && a < b){
         System.out.println("Both conditions are true.");
      } else {
         System.out.println("One or both conditions are not true.");
      }
   }
}
