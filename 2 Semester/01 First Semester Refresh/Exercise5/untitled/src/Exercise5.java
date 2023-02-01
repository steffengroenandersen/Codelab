import java.util.ArrayList;
import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args){
        // Create an input field and String variable
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please type your sentence");
        String input = scanner.nextLine();

        System.out.println("Before: " + input);

        System.out.println("After: " + properCasing(input));


    }
    // Create a method that accepts that
    public static String properCasing(String input){

        Scanner scanner = new Scanner(input);
        ArrayList<String> wordList = new ArrayList<>();

        // Method should divide all words into separate fields
        int x = 0;
        String word;

        while(scanner.hasNext()){
            wordList.add(scanner.next());

            if(wordList.get(x).equals(wordList.get(x).toUpperCase()) && wordList.get(x).length() > 3) {
                //System.out.println(wordList.get(x) + " is only uppercase.");

            } else if(wordList.get(x).length() > 3){
                //System.out.println(wordList.get(x) + " is not only uppercase and more than 3 in length.");

                // Change to correct casing
                char[] characters = new char[wordList.get(x).length() ];
                //System.out.println("Array size: " + characters.length);

                for(int i = 0; i < characters.length; i++) {
                    if (i == 0) {
                        characters[i] = Character.toUpperCase(wordList.get(x).charAt(i));
                        //System.out.println(characters[i]);
                    } else {
                        characters[i] = Character.toLowerCase(wordList.get(x).charAt(i));
                        //System.out.println(characters[i]);
                    }
                }

                // Create new output String
                String output = String.valueOf(characters);
                wordList.set(x, output);

            } else if(wordList.get(x).length() <= 3) {
                //System.out.println(wordList.get(x) + " is less than or equal to 3 in length.");
                word = wordList.get(x).toLowerCase();
                wordList.set(x, word);
                //System.out.println(word);
            }

            x++;

        }


        // replace the string contents

        String output = String.join(" ", wordList);

        // collect the fields into 1 string

        // return s string
        return output;
    }

}
