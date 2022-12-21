//Ask user to give two double input for 
//length and breadth of a rectangle and 
//print area type casted to int.

import java.util.Scanner;

public class Exercise3{
   public static void main(String[] args){
      //get input from user
      Scanner s = new Scanner(System.in);
      double length = s.nextDouble();
      double breadth = s.nextDouble();
      
      //calculate area
      double area = length * breadth;
      
      //print area
      System.out.println((int)area);
      
   }
} 
