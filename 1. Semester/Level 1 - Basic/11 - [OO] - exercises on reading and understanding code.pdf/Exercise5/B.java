public class B {
 double b = 123.45;
 public B() {
 System.out.println("-----in the constructor of class B: ");
 System.out.println("b = "+b);
 b = 3.14159;
 System.out.println("b = "+b);
 }
 public void setB( double value) {
 b = value;
 }
 public double getB() {
 return b;
 }
} //class B