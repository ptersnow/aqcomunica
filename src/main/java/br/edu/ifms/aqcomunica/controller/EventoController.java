package br.edu.ifms.aqcomunica.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.edu.ifms.aqcomunica.model.Categoria;
import br.edu.ifms.aqcomunica.model.Evento;
import br.edu.ifms.aqcomunica.repository.CategoriaRepository;
import br.edu.ifms.aqcomunica.repository.EventoRepository;

@Controller
public class EventoController {

	@Autowired
	private EventoRepository er;

	@Autowired
	private CategoriaRepository cr;

	@RequestMapping("/")
	public ModelAndView listarEventos() {
		ModelAndView mv = new ModelAndView("index");
		Iterable<Evento> eventos = er.findAll();
		mv.addObject(eventos);

		return mv;
	}

	@RequestMapping("/{id}")
	public ModelAndView detalhesEvento(@PathVariable("id") long id) {
		Evento evento = er.findById(id);
		ModelAndView mv = new ModelAndView("detalhesEvento");
		mv.addObject("evento", evento);
		return mv;
	}

	@RequestMapping(value = "/cadastrarEvento", method = RequestMethod.GET)
	public ModelAndView cadastrarEvento() {
		ModelAndView mv = new ModelAndView("cadastrarEvento");
		Iterable<Categoria> categorias = cr.findAll();
		mv.addObject(categorias);
		return mv;
	}

	@RequestMapping(value = "/cadastrarEvento", method = RequestMethod.POST)
	public String cadastrarEvento(Evento evento) {
		er.save(evento);
		return "redirect:/cadastrarEvento";
	}
}
