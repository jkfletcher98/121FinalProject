import java.util.*;
import java.io.*;

class Library {
	BookList books = new BookList();

	public static void main(String[] args){
		new Library();
	}

	public Library(){
		//this.loadSampleBooks();
		this.loadBooks();
		this.process();
	}

	public void loadSampleBooks(){
		books.add(new Book("Book 1", "Author 1", "Fantasy", "W-1"));
		books.add(new Book("Book 2", "Author 2", "History", "W-1"));
		books.add(new Book("Book 3", "Author 3", "Biography", "W-1"));
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
				this.searchMenu();
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
		books.sort(Comparator.comparing(Book::getTitle));

		for (Book b: books){
			b.printBook();
		} // end for loop
		System.out.println();
	} // end printLibrary

	public void searchMenu(){
		Scanner input = new Scanner(System.in);

		System.out.println();
		System.out.println("How would you like to search?");

		System.out.println("0) Title");
		System.out.println("1) Author");
		System.out.println("2) Genre");

		String response = input.nextLine();

		if (response.equals("0")){
			this.searchByTitle();
		} else if (response.equals("1")){
			this.searchByAuthor();
		} else if (response.equals("2")){
			this.searchByGenre();
		} else {
			System.out.println("Please enter 0-2");
		} // end if
	}// end searchMenu

	public Book findBook(String search){
		Book result = null;

		for (Book b: books){
			if (search.equals(b.title)){
				result = b;
			} // end if
		} // end for
		return result;
	} // end findBook

	public void searchByTitle(){
		Scanner input = new Scanner(System.in);
		System.out.println();

		System.out.println("What are you looking for?" );
		String search = input.nextLine();

		Book result = this.findBook(search);

		if (result == null){
			System.out.println("Book not found");
		} else {
			result.printBook();
		} //end if
		System.out.println();
	} // end searchByTitle

	public void searchByGenre(){
		Scanner input = new Scanner(System.in);
		System.out.println();

		System.out.println("What genre are you looking for?");
		String search = input.nextLine();

		for (Book b: books){
			if (search.equals(b.genre)){
				b.printBook();
			} // end if
		} // end for

		System.out.println();
	} // end searchByGenre

	public void searchByAuthor(){
		Scanner input = new Scanner(System.in);
		System.out.println();

		System.out.println("Who are you looking for?");
		String search = input.nextLine();

		for (Book b: books){
			if (search.equals(b.author)){
				b.printBook();
			} // end if
		} // end for

		System.out.println();
	} // end searchByAuthor


	public void editBook(){
		Scanner input = new Scanner(System.in);
		System.out.println();

		System.out.println("What would you like to edit?");
		String search = input.nextLine();

		Book result = this.findBook(search);

		if (result == null){
			System.out.println("Book not found");
		} else {
			result.printBook();
			result.edit();

			this.saveBooks();
			System.out.println("Book updated!");
		} // end if

		System.out.println();

	} // end editBook

	public void addBook(){
		Scanner input = new Scanner(System.in);

		System.out.println();
		System.out.println("Input new book!");
		System.out.println("Title: ");
		String newTitle = input.nextLine();
		System.out.println("Author: ");
		String newAuthor = input.nextLine();
		System.out.println("Genre: ");
		String newGenre = input.nextLine();
		System.out.println("Location: ");
		String newLocation = input.nextLine();

		books.add(new Book(newTitle, newAuthor, newGenre, newLocation));
		this.saveBooks();

		System.out.println("Book added!");
		System.out.println();
	} // end addBook

	public void removeBook(){
		Scanner input = new Scanner(System.in);
		
		boolean keepGoing = true;
		while (keepGoing){
			System.out.println("What would you like to remove?");
			String search = input.nextLine();

			Book result = this.findBook(search);
		
			if (result != null){
				result.printBook();
				System.out.println("Is this correct?(y/n)");
				String confirm = input.nextLine();

				if (confirm.equals("y")){
					books.remove(result);
					this.saveBooks();
					System.out.println("Book removed!");
					keepGoing = false;
				} // end if
			} else {
				System.out.println("Book not found.");
				keepGoing = false;
			} // end if
		} // end while
	} // end removeBook

} // end Library

class BookList extends ArrayList<Book> {};
