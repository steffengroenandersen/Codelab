public class FibonacciSolver{


   public int fibonacciN(int i, int start, int next){
      
      // Calculating new fibonacci
      int fibonacciNumber = start + next;
      
      // Setting variables up for next iteration
      i = i - 1;
      start = next;
      next = fibonacciNumber;
      
      // Testing if we found the nth number
      
      if(i == 1 || i == 0){
         return fibonacciNumber;
      } else {
         return fibonacciN(i, start, next);
      }
      
      
      
   }
   
}