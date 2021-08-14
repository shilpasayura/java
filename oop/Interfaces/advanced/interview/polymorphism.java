//public 
interface Base {
   public void execute();
}

//public 
class Concrete implements Base {
    @Override
    public void execute() {
        System.out.println("Execute concrete code ...");
    }

}

class Concrete1 implements Base {
    @Override
    public void execute() {
        System.out.println("Execute concrete2 code ...");
    }

}


public class polymorphism {
    
    public static void main(String[] args) {
          Concrete c= new Concrete();
          c.execute();
          Concrete1 c1= new Concrete1();
          c1.execute();
    }
}
