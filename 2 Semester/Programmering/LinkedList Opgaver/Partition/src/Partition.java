import java.util.Iterator;
import java.util.LinkedList;
import java.lang.System;

public class Partition {
    public static void main(String[] args) {

        int elementValue = 10;

        System.out.println("Original List: ");
        System.out.println(numbers);

        partition(numbers, elementValue);

        System.out.println("New List:");
        System.out.println(numbers);

    }

    static LinkedList<Integer> numbers = new LinkedList<>() {{
        add(15);
        add(1);
        add(6);
        add(12);
        add(-3);
        add(4);
        add(8);
        add(21);
        add(2);
        add(30);
        add(-1);
        add(9);
    }};

    public static void partition(LinkedList<Integer> numbers, int elementValue){

        // Create iterator, LinkedList and temporary int
        Iterator<Integer> itr = numbers.iterator();
        LinkedList<Integer> temporaryNumbers = new LinkedList<>();
        int temporaryInt;

        // Run through numbers and addFirst or addLast
        while(itr.hasNext()){
            temporaryInt = itr.next();
            if(temporaryInt < elementValue){
                //itr.remove();
                temporaryNumbers.addFirst(temporaryInt);
            } else{
                //itr.remove();
                temporaryNumbers.addLast(temporaryInt);
            }

        }


        numbers.clear();
        numbers.addAll(temporaryNumbers);


    }
}

