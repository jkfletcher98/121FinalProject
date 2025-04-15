import java.util.*;
import java.io.*;

class Library {
	ArrayList books = [];

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
