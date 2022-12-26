import java.util.Scanner;

public class Exercise2{
   public static void main(String[] args){
      
      TimesTable tt = new TimesTable();
      
      // Get input from user
      Scanner s = new Scanner(System.in);
      
      System.out.println("Enter number:");
      int number = s.nextInt();
      
      tt.printTimeTable(number, 1);
      
      
   }
}