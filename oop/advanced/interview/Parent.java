class Child extends Parent {
    @Override
    public void execute() {
        super.execute(); //execute parent code first
        System.out.println("Execute child code ...");
    }
}



public class Parent {
     public void execute() {
          System.out.println("Execute parent code ...");
      }
      
    public static void main(String[] args) {
          Child c= new Child();
          c.execute();
    }
}