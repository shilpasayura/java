interface Animal {
    public void move();
}
 
class Bird implements Animal {
    public void move() {
        System.out.println("Flying...");
    }
}
 
class Fish implements Animal {
    public void move() {
        System.out.println("Swimming...");
    }
}

class Dog implements Animal {
    public void move() {
        System.out.println("Running...");
    }
}


class Cat implements Animal {
    public void move() {
        System.out.println("Jumping...");
    }
    
    public void speak() {
        System.out.println("Puru Puru...");
    }
}

class Trainer {
    public void teach(Animal anim) {
        anim.move();
    }
}


public class Polymorphism3 {
    public static void main(String[] args) {
Trainer trainer = new Trainer();
Dog dog = new Dog(); 
Bird bird = new Bird();
Fish fish = new Fish();
Cat cat = new Cat();

trainer.teach(dog);
trainer.teach(bird);
trainer.teach(fish);
trainer.teach(cat);
}
}