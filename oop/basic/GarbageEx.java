class Book{
  public String name ;
  public Book(String n){
     this.name =n;
      System.out.println(n + " : " + this);
   }
}

public class GarbageEx{
    public static void main(String args[]){
Book a = new Book ("A");
Book b = new Book ("B");
System.out.println(a.name);
System.out.println(b.name);
Book c = a; 
System.out.println(c + " " + c.name);
b = null;
c= null;
System.out.println(a + " " + a.name);
System.out.println(c);
a=c;
//System.out.println(a.name);
}
}

