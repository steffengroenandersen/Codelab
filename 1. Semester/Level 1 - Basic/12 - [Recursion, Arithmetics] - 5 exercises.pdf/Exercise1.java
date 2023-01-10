// Write a program such that java fibonacci n prints out the nth Fibonacci number.
// The fibonacci sequence goes 1,1,2,3,5,8,13,21,34,55,89,...

import java.util.Scanner;

public class Exercise1{
   public static void main(String[] args){
      
      // Getting input from user
      Scanner s = new Scanner(System.in);
      
      System.out.println("Find the Fibonacci number.\nEnter the nth number you would like to find:");
      int input = s.nextInt();
      
      // Calculating and printing Fibonacci number 
      FibonacciSolver f = new FibonacciSolver();          
      System.out.println(f.fibonacciN(input, 0, 1));
   }
}