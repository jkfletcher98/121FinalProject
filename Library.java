import java.util.*;
import java.io.*;

class Library {
	BookList books = new BookList();

	public Library(){
		this.loadSampleBooks();
	}

	public void loadSampleBooks(){
		new book("Book 1", "Author 1", "Genre 1", "W-1");
		new book("Book 2", "Author 2", "Genre 2", "W-1");
		new book("Book 3", "Author 3", "Genre 3", "W-1");
	} // end loadSampleBooks

	public void saveBooks(){
		try {
			FileOutputStream fo = new FileOutputStream("library.txt");
			ObjectOutputStream obOut = newObjectOutputStream(fo);
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
			books = (BookList)onIn.readObject();
			obIn.close;
			fi.close;
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

		return reponse;
	} // end menu

	public void process(){
		String response = menu();
		boolean keepGoing = true;
		while (keepGoing) {
			String response = menu();
			if (response.equals("0")){
				keepGoing = false;
			} else if (response.equals("1")){
				this.printLibrary();
			} else if (response.equals("2")){
				this.search();
			} else if (response.equals("3")){
				this.editBook();
			} else if (reponse.equals("4")){
				this.addBook();
			} else if (response.equals("5")){
				this.removeBook();
			} else {
				System.out.println("Please enter 0-5");
			} // end if
		} // end while
	} // end process

	public String findBook(){
		Scanner input = new Scanner(system.in);

		System.out.println("What are you looiking for?" );
		String response = input.nextLine();

		for (book in books){
			if (response.equals(book.title)){
				return book;
			} else {
				return null;
			} // end if
		}// end for
	}// end findBook

} // end Library

class BookList extends ArrayList<Book> {};
