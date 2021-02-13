package br.com.microservice.hero;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.com.microservice.hero.resource.HeroResource;

@SpringBootTest
class MicroserviceHeroApplicationTests {
	
	@Autowired
	private HeroResource heroResource;

	@Test
	public String deveRetornarString() {
		return "";
	}

}
