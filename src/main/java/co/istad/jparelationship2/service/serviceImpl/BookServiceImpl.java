package co.istad.jparelationship2.service.serviceImpl;


import co.istad.jparelationship2.Book;
import co.istad.jparelationship2.Repository.BookRepo;
import co.istad.jparelationship2.exception.NotFoundException;
import co.istad.jparelationship2.request.BookRequest;
import co.istad.jparelationship2.service.BookService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class BookServiceImpl implements BookService {

    private final BookRepo bookRepo;
    @Override
    public Book addBook(BookRequest bookRequest) {
        Book book = new Book();
        book.setName(bookRequest.getName());
        return bookRepo.save(book);
    }

    @Override
    public Optional<Book> findBookById(Integer id) {
        return Optional.ofNullable(bookRepo.findById(id).orElseThrow(
                () -> new NotFoundException("Product is not found !")
        ));
    }
}
