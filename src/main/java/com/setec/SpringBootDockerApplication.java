package com.setec;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class SpringBootDockerApplication {
	@GetMapping("/message")
	public String index() {
		return "index";
	}
	@GetMapping("/save")
	public String save() {
		return "save";
	}
	@GetMapping("/save")
	public String update() {
		return "update";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDockerApplication.class, args);
	}

}
