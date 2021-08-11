public class EmployeeEx {

    private String firstName = null;
    private String lastName  = null;
    private int    birthYear = 0;
    
    public EmployeeEx() {
      System.out.println("Constructor 1");
    }
    
    public EmployeeEx(String first,String last, int year ) {
        firstName = first;
        lastName  = last;
        birthYear = year;
        System.out.println("Constructor 2");

    }

    public EmployeeEx(String first, String last){
        this(first, last, -1);
        System.out.println("Constructor 3");
    }
    
    public static void main(String[] args){
		  EmployeeEx emp1=new EmployeeEx();
        EmployeeEx emp2=new EmployeeEx("Ama", "Perera", 2000);
        EmployeeEx emp3=new EmployeeEx("Bima", "Silva");
	 }
}

