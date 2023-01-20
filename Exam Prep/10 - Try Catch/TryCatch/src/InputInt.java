import java.util.InputMismatchException;
import java.util.Scanner;

public class InputInt {

    public int inputInteger(){
        Scanner s = new Scanner(System.in);
        boolean runMethod = true;

        while(runMethod){
            try{
                System.out.println("Input Integer:");
                int input = s.nextInt();
                return input;

            } catch (InputMismatchException e){
                System.out.println("Wrong input type. Try again.");
                s.next();
                e.printStackTrace();



            } finally {
                //System.out.println("Returning to base.");
            }
        }

        return 0;
    }

}

