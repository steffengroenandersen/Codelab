public class Exercise1{
   public static void main(String[] args){
   
   // Constructing test subjects
   Person p1 = new Person(1, "Steffen");
   Person p2 = new Person(2, "Amanda");
   Person p3 = new Person(3, "Frederik");
   
   // Constructing GradeSetter
   GradeSetter gs = new GradeSetter();
   
   gs.setGrade(p1);
   gs.setGrade(p1);
   gs.setGrade(p1);
   
   System.out.println(gs.getGrade(p1));



   

   
   }
}