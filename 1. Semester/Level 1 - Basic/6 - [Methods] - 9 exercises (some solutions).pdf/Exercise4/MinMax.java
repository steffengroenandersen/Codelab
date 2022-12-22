import java.util.Scanner;

public class MinMax{
   
   public void minMaxer(){
      Scanner s = new Scanner(System.in);
      
      System.out.println("Enter 3 numbers:");
      int int1 = s.nextInt();
      int int2 = s.nextInt();
      int int3 = s.nextInt();
      
      int min;
      int max;
      
      //find minimum value
      if(int1 < int2 && int1 < int3){
         min = int1;
      } else if(int2 < int1 && int2 < int3){
         min = int2;
      } else{
         min = int3;
      }
      
      //find maximum value
      if(int1 > int2 && int1 > int3){
         max = int1;
      } else if(int2 > int1 && int2 > int3){
         max = int2;
      } else{
         max = int3;
      }
      
      
      
      
      System.out.println("Min: " + min);
      System.out.println("Max: " + max);
   
   }   

}