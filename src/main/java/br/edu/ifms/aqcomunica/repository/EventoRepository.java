package br.edu.ifms.aqcomunica.repository;

import org.springframework.data.repository.CrudRepository;

import br.edu.ifms.aqcomunica.model.Evento;

public interface EventoRepository extends CrudRepository<Evento, String> {

	Evento findById(long id);
}
