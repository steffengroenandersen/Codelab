public class Bakery {
    public static void main(String[] args){

        // Create two Bread objects
        Bread myBread1 = new Bread();
        Bread myBread2 = new Bread("Danish", 30);

        // Setting myBread1 variables
        myBread1.setName("Muffin");
        myBread1.setPrice(2);

        System.out.println("Name: " + myBread1.getName() + "\nPrice: " + myBread1.getPrice());
        System.out.println("myBread2: " + "\nName: " + myBread2.getName() + "\nPrice: " + myBread2.getPrice());


        //Bread.breadCnt = 2;
        //System.out.println(Bread.breadCnt);
    }
}
