//public
class Car {
    
    private final String name;
    private final Engine engine;

    public Car(String name) {
        this.name = name;        
        Engine engine = new Engine("petrol", 300);
        this.engine=engine;
    }

    public int getHorsepower() {
        return engine.getHorsepower();
    }
    
    public String getName() {
        return name;
    }    
}

//public
class Engine {
    
    private String type;
    private int horsepower;

    public Engine(String type, int horsepower) {
        this.type = type;
        this.horsepower = horsepower;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }        
}

public class Association {

    public static void main(String[] args) {
        Car car = new Car("MyCar");
        System.out.println("Horsepower: " + car.getHorsepower());
    }

}