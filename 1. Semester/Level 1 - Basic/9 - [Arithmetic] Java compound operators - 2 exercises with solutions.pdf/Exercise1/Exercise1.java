import java.util.Scanner;

public class Exercise1{
   public static void main(String[] args){
      // Get two inputs from user
      Scanner s = new Scanner(System.in);
      
      System.out.print("Enter value a: ");
      double a = s.nextDouble();
      System.out.println("The value of a before adding is: " + a);
      
      System.out.print("Enter value b: ");
      double b = s.nextDouble();

      // Assign new value to a
      a = a + b;
      
      System.out.println("The value of a after adding: " + a);
   }
}