package co.istad.jparelationship2.service;

import co.istad.jparelationship2.Publisher;
import co.istad.jparelationship2.request.PublisherRequest;

import java.util.Optional;

public interface PublisherService {
    Publisher addPublisher(PublisherRequest publisherRequest);
    Optional<Publisher> findPublisherId(Integer id);
}
