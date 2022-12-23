import java.util.Scanner;

public class GradeSetter{
   
   Scanner s = new Scanner(System.in);
   
   public void setGrade(Person p){
      // Ask for what type of grade
      System.out.println("What type of grade would you like to set?\n   1. Quiz\n   2. Mid-term\n   3. Final");
      int gradeType = s.nextInt();
      
      // Ask what the grad is
      System.out.println("Enter grade (0-100)");
      double grade = s.nextDouble();
      
      // Based on type of grade and value, set it
      if(gradeType == 1){
         p.setQuiz(grade);
      } else if(gradeType == 2){
         p.setMidTerm(grade);
      } else if(gradeType == 3){
         p.setFinal(grade);
      } else{
         System.out.println("Wrong input.");
      }
   }
   
   public String getGrade(Person p){
      double sum = (p.getQuiz() + p.getMidTerm() + p.getFinal());
      double avg = sum / 300 * 100;
      
      
      if(avg >= 90){
         return "A";
      } else if(avg >= 70){
         return "B";
      } else if(avg >= 50){
         return "C";
      } else if(avg < 50){
         return "F";
      } else{
         return "Something went wrong.";
      }
      
   }
}