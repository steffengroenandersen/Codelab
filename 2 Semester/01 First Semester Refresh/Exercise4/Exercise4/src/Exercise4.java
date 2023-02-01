public class Exercise4 {
    public static void main(String[] args){

        int number = 5;
        String string = "?";

        printSquare(number, string);

    }

    public static void printSquare(int number, String string){
        for(int i = 0; i < number; i++){
            for(int j = 0; j < number; j++){
                System.out.print(string + " ");
            }
            System.out.println();
        }
    }
}
