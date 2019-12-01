import java.util.Comparator;

/*
    Jems    -  Precious     :   Ruby, Emerald, Diamond
            -  Semi-free    :   Turquoise, Lazurite, Malachite

    weight( gram ), cost(per 1 gram), transparency(0 < 10)
*/

class Jem{
    String name = "Jem";
    int weight;
    double cost;
    int transparency;
    double price;

    public String info(){
        String info = (name + ": Weight = " + weight + ", Price = " + price + " $, Transparency = " + transparency);
        return info;
    }
}

class PreciousJem extends Jem {
    PreciousJem(){super.name = "Precious Jem";}
}

class SemiFreeJem extends Jem {
    SemiFreeJem(){super.name = "Semi-Free Jem";}
}

// Precious Jems

class Ruby extends PreciousJem {
    int cost = 600;
    public Ruby(int weight){
        super.name = "Ruby";
        super.cost = cost;
        super.transparency = 5;
        super.weight = weight;
        super.price = (cost * weight);
    }
}

class Emerald extends PreciousJem {
    int cost = 900;
    public Emerald(int weight){
        super.name = "Emerald";
        super.cost = cost;
        super.transparency = 7;
        super.weight = weight;
        super.price = (cost * weight);
    }
}

class Diamond extends PreciousJem {
    int cost = 1500;
    public Diamond(int weight){
        super.name = "Diamond";
        super.cost = cost;
        super.transparency = 10;
        super.weight = weight;
        super.price = (cost * weight);
    }
}

// Semi-Free Jems

class Turquoise extends SemiFreeJem {
    int cost = 300;
    public Turquoise(int weight){
        super.name = "Turquoise";
        super.cost = cost;
        super.transparency = 3;
        super.weight = weight;
        super.price = (cost * weight);
    }
}

class Lazurite extends SemiFreeJem {
    int cost = 105;
    public Lazurite(int weight){
        super.name = "Lazurite";
        super.cost = cost;
        super.transparency = 0;
        super.weight = weight;
        super.price = (cost * weight);
    }
}

class Malachite extends SemiFreeJem {
    int cost = 215;
    public Malachite(int weight){
        super.name = "Malachite";
        super.cost = cost;
        super.transparency = 1;
        super.weight = weight;
        super.price = (cost * weight);
    }
}

// Comparator

class sortByPrice implements Comparator<Jem> {
    public int compare(final Jem o1, final Jem o2) {
        return (int)(o1.price - o2.price);
    }
}