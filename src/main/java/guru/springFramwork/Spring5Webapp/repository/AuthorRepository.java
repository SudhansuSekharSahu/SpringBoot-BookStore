package guru.springFramwork.Spring5Webapp.repository;

import guru.springFramwork.Spring5Webapp.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author,Long> {
}
