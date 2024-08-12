package co.istad.jparelationship2.service.serviceImpl;


import co.istad.jparelationship2.Book;
import co.istad.jparelationship2.BookPublisher;
import co.istad.jparelationship2.Publisher;
import co.istad.jparelationship2.Repository.BookPublisherRepo;
import co.istad.jparelationship2.exception.NotFoundException;
import co.istad.jparelationship2.request.BookPublisherRequest;
import co.istad.jparelationship2.service.BookPublisherService;
import co.istad.jparelationship2.service.BookService;
import co.istad.jparelationship2.service.PublisherService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor

public class BookPublisherServiceImpl implements BookPublisherService {
    private final BookPublisherRepo bookPublisherRepo;
    private final BookService bookService;
    private final PublisherService publisherService;
    @Override
    public BookPublisher addBookPublisher(BookPublisherRequest bookPublisherRequest) {
       Optional<Book> book =bookService.findBookById(bookPublisherRequest.getBookId());
       if(book.isEmpty()){
          throw new NotFoundException("id is not exist");
       }

       Optional<Publisher> publisher = publisherService.findPublisherId(bookPublisherRequest.getPublisherId());
       if(publisher.isEmpty()){
           throw new NotFoundException("id not found");
       }

       BookPublisher bookPublisher = new BookPublisher();
       bookPublisher.setBook(book.get());
       bookPublisher.setPublisher(publisher.get());
       bookPublisher.setPublisheDate(bookPublisherRequest.getPublishedDate());

       return bookPublisherRepo.save(bookPublisher);

    }
}
