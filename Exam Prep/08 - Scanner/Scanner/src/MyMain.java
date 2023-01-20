import java.util.InputMismatchException;
import java.util.Scanner;

public class MyMain {
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);

        boolean isInputCorrect = false;

        while(!isInputCorrect){

            int age;
            System.out.println("Enter age:");

            try{
                age = s.nextInt();
                System.out.println("Success!");
                isInputCorrect = true;
            } catch(InputMismatchException IME){
                System.out.println("Wrong input! Try again.");
                s.next();
            }
        }
    }
}
