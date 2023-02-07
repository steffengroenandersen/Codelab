import java.util.LinkedList;
import java.util.Iterator;

public class RemoveInRange {


    public static void main(String[] args){

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);

        int elementValue = 3;
        int startingIndex = 2;
        int endingIndex = 4;

        System.out.println("Original List:");
        System.out.println(numbers);

        removeInRange(numbers, elementValue, startingIndex, endingIndex);

        System.out.println("New List:");
        System.out.println(numbers);

    }
    static LinkedList<Integer> numbers = new LinkedList<>();

    public static void removeInRange(LinkedList<Integer> numbers, int elementValue, int startingIndex, int endingIndex){
        Iterator<Integer> itr = numbers.iterator();
        int current = 0;
        while(itr.hasNext()){
            current++;
            if(current > startingIndex && current < endingIndex){
                if(itr.next() == elementValue){
                    itr.remove();
                }
            }
            itr.next();
        }

    }
}
