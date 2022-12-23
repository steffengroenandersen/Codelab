// Discount rate 0%  for units under 100
// Discount rate 10% for units between 100-120
// Discount rate 15% for units over 120

import java.util.Scanner;

public class Exercise2{
   public static void main(String[] args){
      
      
      // Get unit price and quantity
      Scanner s = new Scanner(System.in);
      
      System.out.print("Enter unit price: ");
      double unitPrice = s.nextDouble();
      
      System.out.print("Enter quantity: ");
      int unitQuantity = s.nextInt();
      
      // Method 1: Loop
      
      double revenue = 0;
      double discount = 0;
      
      for(int i = unitQuantity; i > 0; i--){
         
         if(i >= 121){
            revenue = revenue + (unitPrice * 0.85);
         } else if(i <= 120 && i >= 101){
            revenue = revenue + (unitPrice * 0.90);
         } else{
            revenue = revenue + unitPrice;
         }
      }
      
      discount = (unitPrice * unitQuantity) - revenue;
      
      System.out.println("$" + revenue);
      System.out.println("$" + discount);
      
      
      

   }
}