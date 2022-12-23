import java.util.Scanner;

public class GradeSetter{
   
   public void setGrade(Person p){
      //get mark from user
      Scanner s = new Scanner(System.in);
      
      boolean isMarkCorrect = false;
      int mark = -99;
      
      while(!isMarkCorrect){
         System.out.println("Enter mark (0-100).");
         mark = s.nextInt();
         p.setMark(mark);
         
         if(mark > 0 && mark <= 100){
            isMarkCorrect = true;
         }
      }
      
      
      
      
      if(mark >= 91){
         p.setGrade(Grade.AA);
      } else if(mark < 91 && mark >= 81){
         p.setGrade(Grade.AB);
      } else if(mark < 81 && mark >= 71){
         p.setGrade(Grade.BB);
      } else if(mark < 71 && mark >= 61){
         p.setGrade(Grade.BC);
      } else if(mark < 61 && mark >= 51){
         p.setGrade(Grade.CD);
      } else if(mark < 51 && mark >= 41){
         p.setGrade(Grade.DD);
      } else if(mark <= 41){
         p.setGrade(Grade.Fail);
      }
   
   }

   

   
}