public class OOPExercises{
   public static void main(String[] args){
      A objA = new A();
      B objB = new B();
      
      System.out.println("in main(): ");
      System.out.println("ObjA.a = " + objA.getA());
      System.out.println("objB.b = " + objB.getB());
      
      objA.setA(222);
      objB.setB(333.33);

      System.out.println("objA.a = " + objA.getA());
      System.out.println("objB.b = " + objB.getB());

   }
}