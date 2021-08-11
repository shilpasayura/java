public class Thisx2 {
  int x;
  static int y=6;
  
  // Constructor with a parameter
  public Thisx2(int x) {
    this.x = x;
  }


  public void MethodOne(){
    System.out.print("Hello ");
    this.MethodTwo(); 
  }
 
  public void MethodTwo(){
    //Calling a method using this.
    System.out.println("There");
  }
  
  static void MethodThree(){
    System.out.println(" Wow!");
    Thisx2.MethodFour();
  }
  
  static void MethodFour(){
    System.out.println(" Wow2!");
    System.out.println(Thisx2.y);
    
  }
  
   static void MethodFive(Thisx2 Obj){
    System.out.println(Obj.x);
  }
  
  // Call the constructor
  public static void main(String[] args) {
    Thisx2 myObj = new Thisx2 (5);
    System.out.println("Value of x = " + myObj.x);
    //this.exampleMethodTwo(); // non static canot be referenced from static context
    myObj.MethodOne();
    Thisx2.MethodThree();
    Thisx2.MethodFive(myObj);
  }
}



