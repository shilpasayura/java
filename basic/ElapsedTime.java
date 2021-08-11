public class ElapsedTime {
   public static void main(String[] args) throws Exception {
      // finding the time before the operation is executed
      long start = System.currentTimeMillis();
      for (int i = 0; i <5; i++) {
         Thread.sleep(1000); //Pause for 1000 milli seconds
         System.out.println (System.currentTimeMillis());
      }
      // finding the time after the operation is executed
      long end = System.currentTimeMillis();
      //finding the time difference and converting it into seconds
      float sec = (end - start) / 1000F; 
      System.out.println(sec + " seconds");
   }
}