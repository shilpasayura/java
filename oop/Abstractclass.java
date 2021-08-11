// Abstract class
abstract class Animal {
  // Abstract method (does not have a body)

  public abstract void animalSound();

  // Regular method
  public void sleep() {
    System.out.println("Zzz");
  }

}

// Subclass inherited from Animal

class Cat extends Animal {
  public void animalSound() {
    // The body of animalSound() provided here 

    System.out.println("The cat says: mewe mewe");

  }
}

class Main {
  public static void main(String[] args) {
    // Create a Cat object
    Cat myCat = new Cat(); 
    myCat.animalSound();
    myCat.sleep();
  }
}
