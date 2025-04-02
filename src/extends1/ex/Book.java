package extends1.ex;

public class Book extends Item {

    private String author;
    private String isbn;

    public Book(String name, int price, String author, String isbn) {
        this.name = name;
        this.price = price;
        this.author = author;
        this.isbn = isbn;
    }
}
