import java.util.*;

public class SortAndRemoveDuplicates {

    static List<Integer> list = new ArrayList<Integer>();
    
    public static void main(String[] args){



        list.add(7);
        list.add(4);
        list.add(-9);
        list.add(15);
        list.add(8);
        list.add(27);
        list.add(7);
        list.add(11);
        list.add(-5);
        list.add(32);
        list.add(-9);
        list.add(-9);


        removeAndSortDuplicates(list);
        System.out.println(list);


    }

    public static void removeAndSortDuplicates(List<Integer> list){

        Set<Integer> set = new HashSet<Integer>();

        set.addAll(list);
        list.clear();

        list.addAll(set);
        Collections.sort(list);

    }
}
