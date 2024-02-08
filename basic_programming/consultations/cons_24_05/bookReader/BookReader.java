package bookReader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class BookReader {
    public static void main(String[] args) throws IOException {

        BookReaderService service = new BookReaderService();

        String filePath = "basic_programming/consultations/cons_24_05/bookReader/books.txt"; // Укажите актуальный путь к файлу
        List<Book> books = new ArrayList<>();

       BufferedReader reader = new BufferedReader(new FileReader(filePath));
            while (reader.ready()) {
                Book newBook = service.createBook(reader, books);
                service.addBook(books, newBook);
            }

        String searchTitle = "Преступление и наказание";

        Optional<Book> foundBook = service.findBook(books, searchTitle);

        service.printFindResult(foundBook, searchTitle);
    }


}