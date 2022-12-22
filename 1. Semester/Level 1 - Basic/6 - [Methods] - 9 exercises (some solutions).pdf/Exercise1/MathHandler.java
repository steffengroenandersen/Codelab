import java.util.Scanner;

public class MathHandler{
   
   public double sumNumbers(){
      //get two numbers from user
      Scanner s = new Scanner(System.in);
      
      System.out.println("Enter number 1: ");
      double n1 = s.nextDouble();
      
      System.out.println("Enter number 2: ");   
      double n2 = s.nextDouble();
      
      return n1 + n2;
   }
}