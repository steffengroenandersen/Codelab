public class Banana extends Fruit{

    // Constructors
    public Banana(String name){
        super(name);
    }

    // Methods
    public void showFruitWeight(){
        System.out.println("The Banana weight is " + super.weight + " grams.");
        super.showFruitWeight();
        super.showFruitWeight();
    }
}
