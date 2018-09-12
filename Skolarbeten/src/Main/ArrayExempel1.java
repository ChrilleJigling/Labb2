
package Main;

import Classes.Book;
import Classes.BookListManager;
import java.util.Scanner;

public class ArrayExempel1 {
   static boolean loop = true;
   static Scanner sc = new Scanner(System.in);
   static BookListManager myBookListManager = new BookListManager();
   
    public static void main(String[] args) {
        
        while (loop) {
            switchChoice(menu());
        }
       
    }
    public static void switchChoice(int choice) {
        switch(choice){
        case 0:
            System.exit(0);
            break;
        case 1: 
            System.out.print("Book name: ");
            String name = readText();
            System.out.print("Book isbn: ");
            String isbn = readText();
            System.out.println("Book price: ");
            double price = sc.nextDouble();
            sc.nextLine();
            Book b=new Book(name, isbn, price);
            myBookListManager.addBook(b);
            break;
        case 2:
            System.out.println("Which index you want to remove: ");
            myBookListManager.deleteBook(readNumber());
            break;
        case 3:
            System.out.println("Which book do you want to get?: ");
           Book book = myBookListManager.getBook(readNumber());
            System.out.println(book);
            break;
        case 4:
            System.out.println(myBookListManager.toString());
            
            break;
        case 5:
            System.out.println("Which book do you want to print?: ");
            myBookListManager.printBook(readNumber());
            break;
        case 6:
            myBookListManager.clearList();
            System.out.println("The list is cleared");
            break;
        case 7:
            int size = myBookListManager.size();
            System.out.println("The size is: "+size);
            break;
        case 8:
            System.out.println("Input isbn on book you want to update:");
            String isbnchoice = readText();
            myBookListManager.updateBook(isbnchoice);
            break;
        case 9:
            myBookListManager.sortBookByPrice();
            System.out.println(myBookListManager.toString());
            System.out.println("Your list is now sorted by price");
            break;
        default:
            System.out.println("Invalid choice! choose between 0-6");
            
            
        
    }       
    }
    
    public static int menu() {
        System.out.println("1. Add book");
        System.out.println("2. Delete book");
        System.out.println("3. Get book");
        System.out.println("4. List books");
        System.out.println("5. Print book");
        System.out.println("6. Clear list");
        System.out.println("7. Print size");
        System.out.println("8. Update title");
        System.out.println("9. Sort book by price");
        System.out.println("0. Exit");
        System.out.println("Make a choice: ");
        return readNumber();
        
        }
    public static int readNumber() {
        int tal = sc.nextInt();
        sc.nextLine();
        return tal;
    } 
    public static String readText() {
        String text = sc.nextLine();
        return text;           
    }
    public


