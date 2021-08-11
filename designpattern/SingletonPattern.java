// 1. Create a Singleton Class.

//SingletonObject.java

public class SingletonObject {

   //create SingleObjecton object
   private static SingletonObject instance = new SingletonObject();

   //make the constructor private so this class cannot be instantiated
   
   private SingletonObject(){
	System.out.println("Gives an Error");
   }

   //Get the only object available
   public static SingletonObject getInstance(){
      return instance;
   }

   public void showMessage(){
      System.out.println("Hello Single Object!");
   }
}

//2 .  Get the only object from the singleton class.

//SingletonPattern.java

public class SingletonPattern {
   public static void main(String[] args) {

      //illegal construct
      //Compile Time Error: The constructor SingleObject() is not visible
      //SingletonObject object1 = new SingletonObject();

      //Get the only object available
      SingletonObject object = SingletonObject.getInstance();

      //show the message
      object.showMessage();
   }
}
