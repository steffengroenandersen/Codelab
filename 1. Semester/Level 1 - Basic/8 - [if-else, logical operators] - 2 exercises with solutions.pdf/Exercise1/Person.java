public class Person{
   // Variables
   private int id;
   private String name;
   
   private Quiz quizScore = new Quiz();
   private MidTerm midTermScore = new MidTerm();
   private Final finalScore = new Final();
   
   // Constructors
   
   public Person(int id, String name){
      this.id = id;
      this.name = name;
   }
   
   // Methods
   
   // Methods for Quiz
   public void setQuiz(double score){
      this.quizScore.setScore(score);
   }
   
   public double getQuiz(){
      return this.quizScore.getScore();
   }
   
   // Methods for Mid-term
   public void setMidTerm(double score){
      this.midTermScore.setScore(score);
   }
   
   public double getMidTerm(){
      return this.midTermScore.getScore();
   }
   
   // Methods for Final
   public void setFinal(double score){
      this.finalScore.setScore(score);
   }
   
   public double getFinal(){
      return this.finalScore.getScore();
   }
   
}