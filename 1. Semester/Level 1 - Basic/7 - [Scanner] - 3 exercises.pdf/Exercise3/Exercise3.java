import java.util.Scanner;

public class Exercise3{
   public static void main(String[] args){
      Scanner s = new Scanner(System.in);
      
      // Ask number of boxes
      System.out.println("Enter number of boxes:");
      int boxNo = s.nextInt();
      
      // Ask price per box
      System.out.println("Enter price per box:");
      double boxPrice = s.nextDouble();
      
      // Ask the amount the customer gives
      System.out.println("Enter customer recievable:");
      double customerAmount = s.nextDouble();
      
      // Calculate the total and rest - and print
      System.out.println("Total: " + boxNo * boxPrice);
      System.out.println("Rest: " + (customerAmount - (boxNo * boxPrice)));
  
   
   }
}