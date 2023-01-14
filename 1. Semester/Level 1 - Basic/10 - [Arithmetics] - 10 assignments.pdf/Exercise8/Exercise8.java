//Write a program to work out the number of bits in a gigabyte.
// Note: A gigabyte is 2.0^10 megabytes

import java.util.Scanner;

public class Exercise8{
   public static void main(String[] args){
      // Declaring Variables
      
      double bit = 1;
      double bytes = bit * 8;
      double megabyte = bytes * 2.0 * 2.0 * 2.0 * 2.0 * 2.0 * 2.0 * 2.0 * 2.0 * 2.0 * 2.0 * 2.0 * 2.0 * 2.0 * 2.0 * 2.0 * 2.0 * 2.0 * 2.0 * 2.0 * 2.0;
      double gigabyte = megabyte * 2.0 * 2.0 * 2.0 * 2.0 * 2.0 * 2.0 * 2.0 * 2.0 * 2.0 * 2.0;
      
      double gigabyteToBits = 8589934592.00;
      
      
      // Get input from user
      Scanner s = new Scanner(System.in);
      
      System.out.println("Enter number of gigabytes:");
      double input = s.nextDouble();  
      
      System.out.println("There are " + input * 8589934592.00 + " bits in " + input + " gigabytes");
      
      
            
   }
}