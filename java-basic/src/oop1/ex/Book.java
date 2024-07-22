package oop1.ex;

public class Book {
    String title;
    String author;
    int page;

    Book(String title, String author, int page){
        this.page = page;
        this.title = title;
        this.author = author;
    }
    Book(String title, String author){
        this.page = 0;
        this.title = title;
        this.author = author;

    }
}
