package com.helloworld.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//para executar ir na classe principal src/main/java e run as java application

@RestController //define que a classe é do tipo controladora rest,que receberá requisições

@RequestMapping("/hello-world")//é usada para mapear solicitações para os métodos da classe controladora HelloWorldController
public class HelloWorldController {

	
	@GetMapping //mapeia solicitações HTTP GET para métodos de tratamento específicos
	
	//metodo para imprimir a string
	String hello() {
	return "Hello World";
	}
	
}
