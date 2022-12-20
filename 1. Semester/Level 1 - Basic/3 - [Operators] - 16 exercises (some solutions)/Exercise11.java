//Write a program to convert Fahrenheit into Celsius. 

public class Exercise11{
   public static void main(String[] args){
      double celcius = 1;
      double fahrenheit = 33.8;
      
      System.out.println(celciusToFahrenheit(celcius));
      System.out.println(fahrenheitToCelcius(fahrenheit));
                         
   }
   
   //celcius to fahrenheit
   public static double celciusToFahrenheit(double celcius){
      double fahrenheit = (celcius * 1.8)+32;
      return fahrenheit;
   }
   
   //fahrenheit to  celcius
   public static double fahrenheitToCelcius(double fahrenheit){
      double celcius = (fahrenheit-32)/1.7777777777779;
      return celcius;
   }
}