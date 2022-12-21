//If the marks of Robert in three subjects are entered through keyboard (each out of 100 ), 
//write a program to calculate his total marks and percentage marks.

import java.util.Scanner;

public class Exercise10{
   public static void main(String[] args){
      //get three marks from Robert
      Scanner s = new Scanner(System.in);
      
      boolean isInputCorrect = false; //boolean to determine if we have got the correct marks
      int mark1 = 0;
      int mark2 = 0;
      int mark3 = 0;
      while(!isInputCorrect){
         
         System.out.println("Enter mark 1:");
         mark1 = s.nextInt();
         
         System.out.println("Enter mark 2:");
         mark2 = s.nextInt();
         
         System.out.println("Enter mark 3:");
         mark3 = s.nextInt();
         
         if(mark1 > 0 && mark1 < 100 && mark2 > 0 && mark2 < 100 && mark3 > 0 && mark3 < 100){
            System.out.println("Inputs entered correct");
            isInputCorrect = true;
            
         } else {
            System.out.println("Inputs entered wrong. Try again.");
         }

                  
      
      } //end of while loop
      
      //calculate total marks and percentages
      int totalMark = mark1 + mark2 + mark3;
      
      double percentageMark1 = (double)mark1 / 100 * 100;
      double percentageMark2 = (double)mark2 / 100 * 100;
      double percentageMark3 = (double)mark3 / 100 * 100;
      
      //print results
      System.out.println("Total marks:" + totalMark);
      
      System.out.println("Mark1 Percentage: " + percentageMark1 + "%");
      System.out.println("Mark2 Percentage: " + percentageMark2+ "%");
      System.out.println("Mark3 Percentage: " + percentageMark3 + "%");
   }
}