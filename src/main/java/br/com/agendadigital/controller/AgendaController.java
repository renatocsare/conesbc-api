package br.com.agendadigital.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.agendadigital.domain.Evento;
import br.com.agendadigital.service.AgendaService;

@RestController
@RequestMapping("/api/agenda")
public class AgendaController {
    
	@Autowired
	private AgendaService service;
	
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Evento> addEvento(@RequestBody Evento evento) {
		System.out.println("Adicionando Evento: " + evento);

		evento = service.add(evento);

		return new ResponseEntity<Evento>(evento, HttpStatus.CREATED);
	}

	@RequestMapping(value="{id}", method = RequestMethod.GET)
	public ResponseEntity<Evento> getEvento(@PathVariable("id") String id) {
		System.out.println("Recuperando Evento: " + id);

		Evento evento = service.get(id);

		return new ResponseEntity<Evento>(evento, HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.PUT)
	public ResponseEntity<Evento> updateEvento(@RequestBody Evento evento) {
		System.out.println("Atualizando Evento: " + evento.getId());

		service.update(evento);

		return new ResponseEntity<Evento>(evento, HttpStatus.OK);
	}

	@RequestMapping(value="/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Evento> deleteEvento(@PathVariable("id") String id) {
		System.out.println("Excluindo Evento: " + id);

		service.delete(id);

		return new ResponseEntity<Evento>(HttpStatus.OK);
	}
    
}
