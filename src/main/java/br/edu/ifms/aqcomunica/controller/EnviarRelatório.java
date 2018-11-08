package br.edu.ifms.aqcomunica.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.edu.ifms.aqcomunica.model.Evento;
import br.edu.ifms.aqcomunica.repository.EventoRepository;

@Controller
public class EnviarRelatório {
	
	@Autowired
	private EventoRepository ev;
	private Evento dataLimiteEvento;
	private Date dataAtual;
}
