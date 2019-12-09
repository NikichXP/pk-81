import java.util.Comparator;

class Device {
    String name;
    double power;
    int magneticRadiation;

    Device(String name, double power, int magneticRadiation){
        this.name = name;
        this.power = power;
        this.magneticRadiation = magneticRadiation;
    }

    public String getInfo(){
        String info = (String)("Назва: " + name + " Потжністю: " + power + " Виділяє електро-магнітного випромінювання: " + magneticRadiation);
        return info;
    }

}
// Ієрархія за габаритними розмірами
class LargeDevice extends Device{
    LargeDevice(String name, double power, int magneticRadiation){
        super(name, power, magneticRadiation);
    }
}

class RegularDevice extends Device{
    RegularDevice(String name, double power, int magneticRadiation){
        super(name, power, magneticRadiation);

    }
}

class SmallDevice extends Device{
    SmallDevice(String name, double power, int magneticRadiation){
        super(name, power, magneticRadiation);
    }
}

//Comparator, щоб навчити програму сортувати даний клас
class SortByPower implements Comparator<Device>{
    public int compare(final Device o1, final Device o2) {
        return (int)(o1.power - o2.power);
    }
}