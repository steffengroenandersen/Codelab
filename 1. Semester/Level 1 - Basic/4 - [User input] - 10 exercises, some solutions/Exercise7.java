//Take two different string input and print them in same line. E.g.- 

import java.util.Scanner;

public class Exercise7{
   public static void main(String[] args){
      //get strings from user
      Scanner s = new Scanner(System.in);
      
      System.out.println("Enter two strings:");
      String str1 = s.next();
      String str2 = s.next();
      
      //concatenate strings
      String str3 = str1.concat(str2);
      
      //print results
      System.out.println(str3); 
   }
}