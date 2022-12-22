//Write a program to find greatest common divisor (GCD)
//or highest common factor (HCF) of given two numbers

import java.util.Scanner;

public class Exercise6{
   public static void main(String[] args){
      //get two integers from user
      Scanner s = new Scanner(System.in);
      
      System.out.println("Enter two numbers:");
      int n1 = s.nextInt();
      int n2 = s.nextInt();
      
      
      System.out.println(gcdByEuclidsAlgorithm(n1, n2));
   
   
   
   } //end of main
   
   public static int gcdByEuclidsAlgorithm(int n1, int n2){
      if(n2 == 0){
         return n1;
      }
      
      return gcdByEuclidsAlgorithm(n2, n1 % n2);
      
   } //end of method
   
} //end of class