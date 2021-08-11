class Dog {
    private String name;
    private static int staticVariable=10; 
    public Dog (String n){
      this.name=n;
   }
   public String getID(){
      return this.name;
   }
    
}

public class DogTest {
    public static int ndogs=0;
    public static void main(String args[]) {
      String n;
      Dog[]	dogs = new Dog [5] ;
	   for (int i = 0; i < 5 ; i++){
            n="Dog " + Integer.toString(i);
         	dogs[i] =new Dog(n);
            ndogs++;
	   }
      
      System.out.println(ndogs);
	   
      for (int i = 0; i < ndogs ; i++){
         System.out.println(dogs[i].getID());
      }  
   }
}



/*
	       private int id;

*/