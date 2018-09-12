package Classes;

public class Book {

    private String name;
    private String isbn;
    private double price;

    public Book(String name, String isbn, double price) {
        this.name = name;
        this.isbn = isbn;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Book() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "Book name: " + name + " ISBN: " + isbn + "Price: "+price+"\n";
    }
}
