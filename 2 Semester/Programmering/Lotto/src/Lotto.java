import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Lotto {
    public static void main(String[] args){

        // Give 7 random numbers to a lotto coupon and 2 extra numbers
        ArrayList<Set> coupons = new ArrayList<>();

        // Test coupons
        Set<Integer> testCoupon1 = new HashSet();
        testCoupon1.add(10);
        testCoupon1.add(2);
        testCoupon1.add(3);
        testCoupon1.add(4);
        testCoupon1.add(5);
        Set<Integer> testCoupon2 = new HashSet();
        testCoupon2.add(1);
        testCoupon2.add(20);
        testCoupon2.add(3);
        testCoupon2.add(4);
        testCoupon2.add(5);
        Set<Integer> testCoupon3 = new HashSet();
        testCoupon3.add(1);
        testCoupon3.add(2);
        testCoupon3.add(3);
        testCoupon3.add(4);
        testCoupon3.add(5);

        coupons.add(testCoupon1);
        coupons.add(testCoupon2);

        System.out.println("Is the following coupon unique?");
        System.out.println(checkAllCouponUniqueness(coupons, testCoupon3));



        // Find 7 winner numbers and 2 extra numbers

        // Control a list of coupons for the winner
    }

    public static ArrayList<Set> createCoupon(ArrayList<Set> coupons){

        // Create new coupon
        Set coupon = new HashSet();
        Random r = new Random();
        while(coupon.size() < 7){
            coupon.add(r.nextInt(100)+1);
        }

        // Check if coupon is unique


        // Add coupon to list and return

        coupons.add(coupon);
        return coupons;
    }

    public static boolean checkAllCouponUniqueness(ArrayList<Set> coupons, Set coupon){

        for(Set coupons1 : coupons){
            System.out.println(coupons1);
            System.out.println(coupon);

            if(!checkOneCouponUniqueness(coupons1, coupon)){
                return false;
            }
        }
        return true;
    }

    public static boolean checkOneCouponUniqueness(Set coupon1, Set coupon2){


        Set<Integer> temp1 = coupon1;
        Set<Integer> temp2 = coupon2;

        temp1.removeAll(temp2);

        if(temp1.size() == 0){
            return false;
        }

        return true;

    }


}
