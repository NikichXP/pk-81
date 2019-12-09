class Sort{
    //Метод який виводить інформацію про шукані слова
    public void wordsInSentence(StringBuffer text, String[] words){
        int[] count = new int[words.length];//Зміна яка приймає значення, у скількох реченнях зустрілось слово
        for(int i = 0; i < words.length; i++){
            count[i] = Text.valueOfWordInText(text, words[i]);//Приймає значення
        }
        for (int i = 0; i < words.length; i++) {
            System.out.println("Слово " + words[i] + " зустрічалось у " + count[i] + " реченях.");
        }
    }

}

class Text {
    //Метод який переводить текст у масив із речень і виведення значення скільки разів зустрілось дане слово
    public static int valueOfWordInText(StringBuffer text, String word) {
        int value = 0;
        String[] sentencesInText = text.toString().split("\\.");
        value = Sentence.valueOfWordInSentence(sentencesInText, word);
        return value;
    }

}

class Sentence{
    //Метод який виконує пошук слова у речннях
    public static int valueOfWordInSentence(String[] sentences, String word){
        int value = 0;
        for(String sentence : sentences){
            String[] wordsInSentence = sentence.toString().split(" ");
            for(String wordInSentence : wordsInSentence){
                if(wordInSentence.toLowerCase().equals(word.toLowerCase())){
                    value += 1;
                }
            }
        }
        return value;
    }

}