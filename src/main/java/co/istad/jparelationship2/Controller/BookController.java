package co.istad.jparelationship2.Controller;


import co.istad.jparelationship2.Book;
import co.istad.jparelationship2.request.BookRequest;
import co.istad.jparelationship2.service.BookService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping("/add")
    public ResponseEntity<?> addBook(@RequestBody BookRequest bookRequest){
        Book book = bookService.addBook(bookRequest);
        return ResponseEntity.ok(book);
    }
}
