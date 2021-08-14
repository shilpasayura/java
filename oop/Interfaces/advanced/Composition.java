import java.io.*;
import java.util.*;

class Book{
	public String title;
	public String author;
	
	Book(String title, String author){
		this.title = title;
		this.author = author;
	}
}

class Library{

	//list of books.
	private final List<Book> books;
	
	Library (List<Book> books){
		this.books = books;
	}
	
	public List<Book> getBooksInLibrary(){	
	return books;
	}
}

public class Composition{
   public static void main (String[] args){
	Book b1 = new Book("Java", "Ama");
	Book b2 = new Book("C++", "Bima");
	Book b3 = new Book("Python", "Cima");
	List<Book> books = new ArrayList<Book>();
	books.add(b1);
	books.add(b2);
	books.add(b3);
		
	Library library = new Library(books);	
	List<Book> bks = library.getBooksInLibrary();
	for(Book bk : bks){
		System.out.println("Title : " + bk.title + " and " +" Author : " + bk.author);
	}
   }
}
