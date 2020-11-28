package com.rubypaper;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class PropertiesTest {
	
	@Autowired
	Environment environment;
	
	@Test
	public void testMethod() {
		System.out.println("name : "+environment.getProperty("author.name"));
		System.out.println("age : "+environment.getProperty("author.age"));
	}
}
