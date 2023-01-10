public class B extends A{
   int a = 50;
   
   public B(){
      System.out.println("You've just called Class B's BASE Constructor.");
      System.out.println("Variable a = " + a);
      System.out.println();
   }
   
   public B(int b){
      System.out.println("You've just called Class B's ENHANCED Constructor.");
      a = b;
      System.out.println("Variable a = " + a);
      System.out.println();
   }
}