import java.util.Arrays;

class Main{
    public static void main(String[] args) {
        int number = 8101;

        System.out.println("Номер заліковки = " + number);
        System.out.println("C13 = " + number % 13);

        Device[] devices = new Device[6];
        devices[0] = new LargeDevice("Холодильник", 1547.85, 5);
        devices[1] = new RegularDevice("Мікрохвильовка", 300, 10);
        devices[2] = new SmallDevice("Телефон", 10, 7);
        devices[3] = new SmallDevice("Зарядка до телефону", 25, 3);
        devices[4] = new RegularDevice("Принтер", 225.84, 1);
        devices[5] = new LargeDevice("Плазма", 800, 10);

        System.out.println("До сортування:");
        for(Device device : devices){
            System.out.println(device.getInfo());
        }

        Arrays.sort(devices, new SortByPower());

        System.out.println("Після сортування:");
        for(Device device : devices){
            System.out.println(device.getInfo());
        }

        double powerOfDevices = 0;
        for(Device device : devices){
            powerOfDevices += device.power;
        }

        System.out.println("Загальна потужність пристроїв: " + powerOfDevices);
        
        int lookFor = 3;

        for(Device device : devices){
            if(device.magneticRadiation == lookFor){
                System.out.println("Пристрій: " + device.name + " має дане випромінювання - " + lookFor);
            }
        }
    }
}