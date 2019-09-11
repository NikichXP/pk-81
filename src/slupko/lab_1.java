class Main{
    public static void main(String[] args) {
        int Number = 8117;
        int C2 = Number % 2;
        int C3 = Number % 3;
        int C5 = Number % 5;
        int C7 = Number % 7;

        int[] Nums = new int[] {Number, C2, C3, C5, C7};
        String[] Names = new String[] {"Number", "C2", "C3", "C5", "C7"};
        for (int i = 0; i < 5; i++){
            System.out.println(Names[i] + " = " + Nums[i]);
        }

        char a = 1;
        char b = 4;
        char n = 11;
        char m = 27;
        char C = (char)(Number % 3);
        char i;
        char j;
        char Sum = 0;
        
        for (i = a; i < n; i++){
            for(j = b; j < m; j++){
                if ((int)(i - C) == 0){
                    continue;
                } else{
                Sum =(char)(Sum + (i % j)/(i - C));
                }

            }
        }

        System.out.println(Sum);
    }
}