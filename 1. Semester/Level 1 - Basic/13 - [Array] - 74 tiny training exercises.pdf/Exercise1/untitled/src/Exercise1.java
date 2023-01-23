// Write a Java program to sort a numeric array and a string array.

import java.util.Arrays;

public class Exercise1 {
    public static void main(String[] args){

        // Create Arrays to be sorted
        int[] numberArray = {10,9,8,7,6,5,4,3,2,1};


        Arrays.sort(numberArray);

        for(int i = 0; i <= numberArray.length-1; i++){
            System.out.println(numberArray[i]);
        }

        // Sort String Array
        String[] countries = {"z","y","x","w","v","u","t","s","r","q","p","o","n","m","l","k","j","i","h","g","f","d","c","b","a"};
        int size = numberArray.length;

        for(int i = 0; i < size; i++){

            for(int j = i + 1; j < countries.length; j++){
                if(countries[i].compareTo(countries[j])>0){
                    String temp = countries[i];
                    countries[i] = countries[j];
                    countries[j] = temp;
                }
            }

        }
        System.out.print(Arrays.toString(countries));



    }
}
