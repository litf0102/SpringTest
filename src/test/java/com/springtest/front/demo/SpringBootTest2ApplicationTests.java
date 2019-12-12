package com.springtest.front.demo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringRunner.class)
@SpringBootTest
@WebAppConfiguration
public class SpringBootTest2ApplicationTests {
	
	@Test
	public void contextLoads() {
	}
	
	@Before
	public void init() {
		System.out.println("-------------Test Starting-----------------");
	}

	@After
	public void after() {
		System.out.println("-------------Test End-----------------");
	}
}
