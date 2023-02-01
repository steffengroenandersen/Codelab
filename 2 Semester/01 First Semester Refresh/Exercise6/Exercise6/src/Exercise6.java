import java.util.ArrayList;
import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int iteration = 0;
        ArrayList<String> words = new ArrayList<>();

        while(iteration < 5){
            System.out.println("Write your word: ");
            words.add(scanner.next());
            iteration++;
        }

        words.sort((s1, s2) -> s2.compareTo(s1));

        for(String word : words){
            System.out.println(word);
        }


    }
}
