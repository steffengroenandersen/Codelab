//Print the following patterns using loop :

public class Exercise2{
   public static void main(String[] args){
      //printing pattern a
      
      System.out.println("##################");     
      System.out.println("Printing pattern a.");
      for(int i = 1; i < 6; i++){
         for(int j = 1; j < i; j++){
            System.out.print("*");
         }
         System.out.println();
      }
      System.out.println();
      System.out.println("##################");      
      
      //printing pattern b
      
      System.out.println("##################");
      System.out.println("Printing pattern b.");
      
      for(int i = 1; i <=2; i++){
         //print spaces
         for(int j = 3; j <= 0; j = 3 - j){
            System.out.println("-");
         }
 
         //print stars
         
         //move to new line
         System.out.println();      
      
      }

            
   }
} 