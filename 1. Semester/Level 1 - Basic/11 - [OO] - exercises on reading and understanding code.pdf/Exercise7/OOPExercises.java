public class OOPExercises {
 static int a = 555;

 public static void main(String[] args) {
 A objA = new A();
 B objB = new B();
 System.out.println("in main(): ");
 System.out.println("a = "+a);
 a = 444;
 System.out.println("objB.a = "+objB.getA());
 objA.setA (77777);
 objB.rollBackA();
 System.out.println("After roll back -----");
 System.out.println("a = "+a);
 System.out.println("objA.a = "+objA.getA());
 System.out.println("objB.a = "+objB.getA());
 }
}