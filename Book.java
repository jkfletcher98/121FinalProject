import java.util.*;
import java.io.*;

class Book implements Serializable{
	String title;
	String author;
	String genre;
	String location;

	public Book(){
		this.title = "";
		this.author = "";
		this.genre = "";
		this.location = "";
	} // end constructor

	public Book(String title, String author, String genre, String location){
		this.title = title;
		this.author = author;
		this.genre = genre;
		this.location = location;
	} // end constructor

	public void setTitle(String title){
		this.title = title;
	} // end setTitle

	public String getTitle(){
		return this.title;
	} // end getTitle

	public void setAuthor(String author){
		this.author = author;
	} // end setAuthor

	public String getAuthor(){
		return this.author;
	} // end getAuthor

	public void setGenre(String genre){
		this.genre = genre;
	} // end setGenre

	public String getGenre(){
		return this.genre;
	} // end getGenre

	public void setLocation(String location){
		this.location = location;
	} // end setGenre

	public String getLocation(){
		return this.location;
	} // end getLocation

	public void printBook(){
		System.out.println(this.title + " by " + this.author + "(" + this.location + ")");
	} // end printBook

	public void edit(){
		Scanner input = new Scanner(System.in);

		System.out.println("Leave items blank if they don't need to be changed.");

		System.out.println("Title:");
		String editTitle = input.nextLine();
		if (editTitle != ""){
			this.title = editTitle;
		} // end if

		System.out.println("Author:");
		String editAuthor = input.nextLine();
		if (editAuthor != ""){
			this.author = editAuthor;
		} // end if

		System.out.println("Genre:");
		String editGenre = input.nextLine();
		if (editGenre != ""){
			this.genre = editGenre;
		} // end if

		System.out.println("Location:");
		String editLocation = input.nextLine();
		if (editLocation != ""){
			this.location = editLocation;
		} // end if
	} // end edit

} // end class def
