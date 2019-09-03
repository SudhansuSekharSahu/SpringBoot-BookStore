package guru.springFramwork.Spring5Webapp.bootStrap;

import guru.springFramwork.Spring5Webapp.model.Author;
import guru.springFramwork.Spring5Webapp.model.Book;
import guru.springFramwork.Spring5Webapp.model.Publisher;
import guru.springFramwork.Spring5Webapp.repository.AuthorRepository;
import guru.springFramwork.Spring5Webapp.repository.BookRepository;
import guru.springFramwork.Spring5Webapp.repository.PublisherRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private AuthorRepository authorRepository;
    private BookRepository bookRepository;
    private PublisherRepository publisherRepository;

    public DevBootstrap(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }
    private void initData() {
        Publisher harperColin = new Publisher();
        harperColin.setName("Hareper Colin");
        Author eric = new Author("Eric", "Evens");
        Book ddd = new Book("Domain Devin Design", "1234",harperColin);

        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);

        authorRepository.save(eric);
        publisherRepository.save(harperColin);
        bookRepository.save(ddd);

        Publisher work = new Publisher();
        work.setName("Work");
        Author rod = new Author("Rod","Johnson");
        Book noEJB = new Book("J2EE devlopment without EJB", "23444",work);

        rod.getBooks().add(noEJB);
        noEJB.getAuthors().add(rod);
        authorRepository.save(rod);
        publisherRepository.save(work);
        bookRepository.save(noEJB);
}

}