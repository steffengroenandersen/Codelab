import java.util.Scanner;

public class InputString {

    // Methods
    public String inputString(){
        Scanner s = new Scanner(System.in);

        boolean runMethod = true;

        while(runMethod){

            try{
                String input = s.next();
                return input;
            } catch(Exception e){
                System.out.println("Wrong format. Try again.");
                e.printStackTrace();
                s.next();

            }
        }

        return "hej";




    }
}
