import java.util.Comparator;

class Clothes {
    String type;
    String brand;
    int size;
    int yearOfCreation;
    double price;

    public Clothes(String type, String brand, int size, int yearOfCreation, double price){
        this.type = type;
        this.brand = brand;
        this.size = size;
        this.yearOfCreation = yearOfCreation;
        this.price = price;
    }

    public void info(){
        System.out.print(type);
        System.out.print(", " + brand);
        System.out.print(", " + size);
        System.out.print(", " + yearOfCreation);
        System.out.print(", " + price);
    }
}

// Comparators

class sortByType implements Comparator<Clothes> {
    public int compare(Clothes o1, Clothes o2) {
        return o1.type.compareTo(o2.type);
    }
}

class sortByBrand implements Comparator<Clothes> {
    public int compare(Clothes o1, Clothes o2) {
        return o1.brand.compareTo(o2.brand);
    }
}

class sortBySize implements Comparator<Clothes> {
    public int compare(Clothes o1, Clothes o2) {
        return o1.yearOfCreation - o2.yearOfCreation;
    }
}

class sortByYearOfCreation implements Comparator<Clothes> {
    public int compare(Clothes o1, Clothes o2) {
        return o1.size - o2.size;
    }
}

class sortByPrice implements Comparator<Clothes> {
    public int compare(Clothes o1, Clothes o2) {
        return (int)(o1.price - o2.price);
    }
}