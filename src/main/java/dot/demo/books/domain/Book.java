package dot.demo.books.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import java.util.Date;

@Entity
public class Book {

    @Id
    @SequenceGenerator(name = "idSeqGen", sequenceName = "id_seq",
    initialValue = 1001, allocationSize = 1)
   @GeneratedValue(generator = "idSeqGen")
    private Long id  ;
    private String title = "";
    private Date publishDate = null;
    private String author = "";
    private String type = "";
    private double price = 0;
    private int numOfPages = 0;
    private String publisher = "";
    private String language = "";
    private String isbn = "";


    public Book() {
    }

    public Book(Long id, String title, Date publishDate, String author, String type, double price, int numOfPages, String publisher, String language, String isbn13) {
        this.id = id;
        this.title = title;
        this.publishDate = publishDate;
        this.author = author;
        this.type = type;
        this.price = price;
        this.numOfPages = numOfPages;
        this.publisher = publisher;
        this.language = language;
        this.isbn = isbn13;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public String getAuthor() {
        return author;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public int getNumOfPages() {
        return numOfPages;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getLanguage() {
        return language;
    }

    public String getIsbn() {
        return isbn;
    }
}
