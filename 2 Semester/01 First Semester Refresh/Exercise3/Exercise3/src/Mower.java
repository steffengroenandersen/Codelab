public class Mower {
    public static int daysToGrassMowing(double heightInCm, double whenToMowInCm){
        int days = 0;

        double currentLength = heightInCm + 0.8;

        while (currentLength < whenToMowInCm){
            days++;
            currentLength = currentLength + 0.8;
        }

        return days;

    }
}
