class Main{
    public static void main(String[] args) {
        int number = 8101;

        System.out.println("Номер заліковки = " + number);
        System.out.println("C3 = " + number % 3);
        System.out.println("C17 = " + number % 17);
        
        String sentence1 = "My hard univercity.";
        String sentence2 = "Soon i will go from univercity.";
        String sentence3 = "Love my hard univercity.";

        StringBuffer text = new StringBuffer();
        text.append(sentence1);
        text.append(sentence2);
        text.append(sentence3);

        int arrayLength = 3;
        String[] words = new String[arrayLength];
        words[0] = "Univercity";
        words[1] = "Hard";
        words[2] = "Go";

        new Sort().wordsInSentence(text, words);
    }
}