import java.util.Arrays;

class Main{
    public static void main(final String[] args) {
        final int number = 8101;
        System.out.println("Номер заліковки = " + number);
        System.out.println("C11 = " + number % 11);

        final Clothes[] clothes = new Clothes[3];
        clothes[0] = new Clothes("Джинси", "GUCCI", 42, 2019, 1500);
        clothes[1] = new Clothes("Толстовка", "Staff", 28, 2016, 900);
        clothes[2] = new Clothes("Сорочка", "Базар", 56, 2018, 600);
        for (final Clothes elem : clothes) {
            elem.info();
            System.out.println();
        }

        System.out.println("\nСортування за ціною, зростанням: ");
        Arrays.sort(clothes, new sortByPrice());
        for (final Clothes elem : clothes) {
            elem.info();
            System.out.println();
        }

        System.out.println("\nСортування за типом, за алфавітом, наоборот: ");
        Arrays.sort(clothes, new sortByType().reversed());
        for (final Clothes elem : clothes) {
            elem.info();
            System.out.println();
        }
    }
}