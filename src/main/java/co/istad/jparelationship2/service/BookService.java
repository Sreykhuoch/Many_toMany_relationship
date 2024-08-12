package co.istad.jparelationship2.service;

import co.istad.jparelationship2.Book;
import co.istad.jparelationship2.request.BookRequest;

import java.util.Optional;


public interface BookService {
    Book addBook(BookRequest bookRequest);
    Optional<Book> findBookById(Integer id);
}
