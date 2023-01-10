public class A{
   int a = 100;
   
   public A(){
      System.out.println("You've just called Class A's BASE Constructor.");
      System.out.println("Variable a = " + a);
      System.out.println();
   }
   
   public A(int b){
      System.out.println("You've just called Class A's ENHANCED Constructor");
      a = b;
      System.out.println("Variable a = " + a);
      System.out.println();
   }
}