import java.util.Arrays;
import java.util.Random;

class Main{
    public static void main(final String[] args) {
        int number = 8117;
        int c13 = number % 13;
        System.out.println("--------------");
        System.out.println("Number = " + number);
        System.out.println("C13 = " + c13);
        System.out.println("--------------");

        // Визначити ієрархію дорогоцінного та напівкоштовного каміння
        // Відібрати камені для намиста
        // Порахувати загальну вагу (у каратах) і вартість намиста
        // Провести сортування каміння намиста за цінністю
        // Знайти каміння в намисто, що відповідає заданому діапазону параметрів
        // прозорості.

        Random random = new Random();

        int necklaceSize = 6;
        Jem necklace[] = new Jem[necklaceSize];
        // Creating necklace

        Jem jemList[] = {new Ruby(1 + random.nextInt(10)), new Emerald(1 + random.nextInt(10)), new Diamond(1 + random.nextInt(10)), new Turquoise(1 + random.nextInt(10)), new Lazurite(1 + random.nextInt(10)), new Malachite(1 + random.nextInt(10))};

        for (int i = 0; i < necklaceSize; i++) {
            necklace[i] = jemList[random.nextInt(6)];
        }
        // Weight of necklace

        int necklaceWeight = 0;

        for(int i = 0; i < necklaceSize; i++){
            necklaceWeight += necklace[i].weight;
        }

        System.out.println("Weight of necklace = " + necklaceWeight + " gram");
        
        // Showing necklace
        Arrays.sort(necklace, new sortByPrice());

        System.out.println("Necklace:");
        for (int i = 0; i < necklaceSize; i++) {
            System.out.println((i+1) + ". " + necklace[i].info() + "| Price = " + (necklace[i].cost * necklace[i].weight));
        }

        // Looking for jem with transparency 5
        System.out.println("Looking for jem with transparency 5...");

        int lookFor = 5;
        boolean isThere = true;
        for(int i = 0; i < necklaceSize; i++) {
            if(necklace[i].transparency == lookFor){
                System.out.println(i + ". " + necklace[i].info());
            }
            else{
                isThere = false;
            }
        }
        if(isThere == false){
            System.out.println("There is no jems with that transparency!");
        }

    }
}