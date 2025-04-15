import java.util.*;
import java.io.*;

class Library {
	BookList books = new BookList;

	public void saveBooks(){
		try {
			FileOutputStream fo = new FileOutputStream("library.txt");
			ObjectOutputStream obOut = newObjectOutputStream(fo);
			obOut.writeObject(books);
			obOut.close();
			fo.close();
		} catch {
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
		} catch {
			System.out.println(e.getMessage());
		} // end try
	} // end loadBooks

	public void printLibrary(){
		for (book in books){
			book.printBook();
		} // end for
	} // end printLibrary

	public void addBook(){
		System.out.println("Title: ");
		System.out.println("Author: ");
		System.out.println("Genre: ");
		System.out.println("Location: ");
	} // end addBook

} // end Library

class BookList extends ArrayList<Book> {};
