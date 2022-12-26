// Write a program to work out the
// number of seconds in 365 days

import java.util.Scanner;

public class Exercise5{
   public static void main(String[] args){
      
      // Get days from user
      Scanner s = new Scanner(System.in);
      
      System.out.println("Enter days");
      int days = s.nextInt();
      
      // Calculate seconds in n days
      System.out.println(MathYear.daysToSeconds(days));
      
   }
}