import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args){
        // Ask for input
        Scanner s = new Scanner(System.in);

        System.out.println("How high is your grass now?");
        double heightInCm = s.nextDouble();

        System.out.println("How high is it allowed to be?");
        double whenToMowInCm = s.nextDouble();

        System.out.println(Mower.daysToGrassMowing(heightInCm, whenToMowInCm));
    }
}
