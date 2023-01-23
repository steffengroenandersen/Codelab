// Write a Java program to print the following grid

public class Exercise3 {
    public static void main(String[] args){

        String[] stringArray = new String[10];

        for(int i = 0; i < stringArray.length-1; i++){
            stringArray[i] = "_ ";
        }

        int rows = 10;
        int columns = 9;

        for(int i = 1; i <= rows; i++){
            for(int j = 0; j < columns; j++){
                System.out.print(stringArray[j]);
            }
            System.out.println();
        }


    }
}
