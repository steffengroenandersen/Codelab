public class StarPattern {
    public static void main(String[] args){

        // Print Increasing Left Sided Triangle

        int n = 5;
        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
