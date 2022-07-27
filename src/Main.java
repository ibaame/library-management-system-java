

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BookDataBase bookDataBase =  new BookDataBase();
		Book book1 =new Book("Core Java Volume I – Fundamentals","Cay S. Horstmann", 750, 5);
		Book book2 = new Book("Effective Java", "Oshua Bloch", 800, 6);
		Book book3 = new Book("Java: A Beginner’s Guide","Herbert Schildt",1520,4);
		Book book4 = new Book("Java - The Complete Reference", "Herbert Schildt", 447, 3);
		Student std1 = new Student("111", "Abdulrahman", "Alalawi", "Alalawiiu@gmail.com", "abcd", true);
		Student std2 = new Student("441", "Abdullah", "Nasser", "reader@gmail.com", "esd", true);
		book1.setBorrowed();
		book1.setBorrowed();
		book4.setBorrowed();
		bookDataBase.addBook(book1);
		bookDataBase.addBook(book2);
		bookDataBase.addBook(book3);
		bookDataBase.addBook(book4);
		bookDataBase.displayBooks();
		std1.borrow(book1);
		std1.borrow(book4);
		std2.borrow(book1);
		System.out.println(std1.toString());
		std1.displayStudentBooks();		
	
	}

}
