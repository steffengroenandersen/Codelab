import java.util.Scanner;

public class Exercise6{
   public static void main(String[] args){
      // Get input from user
      Scanner s = new Scanner(System.in);
      
      System.out.println("Enter years:");
      int years = s.nextInt();
      
      int months = 12;
      
      System.out.println("Months in that period: " + years * months);
      
      
   }
}