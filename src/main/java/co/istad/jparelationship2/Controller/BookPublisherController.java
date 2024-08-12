package co.istad.jparelationship2.Controller;


import co.istad.jparelationship2.BookPublisher;
import co.istad.jparelationship2.request.BookPublisherRequest;
import co.istad.jparelationship2.service.BookPublisherService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bookPublisher")
public class BookPublisherController {
    private final BookPublisherService bookPublisherService;

    public BookPublisherController(BookPublisherService bookPublisherService) {
        this.bookPublisherService = bookPublisherService;
    }

    @PostMapping("/add")
    public ResponseEntity<?> addBookPublisher(@RequestBody BookPublisherRequest bookPublisherRequest){
        BookPublisher bookPublisher = bookPublisherService.addBookPublisher(bookPublisherRequest);
        return ResponseEntity.ok(bookPublisher);
    }
}
