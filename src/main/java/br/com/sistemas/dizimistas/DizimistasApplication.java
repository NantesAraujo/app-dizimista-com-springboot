package br.com.sistemas.dizimistas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller
public class DizimistasApplication {

	public static void main(String[] args) {
		SpringApplication.run(DizimistasApplication.class, args);
	}

	@GetMapping("/")
	@ResponseBody
	public String home(){
		return "Seja bem vindo ao Sitema de Dizimistas!!!";
	}
}
