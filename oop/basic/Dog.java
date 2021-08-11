public class Dog{
  public static String name="Bicky";
 
  public static void speak(String name){
    // Prints the instance variable named name
    System.out.println(Dog.name);
    // Prints the local variable named name
    System.out.println(name);

  }

 public static void main(String[] args){
 
    //Accessing a static variable
    System.out.println(name); 
 
    // Calling a static method
    Dog.speak("Riky");
  }
}


