class Person {
 
    // Instance variables (data or "state")
    String name;
    int age;
 
    // Classes can contain
 
    // 1. Data
    // 2. Subroutines (methods)
     
    void speak() {
        for(int i=0; i<3; i++) {
            System.out.println("My name is: " + name + " and I am " + age + " years old ");
        }
    }
     
    void sayHello() {
        System.out.println("Hello there!");
    }
}
 
public class Methods1 {
 
    public static void main(String[] args) {
 
        // Create a Person object using the Person class
        Person person1 = new Person();
        person1.name = "Ama Bima";
        person1.age = 20;
        person1.speak();
        person1.sayHello();
 
        // Create a second Person object
        Person person2 = new Person();
        person2.name = "Sara Dex";
        person2.age = 18;
        person2.speak();
        person1.sayHello();
 
        System.out.println(person1.name);
 
    }
 
}