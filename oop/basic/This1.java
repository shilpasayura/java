class Person {
   private String name;

   // Getter
   public String getName() {
     return this.name;
   }

   // Setter
   public void setName(String newName) {
     this.name = newName;
   }
}

public class This1 {
  public static void main(String[] args) {
    Person myObj = new Person();
    // following code give access error
    // name is private 
    //myObj.name = "Ama";
    //System.out.println(myObj.name);
    myObj.setName("Bima");
    System.out.println(myObj.getName());
  }
}
