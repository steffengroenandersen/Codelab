public class Fruit {
    // Variables
    String name;
    int weight = 1;

    // Constructors
    public Fruit(String name){
        this.name = name;
    }

    // Methods
    public void showFruitName(){ // prints the fruit name
        System.out.println(name);
    }

    public void showFruitWeight(){
        System.out.println(weight);
    }
}
