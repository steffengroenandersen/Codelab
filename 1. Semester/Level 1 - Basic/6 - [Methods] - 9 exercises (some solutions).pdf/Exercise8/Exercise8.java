//Write a program which will ask the user to
//enter his/her marks (out of 100).
//Define a method that will display grades 
//according to the marks entered as below: 

public class Exercise8{
   public static void main(String[] args){
   
   //construct test persons
   Person p1 = new Person();
   
   GradeSetter gs = new GradeSetter();
   
   gs.setGrade(p1);
   
   System.out.println(p1.getMark());
   System.out.println(p1.getGrade());
   
   }
}