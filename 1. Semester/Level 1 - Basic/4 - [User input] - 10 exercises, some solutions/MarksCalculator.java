import java.util.Scanner;

public class MarksCalculator {
  public static void main(String[] args) {
    // Create a Scanner object to read input from the keyboard
    Scanner scanner = new Scanner(System.in);

    // Get the marks for each subject
    System.out.print("Enter the marks for subject 1: ");
    int subject1 = scanner.nextInt();
    System.out.print("Enter the marks for subject 2: ");
    int subject2 = scanner.nextInt();
    System.out.print("Enter the marks for subject 3: ");
    int subject3 = scanner.nextInt();

    // Calculate the total marks
    int totalMarks = subject1 + subject2 + subject3;

    // Calculate the percentage marks
    double percentage = (totalMarks / 300.0) * 100;

    // Print the results
    System.out.println("Total marks: " + totalMarks);
    System.out.println("Percentage: " + percentage);
  }
}
