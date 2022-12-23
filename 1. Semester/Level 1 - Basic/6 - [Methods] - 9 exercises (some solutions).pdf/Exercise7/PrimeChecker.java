public class PrimeChecker{
   //method that determines if int is prime
   public boolean primeCheck(int num){
      
      boolean flag = false;
      for (int i = 2; i <= num / 2; ++i) {
      
      // condition for nonprime number
      if (num % i == 0) {
         flag = true;
         break;
      }
    }

      if (!flag){
         return true;
      }
      else{
         return false;
      }
   }
   
}