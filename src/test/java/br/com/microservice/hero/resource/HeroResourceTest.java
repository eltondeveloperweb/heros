package br.com.microservice.hero.resource;

import org.junit.Assert;
import org.junit.Test;

public class HeroResourceTest {
		
	private HeroResource heroResource;
	
	public HeroResourceTest(HeroResource heroResource) {
		this.heroResource = new HeroResource();
	}
	
	@Test
	public void deveRetornarUmaString() {
		
		String text = "opa";
		Assert.assertEquals(heroResource.hello(text), "opa");
	}

}
