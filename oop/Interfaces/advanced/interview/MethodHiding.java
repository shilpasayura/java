//public 
class Car extends Vehicle {
    
    // this method hides Vehicle#move()
    public static void move() {
        System.out.println("Moving a car");
    }
}

//public 
class Vehicle {

    public static void move() {
        System.out.println("Moving a vehicle");
    }
}

public class MethodHiding {

    public static void main(String[] args) {

        Vehicle.move(); // call Vehicle#move()
        Car.move();     // call Car#move()
    }
}