//https://www.geeksforgeeks.org/java-lang-thread-class-java/#:~:text=Thread%20a%20line%20of%20execution,manage%20the%20behaviour%20of%20threads.

import java.awt.*;
import javax.swing.*;

class RunnableDemo implements Runnable {
   private Thread t;
   private String threadName;
   
   RunnableDemo( String name) {
      threadName = name;
      System.out.println("Creating " +  threadName );
      
   }
   
   public int randJob(){
	  int min = 1;
      int max = 20;
      //Generate random double value from 50 to 100 
      System.out.println("Random value in double from "+min+" to "+max+ ":");
      double random_double = Math.random() * (max - min + 1) + min;
       
      return (int) random_double;   
   }
   
   public void run() {
      System.out.println("Running " +  threadName );
      try {
		 int x =randJob();
         for(int i = x; i > 0; i--) {
            System.out.println("Thread: " + threadName + ", " + i);
            // Let the thread sleep for a while.
            Thread.sleep(200);
            //if (i == 2) {
			//	int x=1/0;
			//}
         }
      } catch (InterruptedException e) {
         System.out.println("Thread " +  threadName + " interrupted.");
      }
      System.out.println("Thread " +  threadName + " exiting.");
   }
   
   public void start () {
      System.out.println("Starting " +  threadName );
      
      if (t == null) {
         t = new Thread (this, threadName);
         t.start ();
      }
         
   }
}

public class TestThread {

   public static void main(String args[]) {
      RunnableDemo R1 = new RunnableDemo( "Dad Thread-1");
      R1.start();
      
      RunnableDemo R2 = new RunnableDemo( "Mom Thread-2");
      R2.start();
      
      RunnableDemo R3 = new RunnableDemo( "Baby Thread-3");
      R3.start();
   }   
}
