//Take 3 inputs from user and check:
//all are equal
//any of two are equal
//( use && || ) 

import java.util.Scanner;

public class Exercise8{
   public static void main(String[] args){
      //take inputs from user
      Scanner s = new Scanner(System.in);
      
      System.out.println("Enter three string values:");
      String str1 = s.next();
      String str2 = s.next();
      String str3 = s.next();
      
      //check if all are equal
      if(str1.equals(str2) && str1.equals(str3)){
         System.out.println("All strings are equal!");
      }
      
      //check if two are equal
      if(str1.equals(str2) && !str1.equals(str3) || str1.equals(str3) && !str1.equals(str2)
      || str2.equals(str1) && !str2.equals(str3) || str2.equals(str3) && !str2.equals(str1)
      
      ){
         System.out.println("Only two strings are equal!");
      }
      
   }
}