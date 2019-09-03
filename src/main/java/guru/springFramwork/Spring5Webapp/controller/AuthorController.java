package guru.springFramwork.Spring5Webapp.controller;

import guru.springFramwork.Spring5Webapp.repository.AuthorRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AuthorController {
    private AuthorRepository authorRepository;

    public AuthorController(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }
    @RequestMapping("/Authors")
    public String getAuthor(Model model){
        model.addAttribute("authors",authorRepository.findAll());
        return "authors";
    }
}
