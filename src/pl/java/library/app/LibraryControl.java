package pl.java.library.app;

import pl.java.library.io.DataReader;
import pl.java.library.model.Book;
import pl.java.library.model.Library;

public class LibraryControl {

    private static final int EXIT = 0;
    private static final int ADD_BOOK = 1;
    private static final int PRINT_BOOKS = 2;
    private DataReader dataReader = new DataReader();
    private Library library = new Library();

    public void controlLoop(){
        int option;
        do {
            printOptions();
            option = dataReader.getInt();
            switch (option){
                case ADD_BOOK:
                    addBook();
                    break;
                case PRINT_BOOKS:
                    printBooks();
                    break;
                case EXIT:
                    exit();
                    break;
                default:
                    System.out.println("Wybrano niepoprawną opcję. Spróbuj ponownie.");
            }
        } while (option != EXIT);
    }

    private void exit() {
        System.out.println("Zamykanie programu...");
        dataReader.close();
    }

    private void printBooks() {
        library.printBooks();
    }

    private void addBook() {
        Book book = dataReader.readAndCreateBook();
        library.addBook(book);
    }

    private void printOptions() {
        System.out.println("Wybierz opcję:");
        System.out.println(EXIT + " - wyjście z programu");
        System.out.println(ADD_BOOK + " - dodanie nowej książki");
        System.out.println(PRINT_BOOKS + " - wyświetl dostępne książki");
    }

}
