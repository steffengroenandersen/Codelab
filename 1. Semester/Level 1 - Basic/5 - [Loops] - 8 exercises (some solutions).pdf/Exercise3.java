//Print multiplication table of 24, 50 and 29 using loop. 

public class Exercise3{
   public static void main(String[] args){
      int multiple = 24;
      
      for(int i = 1; i <= 10; i++){
         System.out.println(multiple + " * " + i + "\t= " + multiple * i);
      }
      System.out.println();
      
      multiple = 50;
      for(int i = 1; i <= 10; i++){
         System.out.println(multiple + " * " + i + "\t= " + multiple * i);
      }
      System.out.println();
      
      multiple = 29;
      for(int i = 1; i <= 10; i++){
         System.out.println(multiple + " * " + i + "\t= " + multiple * i);
      }
   }

}
