package dot.demo.books.presentation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import dot.demo.books.application.BookService;
import dot.demo.books.domain.Book;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    private BookService bookservice;

    @GetMapping("/books")
    public List<Book> getAllBooks() {
        return bookservice.getAllBooks();
    }

    @GetMapping("/books/{id}")
    public Book getBook(@PathVariable(name = "id") String bookId) {
        return bookservice.getBook(Long.valueOf(bookId));
    }

    @PostMapping(value="/books", consumes="application/json")
    public void addBook(@RequestBody Book book) {
        bookservice.addBook(book);
    }

    @PutMapping(value="/books/{id}",  consumes="application/json")
    public void updateBook(@PathVariable(name = "id") String bookId, @RequestBody Book book) {
        bookservice.updateBook(Long.valueOf(bookId), book);
    }

    @DeleteMapping("/books/{id}")
    public void deleteBook(@PathVariable (name = "id") String bookId) {
        bookservice.deleteBook(Long.valueOf(bookId));
    }
}
