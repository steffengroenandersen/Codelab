// Assume light travels at 299,792,458 metres per second, and the star Proxima Centauri
// is 4.2 light years away. My snail travel sat 48 centimetres an hour.
// How many years will it take for my snail to get to Proxima Centauri and back?
// Write a Java program to work it out.

public class Exercise9 {
  public static void main(String[] args) {
    double speed = 48; // speed of the snail in centimeters per hour
    
    double distance = 4.2 * 2; // distance to Proxima Centauri and back in light years
    
    double speedInMetersPerHour = speed / 100; // conversion from centimeters to meters
    
    double speedInMetersPerSecond = speedInMetersPerHour / 3600; // conversion from hours to seconds
    
    double distanceInMeters = distance * 299792458; // conversion from light years to meters
    
    double timeInHours = distanceInMeters / speedInMetersPerSecond; // time in hours
    
    double timeInYears = timeInHours / 8760; // conversion from hours to years
    
    System.out.println("It would take " + timeInYears + " years for the snail to travel to Proxima Centauri and back.");
  }
}
