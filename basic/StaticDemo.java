public class StaticDemo{
   public static void main(String args[]){
     Student s1 = new Student("Ama");
     s1.showData();
     Student s2 = new Student("Bima");
     s2.showData();
     System.out.println("----Student.b++------------");
     Student.b++;
     s1.showData();
     s2.showData();
     System.out.println("-------Student.increment()---------");
     Student.increment();
     s1.showData();
     s2.showData();
     System.out.println("-----s1.b++-----------");
     s1.b++;
     s1.showData();
     s2.showData();
     System.out.println("-------s2.b++---------");
     s2.b++;
     s1.showData();
     s2.showData();
  }
}

class Student {
int a; //initialized to zero
//static int a; //initialized to zero
String name;
static int b; //initialized to zero only when class is loaded not for each object created.

  Student(String n){
   //Constructor incrementing static variable b
   this.name=n;
   b++;
  }

   public void showData(){
      System.out.println(name + " Value of a = "+ a);
      System.out.println(name + " Value of b = "+ b);
   }
   
  public static void increment(){
    //a++;
   }

}
