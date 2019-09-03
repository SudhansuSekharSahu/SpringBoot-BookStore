package guru.springFramwork.Spring5Webapp.repository;

import guru.springFramwork.Spring5Webapp.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book,Long> {
}
