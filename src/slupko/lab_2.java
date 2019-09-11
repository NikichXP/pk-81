// Vlad Slupko
import java.util.Arrays;
import java.util.Random;
import java.util.function.ToIntFunction;

class Main{
    public static void main(String[] args) {
        int Number = 8117;
        int C5 = Number % 5;
        int C7 = Number % 7;
        int C11 = Number % 11;
        // Information what to do
        String[] Names = {"Number", "C5", "C7", "C11"};
        int[] Nums = {Number, C5, C7, C11};
        for(int i = 0; i < (Nums.length); i++){
            System.out.println(Names[i] + " = " + Nums[i]);
        }
        // Adding random
        Random random = new Random();
        // Creating arrays
        long[][] A = new long[4][4];
        long[][] B = new long[4][4];
        // Adding values to elements in arrays
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                A[i][j] = random.nextLong();
                B[i][j] = random.nextLong();
            }
        }
        // Printing that arrays
        System.out.println(Arrays.toString(A));
        System.out.println(Arrays.toString(B));
        // Same with array 'C'
        long[][] C = new long[4][4];
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                C[i][j] = (long)(A[i][j] + B[i][j]);
            }
        }
        System.out.println(Arrays.toString(C));
        // Avarage values of all arrays
        long Avarage_A = 0;
        long Avarage_B = 0;
        long Avarage_C = 0;

        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                Avarage_A += A[i][j];
                Avarage_B += B[i][j];
                Avarage_C += C[i][j];
            }
        }        
        Avarage_A = Avarage_A / 16;
        Avarage_B = Avarage_B / 16;
        Avarage_C = Avarage_C / 16;
        System.out.println("Avarage of Array 'A' = " + Avarage_A);
        System.out.println("Avarage of Array 'B' = " + Avarage_B);
        System.out.println("Avarage of Array 'C' = " + Avarage_C);
    }
}