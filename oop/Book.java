public class Book {
    private static int numBooks = 0;
    private int id;
    public String name;
  // Constrcture 
    Book(String name) {
        id = ++numBooks;
        this.name = name;
        this.id=id;
        System.out.println(name + " Num books : " + numBooks);
    }

private static void  printBook(Book B){
 System.out.println(B.name + " " + B.id);
 }

public static void main(String args[]){
  Book B1= new Book("Kandy");
  Book B2= new Book("Galle");

System.out.println(B1.name + " " + B1.id);
   printBook(B2);
   System.out.println("Num books : " + numBooks);
   }

}


