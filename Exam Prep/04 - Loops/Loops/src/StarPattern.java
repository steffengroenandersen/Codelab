public class StarPattern {
    public static void main(String[] args){
        int n = 5;

        // Print a square
        System.out.println();
        System.out.println("Print a square.");
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        // Print a triangle
        System.out.println();
        System.out.println("Print a triangle.");

        int m = 5;
        for(int i = 1; i <= m; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        // Print a decreasing triangle
        System.out.println();
        System.out.println("Print a decreasing triangle.");

        int b = 5;
        for(int i = 1; i <= b; i++){
            for(int j = 5; j >= i; j--){
                System.out.print("* ");
            }
            System.out.println();
        }


        // Print a Right Sided Triangle
        System.out.println();
        System.out.println("Print a Ride Sided Triangle.");

        int a = 5;
        for(int i = 1; i <= a; i++){

            // Print spaces
            for(int j = i; j <= a; j++){
                System.out.print("  ");
            }

            // Print stars
            for(int j = 1; j <= i; j++){
                System.out.print(" *");
            }

            System.out.println();
        }



    }
}
