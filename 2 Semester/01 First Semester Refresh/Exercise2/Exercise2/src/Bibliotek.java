import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Bibliotek {
    public static void main(String[] args){

        // Create bogArrayList and construct three books
        ArrayList<Bog> bogArrayList = new ArrayList<>();

        bogArrayList.add(new Bog("123-123", "Best Book", "0000"));
        bogArrayList.add(new Bog("123-456", "Second Best Book", "1950"));
        bogArrayList.add(new Bog("123-789", "Third Best Book", "2023"));

        System.out.println(checkBookDuplication(bogArrayList));




    }

    public static boolean checkBookDuplication(ArrayList<Bog> bogArrayList){

        Set<String> set = new HashSet<String>();
        for (Bog each: bogArrayList) if (!set.add(each.getIsbn())) return true;
        return false;
    }
}
