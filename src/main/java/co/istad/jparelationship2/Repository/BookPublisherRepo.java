package co.istad.jparelationship2.Repository;


import co.istad.jparelationship2.BookPublisher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookPublisherRepo extends JpaRepository<BookPublisher, Integer> {
}
