# 121FinalProject
### Personal Library Database
Add and remove books; print entire collection; search for books by title, author, genre, series, and location

## hasMenu()
```
String menu()
void start()
```
## Book()
```
String title
String author
String genre
String location

create setters and getters for each variable

void printBook()
  book by author (location)
```

## Search
```
byTitle
  ask for title user wants
  search gets input
  go through each book in library
  if search is equal to book title
    printBook
  else
    "You don't have that book"

byAuthor
  ask for author user wants
  search gets input
  go through each book in library
  if serach is equal to book author
    printBook
  else
    "You don't have anything by that author"

byGenre
  ask for genre user wants
  search gets input
  go through each book in library
  if search is equal to book genre
    printBook
  else
    "You don't have anything in that genre"
```

## Library
```
library gets library file

printLibrary
  for each book in library
    printBook

addBook
  ask for title, author, genre, and location
  append new book to library

removeBook
  ask for book user wants to remove
  delete book from library

editBook
  ask for book user wants to edit
  ask for title, author, genre, and location
  update library
```
