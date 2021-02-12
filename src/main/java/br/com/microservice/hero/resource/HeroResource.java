package br.com.microservice.hero.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/heros")
public class HeroResource {
	
	@GetMapping(value = "/hello")
	public String hello() {
		return "GOOG MORNING MY GOD";
	}

}
