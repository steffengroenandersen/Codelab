//Define a method that returns the product of 
//two numbers entered by user. 

import java.util.Scanner;

public class Exercise2{
   public static void main(String[] args){
      Scanner s = new Scanner(System.in);
      
      System.out.println("Enter number 1:");
      int int1 = s.nextInt();
      
      System.out.println("1Enter number 2:");
      int int2 = s.nextInt();
      
      Productify p = new Productify();
      
      System.out.println(p.productifyThis(int1, int2));
      
      
   
   }

}