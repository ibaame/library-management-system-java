

import java.util.ArrayList;

public class BookDataBase {

	ArrayList<Book> allBooks;
	
	public BookDataBase() {
		allBooks = new ArrayList<>();
	}
	
	public void addBook(Book book){
		allBooks.add(book);
	}
	
	public ArrayList<Book> getAllBooks(){
		return allBooks;
	}
	
	public void displayBooks() {
		int num = 0;
		for(Book book : getAllBooks())
			System.out.println("~~ " + ++num + " " + book.toString() );
	}
	
}
