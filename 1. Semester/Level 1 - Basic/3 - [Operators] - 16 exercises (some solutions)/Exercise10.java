//Suppose the values of variables 'a' and 'b' are 6 and 8 respecrtively,
//write two programs to swap the values of the two variables.

//1 - first program by using a third variable

//2 - second program without using any third variable 

//( Swapping means interchanging the values of the two
//variables E.g.- If entered value of x is 5 and y is 10
//then after swapping the value of x and y should
//become 10 and 5 respectively.)

public class Exercise10{
   public static void main(String[] args){
      //solution 1
      int a = 6;
      int b = 8;
      int swap = 0;
      
      swap = a;
      a = b;
      b = swap;
      
      //solution 2
      a = 6;
      b = 8;
      
      b = b-a; //result: 2
      a = b+a; //reuslt: 8
      b = -(b-a); //result: 6
      
              
   }
}