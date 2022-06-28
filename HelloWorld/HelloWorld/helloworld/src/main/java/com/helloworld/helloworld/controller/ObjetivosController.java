package com.helloworld.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//para executar ir na classe principal src/main/java e run as java application

@RestController //define que a classe é do tipo controladora rest,que receberá requisições
@RequestMapping("/objetivos") //é usada para mapear solicitações para os métodos da classe controladora HelloWorldController
public class ObjetivosController {

	@GetMapping //mapeia solicitações HTTP GET para métodos de tratamento específicos
	
	//metodo para imprimir a string
	String objetivos() {
		return " Objetivos da Semana:\r\n"
				+ " 1 - Continuar projeto integrador\r\n"
				+ " 2 - Práticar mais exercicíos de java\r\n"
				+ " 3 - Fazer o blog pessoal\r\n"
				+ " 4 - Estudar sobre API's\r\n";
	}
}
