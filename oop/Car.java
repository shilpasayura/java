public final class Car {
  private final String name;
    
  public Car(String brand) {
      this.name= brand; 
  }

  public static void main(String[] args) {
    Car car1 = new Car("Toyota"); 
    Car car2 = new Car("Suzuki"); 
    System.out.println(car1.name); 
System.out.println(car2.name); 
  }
}