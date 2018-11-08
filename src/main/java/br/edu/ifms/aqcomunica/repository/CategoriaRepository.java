package br.edu.ifms.aqcomunica.repository;

import org.springframework.data.repository.CrudRepository;

import br.edu.ifms.aqcomunica.model.Categoria;

public interface CategoriaRepository extends CrudRepository<Categoria, String> {

	Categoria findById(long id);
}
