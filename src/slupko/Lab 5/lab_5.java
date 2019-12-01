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

        Method.Sort(data, 'k');
    }
}