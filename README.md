# 121FinalProject
### Personal Library Database
Add and remove books; print entire collection; search for books by title, author, genre, series, and location

## Book
```
implements serilizable

String title
String author
String genre
String location

void printBook()
	" title by author (location)"

void edit()
	printBook
	ask for title
	ask for author
	ask for genre
	ask for location
	append book
```

## Library
```
arraylist books

void printLibrary()
	for each book in books
		printBook

void addBook()
	ask for title, author, genre, and location
	append new book to books

void removeBook()
	search for book
	delete

void search()
	ask how they would like to search
	byTitle()
		ask for title
		if book title matches
			printBook
	byAuthor()
		ask for author
		if book author matches
			printBook
	byGenre()
		ask for genre
		if book genre matches
			printBook

void editBook()
	book edit

string menu()
	0) Exit
	1) Print library
	2) Search
	3) Edit book
	4) Add book
	5) Remove book
	get response
	return response

void process()
	start menu
	create keepGoing loop
		if response is 0
			end loop
		if response is 1
			printLibrary
		if response is 2
			search
		if response is 3
			edit
		if response is 4
			addBook
		if response if 5
			removeBook
		else
			error

saveBooks()
	file io

loadBooks()
	file io
```	
