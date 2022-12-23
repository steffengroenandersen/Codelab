import java.util.Scanner;

public class ScannerExperiments {
   public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      // Ask name, surname, age and weight. Print the result.
      
      String firstName = s.next();
      String lastName = s.next();
      int age = s.nextInt();
      double weight = s.nextDouble();
      
      System.out.println("My name is " + firstName + " " + lastName + " and my age is " + age + "." + "\nDon't tell anyone, but I weigh " + weight + ".");
      
   }
}