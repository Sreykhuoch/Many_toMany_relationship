package co.istad.jparelationship2.Repository;


import co.istad.jparelationship2.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepo extends JpaRepository<Book, Integer>{
}
