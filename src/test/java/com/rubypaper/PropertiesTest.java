package com.rubypaper;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
//import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.test.context.junit4.SpringRunner;

import com.rubypaper.controller.BoardController;

@RunWith(SpringRunner.class)
@SpringBootTest(properties = { "your.name=kkkkk", "your.age=11" })
class PropertiesTest {

	@Autowired
	Environment environment;

	@Test
	public void testMethod() {
		System.out.println("name : " + environment.getProperty("your.name"));
		System.out.println("age : " + environment.getProperty("your.age"));
	}
}
