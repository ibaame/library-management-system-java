

import java.util.ArrayList;

public class Student extends User{

	ArrayList<Book> studentBooks ;
	
	Student(String userID, String userFirstName, String userLastName, String emailAddress, String userPassword,boolean isActive){
		super(userID , userFirstName, userLastName, emailAddress, userPassword, isActive);
		studentBooks = new ArrayList<>();
	}
	
	public ArrayList<Book> getStudentBooks(){
		return studentBooks;
	}
	
	public void displayStudentBooks() {
		int num = 0;
		for(Book book : getStudentBooks())
			System.out.println("~~ " + ++num + " " + book.toString());
	}
	
	public void borrow(Book book) {
		studentBooks.add(book);
	}
	
	
	
}
