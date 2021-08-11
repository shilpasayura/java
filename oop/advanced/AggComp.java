// difference between Aggregation Composition.

import java.io.*;

/*
Engine class which will be used by car. 
Car class will have a field of Engine type.
*/

class Engine{
	// starting an engine.
	public void run(){
	  System.out.println("Engine of car has been started ");	
	}
}

// Engine class
final class Car{
	// For a car to move,need to have an engine.
   
	private final Engine engine; // Composition
	//private Engine engine;	 // Aggregation
	
	Car(Engine engine){
		this.engine = engine;
	}
	
	// car start moving by starting engine
	public void move(){
		//if(engine != null){
			engine.run();
			System.out.println("Car is moving ");
	  }
}


public class AggComp{
	public static void main (String[] args){
		
		// create an instance of Engine class.
		Engine engine = new Engine();
		
		// Making a car with engine.
		// so we are passing a engine
		// instance as an argument while
		// creating instace of Car.
		Car car = new Car(engine);
		car.move();
	}
}
