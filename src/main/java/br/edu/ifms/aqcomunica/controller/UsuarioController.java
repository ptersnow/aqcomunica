package br.edu.ifms.aqcomunica.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.edu.ifms.aqcomunica.model.Usuario;
import br.edu.ifms.aqcomunica.repository.UsuarioRepository;

@Controller
public class UsuarioController {
	@Autowired
	private UsuarioRepository ur;
	
	@RequestMapping(value="/cadastrarUsuario", method=RequestMethod.GET)
	public String cadastrarUsuario() {
		return "cadastrarUsuario";
	}
	
	@RequestMapping(value="/cadastrarUsuario", method=RequestMethod.POST)
	public String cadastrarUsuario(Usuario usuario) {
		ur.save(usuario);
		return "redirect:/";	//trocar para redirecionar para página de login
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String logarUsuario(Usuario usuario) {
		ur.getClass();						//COMPARAR SE OS DADOS INSERIDOS EXISTEM NO BANCO DE DADOS
		return "redirect:/";
	}
}
