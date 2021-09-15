package dot.demo.books.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dot.demo.books.domain.Book;
import dot.demo.books.persistence.BookRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public List<Book> getAllBooks() {
        List<Book> books = new ArrayList<>();
        bookRepository.findAll().forEach(books::add);
        return books;
    }

    public Book getBook(Long id) {
        return bookRepository.findById(id).orElseGet(Book::new);
    }

    public void addBook(Book book) {
        bookRepository.save(book);
    }

    public void updateBook(Long id, Book book) {
        bookRepository.save(book);
    }

    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }

}
