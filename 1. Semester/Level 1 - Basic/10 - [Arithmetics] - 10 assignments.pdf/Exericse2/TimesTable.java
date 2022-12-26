public class TimesTable{
   
   public void printTimeTable(int n, int i){
      if(i > 10){
         return;
      }
      
      System.out.println(i + " x " + n + " = " + n*i);
      printTimeTable(n, i + 1);
   }
}