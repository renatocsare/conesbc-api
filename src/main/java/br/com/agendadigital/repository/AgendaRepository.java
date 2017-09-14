package br.com.agendadigital.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import br.com.agendadigital.domain.Evento;

public interface AgendaRepository extends CrudRepository<Evento, String> {

	List<Evento> findAll();

}
