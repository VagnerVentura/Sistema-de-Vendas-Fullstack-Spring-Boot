package com.Vagner.Sistema.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.Vagner.Sistema.model.Estado;
import com.Vagner.Sistema.repositories.EstadoRepository;



@Controller

public class EstadoController {

	@Autowired
	EstadoRepository estadoRepository;
	
	@GetMapping("/cadastroEstado")
	public ModelAndView cadastrar (Estado estado) {
		ModelAndView mv = new ModelAndView("adm/estado/cadastro");
		mv.addObject("estado", estado);
		return mv;
	}
	
	
}
