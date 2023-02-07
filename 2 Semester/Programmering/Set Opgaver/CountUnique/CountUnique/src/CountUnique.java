import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CountUnique {
    public static void main(String[] args){

        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);

        System.out.println(countUnique(list));
    }


    public static int countUnique(List<Integer> integerList){
        Set<Integer> uniqueSet = new HashSet();

        uniqueSet.addAll(integerList);

        return uniqueSet.size();
    }
}
