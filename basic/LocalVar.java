public class LocalVar {
   // instance variable
   public String iVar="instance variable";
    
   public void myMethod(){
    	// local variable
    	String locVar = "Inside Method";
    	System.out.println(locVar);
   }
   public static void main(String args[]){
      // Creating object
      LocalVar obj = new LocalVar();
  System.out.println("Calling Method");
      obj.myMethod();
      System.out.println(obj.locVar);
   }
}
