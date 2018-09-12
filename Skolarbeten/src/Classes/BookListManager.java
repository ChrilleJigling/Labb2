package Classes;

import java.util.Scanner;

public class BookListManager {

    static Scanner sc = new Scanner(System.in);
    Book[] books = new Book[10];
    int count = 0;

    public void addBook(Book b) {
        books[count] = b;
        count++;
        if (books.length == count) {
            Book[] tempList = new Book[count * 2];
            for (int i = 0; i < books.length; i++) {
                tempList[i] = books[i];
            }
            books = tempList;
        }
    }

    public void deleteBook(int index) {
        count--;
        books[index] = books[count];
        books[count] = null;

    }

    public void clearList() {
        for (int i = 0; i < count; i++) {
            books[i] = null;
        }
        count = 0;
    }

    public Book getBook(int index) {
        return books[index];
    }

    public void printBook(int index) {
        System.out.println(books[index]);
    }

    @Override
    public String toString() {
        String info = "";
        for (int i = 0; i < count; i++) {
            info += books[i].toString();
        }
        return info;
    }

    public int size() {
        return count;
    }

    public Book getBookByIsbn(String isbn) {
        for (int i = 0; i < count; i++) {
            if (books[i].getIsbn().equalsIgnoreCase(isbn)) {
                return books[i];
            }
        }
        return null;
    }

    public void updateBook(String isbn) {
        Book b = getBookByIsbn(isbn);
        if (b == null) {
            System.out.println("No such book");
        } else {
            System.out.print("New name for book: ");
            String newName = sc.nextLine();
            b.setName(newName);
        }
    }

    public void sortBookByPrice() {
        int n = books.length;
        Book temp;
        boolean swapped = false;
        for (int i = 0; i < count - 1; i++) {
            for (int j = 1; j < (count - i); j++) {
                if (books[j - 1].getPrice() > books[j].getPrice()) {
                    temp = books[j - 1];
                    books[j - 1] = books[j];
                    books[j] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }

    }
}
