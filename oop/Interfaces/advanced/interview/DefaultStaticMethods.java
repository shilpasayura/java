//public 

class ElectricCar implements Vehicle {

    private String name;
    private int horsePower;

    public ElectricCar(String name, int horsePower) {
        this.name = name;
        this.horsePower = horsePower;
    }

    public String getName() {
        return name;
    }

    public int getHorsePower() {
        return horsePower;
    }

    @Override
    public void speedUp() {
        System.out.println("Speed up the electric car ...");
    }

    @Override
    public void slowDown() {
        System.out.println("Slow down the electric car ...");
    }

    @Override
    public double computeConsumption(int fuel, int distance, int horsePower) {
        return Math.random() * 60d / Math.pow(Math.random(), 3);
    }     

}


//public 
class SteamCar implements Vehicle {

    private String name;
    private int horsePower=20;

    public SteamCar(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

   public int getHorsePower() {
        return horsePower;
    }

    @Override
    public void speedUp() {
        System.out.println("Speed up the steam car ...");
    }

    @Override
    public void slowDown() {
        System.out.println("Slow down the steam car ...");
    }
}

//public 
class PetrolCar implements Vehicle {

    private String name;
    private int horsePower;

    public PetrolCar(String name, int horsePower) {
        this.name = name;
        this.horsePower = horsePower;
    }       

    public String getName() {
        return name;
    }

    public int getHorsePower() {
        return horsePower;
    }        
    
    @Override
    public void speedUp() {
        System.out.println("Speed up the petrol car ...");
    }

    @Override
    public void slowDown() {
        System.out.println("Slow down the petrol car ...");
    }    
}

//public 
interface Vehicle {

    public void speedUp();

    public void slowDown();

    default double computeConsumption(int fuel, int distance, int horsePower) {        
        return Math.random() * 10d;
    }
    
    static void description() {
        System.out.println("This interface control steam, petrol and electric cars");
    }
}


public class DefaultStaticMethods {

    public static void main(String[] args) {

        Vehicle.description();

        PetrolCar pc = new PetrolCar("Audi", 150);
        System.out.println("Petrol car consume: "
                + String.format("%.1f", pc.computeConsumption(250, 50, pc.getHorsePower()))
                + " l/100km");

        ElectricCar ec = new ElectricCar("Audi", 150);
        System.out.println("Electric car consume: "
                + String.format("%.1f", ec.computeConsumption(250, 50, ec.getHorsePower()))
                + " kW/h");
                
        SteamCar sc = new SteamCar("Steama");
        System.out.println("Steam car consume: "
                + String.format("%.1f", sc.computeConsumption(500, 80, sc.getHorsePower()))
                + " kW/h");
    }
}