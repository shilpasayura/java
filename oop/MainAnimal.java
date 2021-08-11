class Animalx {
public void animalSound() {
    System.out.println("The animal makes a sound");
  }
}

class Cow extends Animalx {
public void animalSound() {
    System.out.println("The Cow says: ohee ohee");
  }
}


class Dog extends Animalx {
  public void animalSound() {
    System.out.println("The dog says: bow wow");
  }
}

class MainAnimal {
  public static void main(String[] args) {
    Animalx myAnimal = new Animalx();
    Animalx myCow = new Cow();
    Animalx myDog = new Dog();
        
   myAnimal.animalSound();
    myCow.animalSound();
    myDog.animalSound();
  }
}
