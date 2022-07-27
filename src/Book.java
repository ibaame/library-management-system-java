

public class Book {

	private String author ;
	private int pages;
	private String title;
	private int copies;
	private int borrowed;
	
	public Book() {}

	public Book(String title, String author, int pages,  int copies) {
		this.title = title;
		this.author = author;
		this.pages = pages;
		this.copies = copies;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getCopies() {
		return copies;
	}

	public void setCopies(int copies) {
		this.copies = copies;
	}
	
	public int getBorrowed() {
		return borrowed;
	}

	public void setBorrowed() {
		borrowed += 1;
	}
	
	public boolean isAvailable() {
		
		if(getCopies() > getBorrowed())
			return true;
		return false; // copies <= borrowed
	}
	
	@Override
	public String toString() {
		String txt = "";
		txt += "Book ~~\n";
		txt += "title: " + getTitle() + "\n";
		txt += "author: " + getAuthor() + "\n";
		txt += "pages: " + getPages() + "\n";
		txt += "copies: " + getCopies() + "\n";
		txt += "Borrow: " + getBorrowed()+ "\n";
		
		if(isAvailable() == true)
			txt += "Book is an Available\n";
		else 
			txt += "Book is not Available\n";
		return txt;
		
	}

}
