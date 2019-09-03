package guru.springFramwork.Spring5Webapp.repository;

import guru.springFramwork.Spring5Webapp.model.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher,Long> {
}
