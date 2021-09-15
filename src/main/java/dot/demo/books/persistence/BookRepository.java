package dot.demo.books.persistence;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import dot.demo.books.domain.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {
}

