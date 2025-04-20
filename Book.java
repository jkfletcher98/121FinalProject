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
		System.out.println(this.title + "by " + this.author + "(" + this.location + ")");
	} // end printBook

	public void edit(){
		this.printBook();
	} // end edit

} // end class def
