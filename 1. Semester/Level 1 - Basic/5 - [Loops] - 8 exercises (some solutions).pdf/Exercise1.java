//Take 10 integers from keyboard using loop 
//and print their average value on the screen. 

import java.util.Scanner;

public class Exercise1{
   public static void main(String[] args){
      //get input from user
      Scanner s = new Scanner(System.in);
      double input = 0;
      double total = 0;
      double average = 0;
      
      for(int i = 1; i < 11; i++){
         input = s.nextDouble();
         total = total + input;
         average = total / i;
         
         System.out.println(input);
         System.out.println(total);
         System.out.println(average);
      }
   }
}