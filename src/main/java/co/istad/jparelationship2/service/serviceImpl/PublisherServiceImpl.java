package co.istad.jparelationship2.service.serviceImpl;


import co.istad.jparelationship2.Publisher;
import co.istad.jparelationship2.Repository.PublisherRepo;
import co.istad.jparelationship2.exception.NotFoundException;
import co.istad.jparelationship2.request.PublisherRequest;
import co.istad.jparelationship2.service.PublisherService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class PublisherServiceImpl implements PublisherService {
    private final PublisherRepo publisherRepo;
    @Override
    public Publisher addPublisher(PublisherRequest publisherRequest) {
        Publisher publisher = new Publisher();
        publisher.setName(publisherRequest.getName());
        return publisherRepo.save(publisher);
    }

    @Override
    public Optional<Publisher> findPublisherId(Integer id) {
        return Optional.ofNullable(publisherRepo.findById(id).orElseThrow(
                () -> new NotFoundException("Product is not found !")
        ));
    }
}
