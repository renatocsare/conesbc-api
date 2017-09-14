package br.com.agendadigital.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/agenda")
public class HomeController {
    
	@RequestMapping(method = RequestMethod.GET)
    public String index() {
        return "Greetings from Spring Boot!";
    }
    
}
