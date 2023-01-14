import java.util.ArrayList;

public class MyArrayList {
    public static void main(String[] args){

        ArrayList<Integer> integerArrayList = new ArrayList<Integer>();

        integerArrayList.add(66);
        integerArrayList.add(66);
        integerArrayList.add(66);




        // Count occurrences of 66

        int counter = 0;

        for(Integer integer : integerArrayList){
            if(integer == 66){
                counter++;
            }
        }

        System.out.println(counter);



    }
}
