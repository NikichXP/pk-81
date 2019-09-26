// import java.io.File;
// import java.io.FileNotFoundException;
// import java.io.IOException;
// import java.lang.reflect.Array;
// import java.nio.file.Files;
// import java.nio.file.Paths;
import java.util.ArrayList;
// import java.util.Collection;
import java.util.Collections;
// import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        
        int number = 8117;
        int C3 = number % 3;
        int C17 = number % 17;
        /* 
         * Information what to do
        */
        String[] Names = {"Number", "C3", "C17"};
        int[] Nums = {number, C3, C17};

        for(int i = 0; i < (Names.length); i++){
            System.out.println(Names[i] + " = " + Nums[i]);
        }

        System.out.println();
       
        String data = "1k 2kK 3KkK 4Kkkk  0sssa 546asdadsa 3kkK 5KkkKK 6KkKkKk asbbbbbb1213 4kkkk 7KkkKKKK";
        System.out.println("String is: ");
        System.out.println(data);
        System.out.println();
 
        // Must found
        char K = 'K';
        char k = 'k';
        ArrayList<String> sorted = new ArrayList<String>();
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        ArrayList<String> wordsInData = new ArrayList<String>();
        int nums = 0;
        String[] words = data.split(" ");

        for(String word : words){
            // System.out.println(word);
            nums = 0;

            for(int i = 0; i < word.length(); i++){

                if(word.charAt(i) == k || word.charAt(i) == K){

                    nums++;
                    // System.out.println(nums);
                }
            }

            if(nums != 0){
                numbers.add(nums);
                wordsInData.add(word);
            }
        }
        // System.out.println("__");
        // for(Object elem : numbers){
        //     System.out.println(elem);
        // }
        // while(true){
        //     Integer a = Collections.max(numbers);
        //     int index = numbers.indexOf(a);
        //     sorted.add(wordsInData.get(index));
        //     numbers.remove(index);
        //     wordsInData.remove(index);
        //     if(numbers.isEmpty() == true){
        //         break;
        //     }
        // }
        do{
            Integer a = Collections.max(numbers);
            int index = numbers.indexOf(a);
            sorted.add(wordsInData.get(index));
            numbers.remove(index);
            wordsInData.remove(index);

        }while(numbers.isEmpty() == false);

        for(Object elem : sorted){
            System.out.println(elem);
        }
    }
}