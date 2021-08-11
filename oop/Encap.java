public class Encap {
   private String name;
   private int age;

   public int getAge() {
      return age;
   }

   public String getName() {
      return name;
   }

   public void setAge( int newAge) {
      age = newAge;
   }

   public void setName(String newName) {
      name = newName;
   }
}

public class RunEncap {

   public static void main(String args[]) {
      Encap encap = new Encap();
      encap.setName("Ama");
      encap.setAge(20);

 System.out.print("Name : " + encap.getName() + " Age : " + encap.getAge());
   }
}
