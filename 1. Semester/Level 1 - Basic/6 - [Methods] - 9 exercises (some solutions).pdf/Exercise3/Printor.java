import java.util.Scanner;

public class Printor{
   
   public void printThis(){
      Scanner s = new Scanner(System.in);
      
      System.out.println("Circumference: " + s.nextInt());
      System.out.println("Area: " + s.nextInt());
      System.out.println("Radius: " + s.nextInt());   
   }

}