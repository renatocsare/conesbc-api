package repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import domain.Evento;

public interface AgendaRepository extends CrudRepository<Evento, String> {

	List<Evento> findAll();

}
