package libraryApp.service;

import libraryApp.entity.Book;
import libraryApp.repository.BookRepository;
import libraryApp.service.InputOutput.InputData;

import java.util.ArrayList;
import java.util.List;

public class LibraryServices {

    BookRepository repository = new BookRepository();
    public List<Book> createLibrary() {
        return repository.getRepository();
    }

    public void fillLibrary(List<Book> ourLibrary, int numberOfElementsAdd){
        InputData inputData = new InputData();
        for (int i = 0; i < numberOfElementsAdd; i++) {
            Book newBook = inputData.inputNewBook();
            ourLibrary.add(newBook);
        }
    }

    public List<Book> searchBook(List<Book> ourLibrary, String searchCriteria){
        ArrayList<Book> booksAfterSearch = new ArrayList<>();
        for (int i = 0; i < ourLibrary.size(); i++) {
            if (searchCriteria.equals(ourLibrary.get(i).getNameOfBook())) {
              booksAfterSearch.add(ourLibrary.get(i));
            }
        }
        return booksAfterSearch;
    }

    public void deleteBook(List<Book> ourLibrary, List<Book> booksForDelete){
        for (int i = 0; i < booksForDelete.size(); i++) {
            ourLibrary.remove(booksForDelete.get(i));
        }
    }

    public void addElementIntoOurLibrary(List<Book> ourLibrary, Book newBook, boolean idHead){
        if (idHead) {
            ourLibrary.add(0,newBook);
        } else {
            ourLibrary.add(newBook);
        }
    }


}
