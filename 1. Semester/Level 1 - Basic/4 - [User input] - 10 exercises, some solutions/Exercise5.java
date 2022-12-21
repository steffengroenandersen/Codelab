//Take side of a square from user and print area and perimeter of it. 

import java.util.Scanner; 

public class Exercise5{
   public static void main(String[] args){
      //get side from user
      Scanner s = new Scanner(System.in);
      
      System.out.println("Enter one side of the square:");
      int side = s.nextInt();
      
      //calculate area and perimeter
      int area = side * 2;
      int perimeter = side * 4;
      
      //print information
      System.out.println("Area: " + area);
      System.out.println("Perimeter: " + perimeter);      
   }
}