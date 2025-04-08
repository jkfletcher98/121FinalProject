Library.class: Library.java hasMenu.java
	javac Library.java

Search.class: Search.java hasMenu.java
	javac Search.class

hasMenu.class: hasMenu.java
	javac hasMenu.java

Book.class: Book.java
	javac Book.java

run: Library.class
	java Library

debug: Library.class
	jdb Library
