import java.util.*;
import java.io.*;

class Library {
	BookList books = new BookList();

	public static void main(String[] args){
		new Library();
	}

	public Library(){
		this.loadSampleBooks();
		this.process();
	}

	public void loadSampleBooks(){
		new Book("Book 1", "Author 1", "Genre 1", "W-1");
		new Book("Book 2", "Author 2", "Genre 2", "W-1");
		new Book("Book 3", "Author 3", "Genre 3", "W-1");
	} // end loadSampleBooks

	public void saveBooks(){
		try {
			FileOutputStream fo = new FileOutputStream("library.txt");
			ObjectOutputStream obOut = new ObjectOutputStream(fo);
			obOut.writeObject(books);
			obOut.close();
			fo.close();
		} catch(Exception e) {
			System.out.println(e.getMessage());
		} // end try
	} // end saveBooks

	public void loadBooks(){
		try {
			FileInputStream fi = new FileInputStream("library.txt");
			ObjectInputStream obIn = new ObjectInputStream(fi);
			books = (BookList)obIn.readObject();
			obIn.close();
			fi.close();
		} catch(Exception e) {
			System.out.println(e.getMessage());
		} // end try
	} // end loadBooks

	public String menu(){
		Scanner input = new Scanner(System.in);

		System.out.println("Your Library");
		System.out.println("0) Exit");
		System.out.println("1) Print library");
		System.out.println("2) Search");
		System.out.println("3) Edit book");
		System.out.println("4) Add book");
		System.out.println("5) Remove book");

		System.out.println("What would you like to do? ");
		String response = input.nextLine();

		return response;
	} // end menu

	public void process(){
		boolean keepGoing = true;
		while (keepGoing) {
			String response = menu();
			if (response.equals("0")){
				keepGoing = false;
			} else if (response.equals("1")){
				this.printLibrary();
			} else if (response.equals("2")){
				this.findBook();
			} else if (response.equals("3")){
				this.editBook();
			} else if (response.equals("4")){
				this.addBook();
			} else if (response.equals("5")){
				this.removeBook();
			} else {
				System.out.println("Please enter 0-5");
			} // end if
		} // end while
	} // end process

	public void printLibrary(){
		for (Book b: books){
			b.printBook();
		} // end for loop
	} // end printLibrary

	public String findBook(){
		Scanner input = new Scanner(System.in);

		System.out.println("What are you looiking for?" );
		String response = input.nextLine();

		String result = null;

		for (Book b: books){
			if (response.equals(b.title)){
				result = b.title;
			} // end if
		} // end for
		return result;
	} // end findBook

	public void editBook(){
		System.out.println("Under construction");
	} // end editBook

	public void addBook(){
		System.out.println("Under construction");
	} // end addBook

	public void removeBook(){
		System.out.println("Under construction");
	} // end removeBook

} // end Library

class BookList extends ArrayList<Book> {};
