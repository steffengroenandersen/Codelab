public class Exercise10 {
  public static void main(String[] args) {
    double lettucePerDay = 2; // amount of lettuce the snail eats per day in grams
    double speed = 48; // speed of the snail in centimeters per hour
    double distance = 4.2 * 2; // distance to Proxima Centauri and back in light years
    double speedInMetersPerHour = speed / 100; // conversion from centimeters to meters
    double speedInMetersPerSecond = speedInMetersPerHour / 3600; // conversion from hours to seconds
    double distanceInMeters = distance * 299792458; // conversion from light years to meters
    double timeInHours = distanceInMeters / speedInMetersPerSecond; // time in hours
    double timeInDays = timeInHours / 24; // conversion from hours to days
    double lettuceNeeded = lettucePerDay * timeInDays; // total amount of lettuce needed in grams
    double lettuceNeededInTons = lettuceNeeded / 1000000; // conversion from grams to metric tons
    System.out.println("The snail will need " + lettuceNeededInTons + " metric tons of lettuce for the trip.");
  }
}
