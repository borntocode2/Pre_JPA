package ex_tkdthr;

public class Book extends Item{
    private String author;
    private String isbn;

    public Book(String name, int price, String author, String isbn){
        super(name, price);
        this.author = author;
        this.isbn = isbn;
    }


}
