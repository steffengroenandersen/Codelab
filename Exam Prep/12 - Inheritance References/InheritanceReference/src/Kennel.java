import java.util.ArrayList;

public class Kennel {
    public static void main(String[] args){

        Animal animal1 = new Dog();
        Cat cat1 = new Cat();

        cat1.meow();

        animal1.shout();

        ArrayList<Animal> animalList = new ArrayList<>();

        animalList.add(animal1);
        animalList.add(cat1);

        for(Animal a : animalList){
            if(a instanceof Cat){
                ((Cat) a).meow();
            }
        }

    }
}
