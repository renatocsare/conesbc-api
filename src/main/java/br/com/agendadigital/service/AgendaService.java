package br.com.agendadigital.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.agendadigital.domain.Evento;
import br.com.agendadigital.repository.AgendaRepository;


@Service
public class AgendaService {
	
	@Autowired
	private AgendaRepository repository;
	
	public Evento add(Evento evento) {
		evento = repository.save(evento);
		return evento;
	}
	
	public Evento get(String id) {
		return repository.findOne(id);
	}
	
	public void update(Evento evento) {
		repository.save(evento);
	}
	
	public void delete(String id) {
		repository.delete(id);
	}

}
