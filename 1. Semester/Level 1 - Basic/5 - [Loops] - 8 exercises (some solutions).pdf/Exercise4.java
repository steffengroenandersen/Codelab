//Print ASCII values and their equivalent characters.
//ASCII value vary from 0 to 255. 

public class Exercise4{
   public static void main(String[] args){
      int ascii = 0;
      
      char letter;
      
      //System.out.println(letter);
      
      
      for(int i = 0; i <= 255; i++){
         ascii = i;
         
         letter = (char)ascii;
         System.out.println("Letter #" + i + " = " + letter);
      }
   }
}