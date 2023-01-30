import java.util.ArrayList;

public class Exercise1 {
    public static void main(String[] args){

        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("Hello");

        System.out.println(doesArrayListContainString(stringArrayList, "Hello"));
        System.out.println(doesArrayListContainString(stringArrayList, "Nice"));

    }


    public static boolean doesArrayListContainString(ArrayList<String> arrayList, String string){

        if(arrayList.contains(string)){
            System.out.println("The String has been found.");
            return true;
        }
        arrayList.add(string);
        return false;
    }
}
