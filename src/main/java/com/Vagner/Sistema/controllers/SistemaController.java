package com.Vagner.Sistema.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class SistemaController {

	@GetMapping("/administrativo")
	public String acessarPrincipal() {
		return "administrativo/index";
	}
	
	
}
