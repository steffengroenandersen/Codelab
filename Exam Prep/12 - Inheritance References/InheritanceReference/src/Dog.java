public class Dog extends Animal{

    String sound = "Woof!";

    // Methods
    public void woof(){
        System.out.println("Woof!");
    }

    @Override
    public void shout (){
        System.out.println(sound);
    }


}
