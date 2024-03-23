package pl.java.library.app;

import pl.java.library.io.DataReader;
import pl.java.library.model.Book;

import java.util.Scanner;

class Library {

    public static void main(String[] args) {
        final String appName = "Biblioteka v0.8";

        Book[] books = new Book[1000];

        DataReader dataReader = new DataReader();

        books[0] = dataReader.readAndCreateBook();
        books[1] = dataReader.readAndCreateBook();
        dataReader.close();

        System.out.println(appName);
        System.out.println("Książki dostępne w bibliotece");
        books[0].printInfo();
        books[1].printInfo();
    }

}
