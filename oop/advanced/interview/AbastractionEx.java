//https://github.com/PacktPublishing/The-Complete-Coding-Interview-Guide-in-Java/tree/master/Chapter06/Abstraction
interface Car {

    public void speedUp();

    public void slowDown();

    public void turnRight();

    public void turnLeft();
    
    public String getCarType();
}

class ElectricCar implements Car {
    
    private final String carType;

    public ElectricCar(String carType) {
        this.carType = carType;
    }        

    @Override
    public void speedUp() {
        System.out.println("Speed up the electric car");
    }

    @Override
    public void slowDown() {
        System.out.println("Slow down the electric car");
    }

    @Override
    public void turnRight() {
        System.out.println("Turn right the electric car");
    }

    @Override
    public void turnLeft() {
        System.out.println("Turn left the electric car");
    }

    @Override
    public String getCarType() {
        return this.carType;
    }        
}


class PetrolCar implements Car {

    private final String carType;

    public PetrolCar(String carType) {
        this.carType = carType;
    }

    @Override
    public void speedUp() {
        System.out.println("Speed up the petrol car");
    }

    @Override
    public void slowDown() {
        System.out.println("Slow down the petrol car");
    }

    @Override
    public void turnRight() {
        System.out.println("Turn right the petrol car");
    }

    @Override
    public void turnLeft() {
        System.out.println("Turn left the petrol car");
    }

    @Override
    public String getCarType() {
        return this.carType;
    }
}


public class AbastractionEx {

    public static void main(String[] args) {

        Car electricCar = new ElectricCar("BMW");
        Car petrolCar = new PetrolCar("Audi");

        System.out.println("Driving the electric car: " + electricCar.getCarType() + "\n");
        electricCar.speedUp();
        electricCar.turnLeft();
        electricCar.slowDown();

        System.out.println("\n\nDriving the petrol car: " + petrolCar.getCarType() + "\n");
        petrolCar.slowDown();
        petrolCar.turnRight();
        petrolCar.turnLeft();
    }
}