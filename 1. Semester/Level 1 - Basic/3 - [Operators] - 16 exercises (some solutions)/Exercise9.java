//If the marks of Robert in three subjects 
//are 78,45 and 62 respectively (each out of 100 ),
//write a program to calculate his total marks and percentage marks.

public class Exercise9{
   public static void main(String[] args){
      int mark1 = 78;
      int mark2 = 45;
      int mark3 = 62;
      
      System.out.println("Total marks: " + (mark1+mark2+mark3));
      System.out.println("Mark1: " + (((double)mark1/100)*100) + "%");
      System.out.println("Mark1: " + (((double)mark2/100)*100) + "%");
      System.out.println("Mark1: " + (((double)mark3/100)*100) + "%");              
   }
}