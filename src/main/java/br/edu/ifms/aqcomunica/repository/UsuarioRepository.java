package br.edu.ifms.aqcomunica.repository;

import org.springframework.data.repository.CrudRepository;

import br.edu.ifms.aqcomunica.model.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, String> {

	Usuario findById(long id);
}
