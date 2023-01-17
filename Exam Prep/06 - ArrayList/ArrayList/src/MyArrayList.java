import java.util.ArrayList;

public class MyArrayList {
    public static void main(String[] args){

        Dog dog = new Dog();
        Cat cat = new Cat();


        String a = "true";

        ArrayList<Animal> animalArrayList = new ArrayList<>();
        animalArrayList.add(dog);
        animalArrayList.add(cat);

        for(Animal animals : animalArrayList){
            if(animals instanceof Animal){
                animals.shout();
            }
        }

    }
}