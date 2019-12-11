package com.springtest.front.demo;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

public class MainControllerTest extends SpringBootTest2ApplicationTests {

	private MockMvc mvc;
	
	@Autowired
	private WebApplicationContext wc;
	
	//@Autowired
	//private EmpService empService;
	
	@Before
	public void setUp() throws Exception  {
		mvc = MockMvcBuilders.webAppContextSetup(wc).build();
	}
	
	@Test
	public void testListUser_Case1() throws Exception  {
		mvc.perform(get("/list"))
		.andExpect(status().isOk())
		.andDo(print());
	}

	@Test
	public void testListUser_Case2() throws Exception  {
		//when(empService.getEmp("aaaaaa")).thenReturn(null);
		mvc.perform(get("/list_dmy"))
		.andExpect(status().isNotFound())
		.andDo(print());
	}
}
