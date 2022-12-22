//Print the following patterns using loop :

public class Exercise2{
   public static void main(String[] args){
      //printing pattern a
      
      System.out.println("Printing pattern a.");
      for(int i = 1; i < 6; i++){
         for(int j = 1; j < i; j++){
            System.out.print("*");
         }
         System.out.println();
      }
   }
} 