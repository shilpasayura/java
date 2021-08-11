class Vehicle {
  protected String brand = "Toyota";   
  public void honk() {                    
    System.out.println("Beep! Peep");
  }
}

class Car extends Vehicle {
  private String modelName = "FZR";  
  public static void main(String[] args) {

    // Create a myCar object
    Car myCar = new Car();

    // Call the honk() method 
    myCar.honk();
    // Display brand attribute and modelName 
    System.out.println(myCar.brand )
   
   System.out.println(myCar.modelName);
  }
}