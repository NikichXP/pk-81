import java.util.Random;

class Main {
    public static void main(String[] args) {
        int number = 8101;

        System.out.println("Номер заліковки = " + number);
        System.out.println("C5 = " + number % 5);
        System.out.println("C7 = " + number % 7);
        System.out.println("C11 = " + number % 11);

        Random random = new Random();

        int arrayLength = 8;    //Задали розмір наших матриць
        short[][] B = new short[arrayLength][arrayLength];  //Ініціалізували матрицю 1 
        short[][] C = new short[arrayLength][arrayLength];  //Ініціалізували матрицю 2

        //Заповняємо 1 матрицю через рандом
        for(int i = 0; i < B.length; i++){
            for(int j = 0; j < B.length; j++){
                B[i][j] = (short)random.nextInt(Short.MAX_VALUE + 1); // У random немає спеціального методу, що буде генерувати рандомні short числа тому ми використаємо int але із межами short
            }
        }

        //Виводимо 1 матрицю
        System.out.println();
        for(int i = 0; i < B.length; i++){
            for(int j = 0; j < B.length; j++){
                System.out.print(B[i][j] + "\t");
            }
            System.out.println();
        }
        
        //Заповняємо 2 матрицю, транспонувавши 1
        for(int i = 0; i < B.length; i++){
            for(int j = 0; j < B.length; j++){
                C[j][i] = B[i][j];
            }
        }

        //Виводимо 2 матрицю
        System.out.println();
        for(int i = 0; i < C.length; i++){
            for(int j = 0; j < C.length; j++){
                System.out.print(C[i][j] + "\t");
            }
            System.out.println();
        }

        short sumOfMax = 0; //Сума максимальних значень
        short sumOfMin = 0; //Сума мінімальних значень

        for(int i = 0; i < C.length; i++){
            short tempMax = C[i][0];    //Тимчасова змінна для виконання перевірки на максимальне значення, починається із [i][0], так як 0 є першим парним номером
            short tempMin = C[i][0];    //Тимчасова змінна для виконання перевірки на максимальне значенняj, починається із [i][1], так як 1 є першим непарним номером
            if(i%2 != 0){   //Перевірка на парність
                for(int j = 0; j < C.length; j++){
                    if(C[i][j] > tempMax){  //Якщо є значення більше за тимчасове(максимальне)
                        tempMax = C[i][j];  //Надаємо тимчасовій змінні цього значення
                    }
                }
                sumOfMax += tempMax;    //Додаємо максимальні значення

            } else if(i%2 == 0){   //Перевірка не непарність
                for(int j = 0; j < C.length; j++){
                    if(C[i][j] < tempMin){  //Якщо є значення менше за тимчасове(мінімальне)
                    tempMin = C[i][j];  //Надаємо тимчасовій змінні цього значення
                    }
                }
                sumOfMin += tempMin;    //Додаємо мінімальні значення

            }
            
        }

        System.out.println();   //Виводимо їх
        System.out.println("Sum of max values is = " + sumOfMax); // Якщо це число виходить відємне отже ми перейшли межу short і тепер все почалось із мінімального значення, щоб цього уникнути поставити менші межі в random
        System.out.println("Sum of min values is = " + sumOfMin);
    }
}