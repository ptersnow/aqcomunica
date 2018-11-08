package br.edu.ifms.aqcomunica.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.edu.ifms.aqcomunica.model.Categoria;
import br.edu.ifms.aqcomunica.repository.CategoriaRepository;

@Controller
public class CategoriaController {
	@Autowired
	private CategoriaRepository cr;
	
	@RequestMapping(value="/cadastrarCategoria", method=RequestMethod.GET)
	public String cadastrarCategoria() {
		return "cadastrarCategoria";
	}
	
	@RequestMapping(value="/cadastrarCategoria", method=RequestMethod.POST)
	public String cadastrarCategoria(Categoria categoria) {
		cr.save(categoria);
		return "redirect:/cadastrarCategoria";
	}
}
