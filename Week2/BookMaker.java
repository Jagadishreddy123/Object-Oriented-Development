import java.util.Scanner;

import books.Book;
import factory.BookFactory;
import factory.CoolBookFactory;
import pages.Page;

public class BookMaker{
    public static void main(String[] args) {
        System.out.println("Welcome to Book Creator");
        System.out.println("What type of book you want to make Comic or History book?");
        Scanner input = new Scanner(System.in);
        String bookType = input.next();
        BookFactory bookFactory = new CoolBookFactory(bookType);
        Book newBook = bookFactory.createBook();

        if(newBook == null){
            System.out.println("You are not allowed to make "+ bookType + " type of book.");
            System.exit(0);
            input.close();
        }

        System.out.println("Core pages writer need to write are: " + newBook.pages.size());
        for (Page page : newBook.pages) {
            System.out.println(page.getClass().getSimpleName());
        }
        input.close();
    }
}