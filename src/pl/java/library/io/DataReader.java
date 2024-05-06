package pl.java.library.io;

import pl.java.library.model.Book;
import pl.java.library.model.Magazine;

import java.util.Scanner;

public class DataReader {
    private Scanner input = new Scanner(System.in);

    public Book readAndCreateBook() {
        System.out.println("Tytuł");
        String title = input.nextLine();
        System.out.println("Autor:");
        String author = input.nextLine();
        System.out.println("Wydawnictwo");
        String publisher = input.nextLine();
        System.out.println("ISBN:");
        String isbn = input.nextLine();
        System.out.println("Rok wydania:");
        int year = input.nextInt();
        input.nextLine();
        System.out.println("Liczba stron");
        int pages = input.nextInt();

        return new Book(title, author, year, pages, publisher, isbn);
    }

    public Magazine readAndCreateMagazine() {
        System.out.print("Tytuł: ");
        String title = input.nextLine();
        System.out.print("Wydawnictwo: ");
        String publisher = input.nextLine();
        System.out.print("Język: ");
        String language = input.nextLine();
        System.out.print("Rok wydania: ");
        int year = getInt();
        System.out.print("Miesiąc: ");
        int month = getInt();
        System.out.print("Dzień: ");
        int day = getInt();

        return new Magazine(title, publisher, language, year, month, day);
    }

    public int getInt() {
        int number = input.nextInt();
        input.nextLine();
        return number;
    }

    public void close() {
        input.close();
    }
}
