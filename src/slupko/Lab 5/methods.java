import java.util.ArrayList;
import java.util.Collections;

class Method{
    public static void Sort(String input, char symbol){
        for(String elem : Text.getText(input, symbol)){
            System.out.println(elem);
        }
    }

}

class Text {
    public static ArrayList<String> getText(String data, char symbol) {
        ArrayList<String> sorted = new ArrayList<>();
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<String> wordsInData = new ArrayList<>();
        String[] words = data.split(" ");
        for(String word : words){
            int nums = Words.countSymbols(word, symbol);
            if(nums != 0){
                numbers.add(nums);
                wordsInData.add(word);
            }
        }
        do{
            int a = Collections.max(numbers);
            int index = numbers.indexOf(a);
            sorted.add(wordsInData.get(index));
            numbers.remove(index);
            wordsInData.remove(index);

        }while(numbers.isEmpty() == false);
        return sorted;
    }
}

class Words{
    public static int countSymbols(String word, char symbol){
        int nums = 0;
        for(int i = 0; i < word.length(); i++){
            if(word.charAt(i) == Character.toLowerCase(symbol) || word.charAt(i) == Character.toUpperCase(symbol)){
                nums++;
            }
        }
        return nums;
    }
}