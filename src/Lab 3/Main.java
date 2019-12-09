class Main{
    public static void main(String[] args) {
        int number = 8101;

        System.out.println("Номер заліковки = " + number);	// виведення інформації про варіант
        System.out.println("C3 = " + number % 3);
        System.out.println("C17 = " + number % 17);
		
		// Створюємо сам текст. Використовуємо англ слова, тому що вони не мають відмінків і з ними так зараз краще працювати
		// Створюємо речення
        String sentence1 = "My hard univercity.";
        String sentence2 = "Soon i will go from univercity.";
        String sentence3 = "Love my hard univercity.";
		// Використовуємо методи StringBuffer для добавлення в text до нього речень
        StringBuffer text = new StringBuffer();
        text.append(sentence1);
        text.append(sentence2);
        text.append(sentence3);
        
        int arrayLength = 3;//Довжина масива із словами						
        String[] words = new String[arrayLength];
        int[] count = new int[arrayLength];//Масив в якому зберігаються значення, у скількох реченях зустрічалось данне слово. Напряму звязане із масивом речень
        // Слова які шукаємо
		words[0] = "Univercity";
        words[1] = "Hard";
        words[2] = "Go";

        String[] sentence = text.toString().split("\\.");//Переведення зміни тексту у масив із реченями
        for(int a = 0; a < sentence.length; a++){
            String[] wordsInSentence = sentence[a].split(" ");//Переведення речення у масив із слів
            for(int j = 0; j < wordsInSentence.length; j++){//Цикл для кожного слова у речені
                String temp1 = wordsInSentence[j].toLowerCase();//Зміна яка приймає значення слова у речені. Переводимо у нижній реєстр слово
            
                for(int i = 0; i < arrayLength; i++){//Цикл для шуканих слів
                    String temp2 = words[i].toLowerCase();//Зміна яка приймає значення шуканого слова. Переводимо у нижній реєстр слово
                    //System.out.println(temp1 + '\n' + temp2);
                    //System.out.println(temp2.equals(temp1));
                    if(temp2.equals(temp1)){
                        count[i] += 1;//Якщо слово знайшлось то додаємо 1
                    }
                }
            }
            
        }
        for(int a = 0; a < arrayLength; a++){
            System.out.println("Слово " + words[a] + " зустрічалось у " + count[a] + " реченях.");
        }
    }
}