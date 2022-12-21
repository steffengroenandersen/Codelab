//Take two integer inputs from user.
//First calculate the sum of two then product of two.
//Finally, print the sum and product of both obtained results. 

import java.util.Scanner;

public class Exercise2{
   public static void main(String[] args){
      //get two integers
      Scanner s = new Scanner(System.in);
      int inputOne = s.nextInt();
      int inputTwo = s.nextInt();
      
      //calculate sum
      int sum = inputOne + inputTwo;
      
      //calculate product
      int product = inputOne * inputTwo;
      
      //print sum and product
      System.out.println("Sum: " + sum);
      System.out.println("Product: " + product);
   
   }
}