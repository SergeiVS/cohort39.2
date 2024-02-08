package bookReader.service;

import bookReader.entity.Book;

import java.util.List;
import java.util.Optional;

public class BookPrintService {


    public void printFindResult(Optional<Book> foundBook, String searchTitle) {
        if (foundBook.isPresent()) {
            System.out.println("Найденная книга: " + foundBook.get());
        } else {
            System.out.println("Книга с названием \"" + searchTitle + "\" не найдена.");
        }
    }
}