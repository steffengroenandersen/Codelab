import java.util.Scanner;

public class Exercise1{
   public static void main(String[] args){
      // Variables
      
      double DollarToPenceSterling = 0.01207;
      
      // Get input from user
      Scanner s = new Scanner(System.in);
      
      System.out.println("Enter USD amount:");
      double dollar = s.nextDouble();
      
      System.out.println("USD amount contains " + dollar / DollarToPenceSterling);      

   }
}