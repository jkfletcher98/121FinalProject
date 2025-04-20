Library.class: Library.java
	javac Library.java

Book.class: Book.java
	javac Book.java

run: Library.class
	java Library

debug: Library.class
	jdb Library
