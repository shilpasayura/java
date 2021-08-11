interface Info {
    public void showInfo();
}

interface IStartable {
    public boolean Xstartable(Info Obj);
}

class Machine implements Info {     
    private int id = 7;
    boolean Stb=true;
      
    Opx op = new Opx();
    
       
    public void start() {
        System.out.println("Machine started.");
    }
 
    public void showInfo() {
       System.out.println("Machine ID is: " + id);
    }
}

class Person implements Info {     
    private String name;
    private  boolean Stb=false;
    
    public Person(String name) {
        this.name = name;
    }
 
    public void greet() {
        System.out.println("Hello there.");
    }
 
    @Override
    public void showInfo() {
    System.out.println("Person name is: " + name);
    }
}

class Opx implements IStartable { 
    
    public boolean Xstartable(Info Obj){
      return Obj.Stb;
    };
  }    
    
    


public class ClassesInterfacesz {

    private static void outputInfo(Info info) {
        info.showInfo();
    }

    public static void main(String[] args) {         
        Machine mach1 = new Machine();
        mach1.start();
         
        Person person1 = new Person("Bimal");
        person1.greet();


        System.out.println(mach1.Xstartable(mach1));
        
        mach1.op.start();
        Info info2 = person1; // reference only
        info2.showInfo();
        System.out.println("----------------");    
        outputInfo(mach1);
        outputInfo(person1);
    }
}
