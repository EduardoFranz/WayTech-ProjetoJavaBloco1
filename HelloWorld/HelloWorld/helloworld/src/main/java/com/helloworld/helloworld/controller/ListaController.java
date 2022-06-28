package com.helloworld.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//para executar ir na classe principal src/main/java e run as java application

@RestController //define que a classe é do tipo controladora rest,que receberá requisições
@RequestMapping("/lista-bsm") //é usada para mapear solicitações para os métodos da classe controladora HelloWorldController
public class ListaController {

	@GetMapping //mapeia solicitações HTTP GET para métodos de tratamento específicos
	
	//metodo para imprimir a string
	public String lista() {
		return " PT - BSM-0  - Introdução às Habilidades Comportamentais e Mentalidades\r\n"
				+ " PT - BSM-GM - Mentalidade de Crescimento\r\n"
				+ " PT - BSM-P  - Persistência\r\n"
				+ " PT - BSM-PR - Responsabilidade Pessoal\r\n"
				+ " PT - BSM-FO - Orientação ao Futuro\r\n"
				+ " PT - BSM-C  - Comunicação\r\n"
				+ " PT - BSM-PA - Proatividade\r\n"
				+ " PT - BSM-OD - Orientação ao Detalhe\r\n"
				+ " PT - BSM-T  - Trabalho em Equipe\r\n"
				+ " PT - SSM-TM - Gestão do Tempo";
	}
}
