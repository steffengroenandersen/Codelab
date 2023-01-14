import java.util.Random;

public class TestCompany {
    public static void main(String[] args){

        // Constructing Random Class
        Random r = new Random();

        int z = r.nextInt(10)+1;

        int a = 4;
        int b = 7;

        if(z < b && z > a){
            System.out.println("The number is in the middle of the range." + z);
        } else{
            System.out.println("The number is not in the middle of the range." + z);
        }

        // String comparison

        String word1 = "Cat";
        String word2 = "Dog";

        if(word1 == word2){
            System.out.println("The words are the same.");
        } else{
            System.out.println("The words are not the same.");
        }

        System.out.println(word1);


    }
}
