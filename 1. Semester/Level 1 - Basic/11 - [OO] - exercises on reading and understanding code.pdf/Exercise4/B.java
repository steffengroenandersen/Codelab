public class B extends A{
   static private int a = 222;
   
   public static void main(String[] args){
      System.out.println("in main(): ");
      System.out.println("a = " + a);
      a = 123;
   }
}