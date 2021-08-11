
class Student {
	public static String Name = "";

	public static void StudentName(String name){
		Name = name;
	}
}

public class StaticEx {
  public static void main(String[] args){
		  // Accessing the static method StudentName()
        // and field by class name itself.
      Student.StudentName("Ama");
		System.out.println(Student.Name);

		// Accessing the static method StudentName()
		// by using Object's reference.
		Student obj = new Student();
		obj.StudentName("Bima");
		System.out.println(obj.Name);
      System.out.println(Student.Name);

	}
}

