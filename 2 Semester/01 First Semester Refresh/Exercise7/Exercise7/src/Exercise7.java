public class Exercise7 {
    public static void main(String[] args){

        String[] words = new String[2];
        words[0] = "Hello";
        words[1] = "World";

        String word = "Worlds";

        System.out.println(searchArrayForString(words, word));

    }

    public static int searchArrayForString(String[] stringArray, String searchTerm){
        boolean isInArray = false;
        int index = -1;

        for(int i = 0; i < stringArray.length; i++){
            if(searchTerm.equals(stringArray[i])){
                isInArray = true;
                index = i;
            }
        }

        return index;

    }
}
