import java.util.Scanner;

public class Exercise2{
   public static void main(String[] args){
      // Get input from user
      Scanner s = new Scanner(System.in);
      
      System.out.print("The amount of deposit: ");
      double deposit = s.nextDouble();
      
      System.out.print("Yearly interest rate: ");
      double interest = s.nextDouble();
      
      System.out.print("Income tax rate: ");
      double tax = s.nextDouble();
      
      System.out.println("The amount of interest earned in the year:" + ( (deposit*interest) - ((deposit*interest) * tax)    ) );
   }
}