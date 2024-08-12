package co.istad.jparelationship2.Controller;


import co.istad.jparelationship2.Publisher;
import co.istad.jparelationship2.request.PublisherRequest;
import co.istad.jparelationship2.service.PublisherService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/publisher")
public class PublisherController {

    private final PublisherService publisherService;

    public PublisherController(PublisherService publisherService) {
        this.publisherService = publisherService;
    }

    @PostMapping("/add")
    public ResponseEntity<?> addPublisher(@RequestBody PublisherRequest publisherRequest){
        Publisher publisher = publisherService.addPublisher(publisherRequest);
        return ResponseEntity.ok(publisher);
    }
}
