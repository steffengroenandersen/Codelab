// Multiplication of non-negative integers can be defined recursively in terms of addition:
// mult(n,0) = 0
// mult(n,m+1) = n+mult(n+m)
// Write a class which has a method mult which implements such a function.

public class Excercise2{
   public static void main(String[] args){
      
      int int1 = 2;
      int int2 = 2;
      
      int answer = mult(int1, int2);
      
      System.out.println(answer);      
   }
   
   // Multiplication method
   public static int mult(int n, int m){
      if(m == 0){
         return 0;
      }
      
      return n + mult(n,m-1);   
   }

}