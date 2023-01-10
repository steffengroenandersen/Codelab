public class C extends B{
   int a = 250;
   
   public C(){
      System.out.println("You've just called Class C's BASE Constructor.");
      System.out.println("Variable a = " + a);
      System.out.println();
   }
   
   public C(int b){
      System.out.println("You've just called Class C's ENHANCED Constructor.");
      a = b;
      System.out.println("Variable a = " + a);
      System.out.println();
   }
}