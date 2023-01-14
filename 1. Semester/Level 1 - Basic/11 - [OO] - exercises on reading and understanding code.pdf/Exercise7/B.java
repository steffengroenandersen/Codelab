<<<<<<< HEAD
public class B extends A {
 private int a = 123;
 public B() {
 a = 2222;
 }
 public void rollBackA () {
 a = super.getA();
 }
 public void setA( int value) {
 a = value;
 }
 public int getA() {
 return a;
 }
} //class B
=======
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
>>>>>>> main
