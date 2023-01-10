public class OOPExercises{
   public static void main(String[] args){
      A objA = new A();
      System.out.println("in main(): ");
      System.out.println("objA.A = " + objA.getA());
      objA.setA(222);
      System.out.println("objA.A = " + objA.getA()); 
      
      
      double result = objA.getA();
      System.out.println(result);     
   }
}