class Main{
    public static void main(String[] args) {
        int number = 8101;

        System.out.println("Номер заліковки = " + number);
        System.out.println("C2 = " + number % 2);
        System.out.println("C3 = " + number % 3);
        System.out.println("C5 = " + number % 5);
        System.out.println("C7 = " + number % 7);

        /*
         * O1 = - C = 1 O2 = / int i; int j;
         */

        int a = -10;
        int b = -25;
        int n = 13;
        int m = 26;
        int C = (int) (number % 3);
        int i;
        int j;
        double summ = 0;

        for (i = a; i < n; i++){
            for(j = b; j < m; j++){
                if ((int)(i - C) == 0){
                    System.out.println("Ділення на 0!!! (i-C) = 0");
                    continue;
                }
                if (j == 0){
                    System.out.println("Ділення на 0!!! j = 0");
                    continue;
                } else{
                    summ = (summ + (double)(i / j)/(i - C));                //double перед (i / j) тому що без нього програма не обрахує, int/int якщо це буде не ціле число то дія верне 0
                }

            }
        }
        System.out.println("Сума = " + summ);
    }
}