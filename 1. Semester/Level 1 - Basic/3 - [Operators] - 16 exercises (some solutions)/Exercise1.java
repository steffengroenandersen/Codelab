//Length and breadth of a rectangle are 5 and 7 respectively. 
//Write a program to calculate the area and perimeter of the rectangle.

public class Exercise1{
   public static void main(String[] args){
      double length = 5;
      double breadth = 7;
      
      double area = length * breadth;
      double perimeter = (length*2)+(breadth*2);
      
      System.out.println("Area: " + area);
      System.out.println("Perimeter: " + perimeter);
   }
}