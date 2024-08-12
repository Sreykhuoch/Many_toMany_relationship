package co.istad.jparelationship2.service;

import co.istad.jparelationship2.BookPublisher;
import co.istad.jparelationship2.request.BookPublisherRequest;

public interface BookPublisherService {
    BookPublisher addBookPublisher(BookPublisherRequest bookPublisherRequest);

}
