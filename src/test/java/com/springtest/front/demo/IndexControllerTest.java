package com.springtest.front.demo;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

public class IndexControllerTest extends SpringBootTest2ApplicationTests {

	private MockMvc mvc;
	
	@Autowired
	public WebApplicationContext wc;
	
	@Before
	public void setUp() throws Exception  {
		mvc = MockMvcBuilders.webAppContextSetup(wc).build();
	}
	
	@Test
	public void testIndex_Case1() throws Exception  {
//		mvc.perform(get("/index"))
//		.andExpect(status().isOk())
//		.andExpect(content().string("index"))    
//		.andDo(print());
		MvcResult mvcResult= mvc.perform(MockMvcRequestBuilders.get("/index")
		        .param("name","hello")
		        .accept(MediaType.TEXT_HTML_VALUE))
		       // .andExpect(MockMvcResultMatchers.status().isOk())             //Assert.assertEquals(200,status);
		       // .andExpect(MockMvcResultMatchers.content().string("index"))    //Assert.assertEquals("hello dd",content);
		        .andDo(MockMvcResultHandlers.print())
		        .andReturn();
		int status=mvcResult.getResponse().getStatus();                 
		Assert.assertEquals(200,status);                       
	}
	
	@Test
	public void testLogin_Case1() throws Exception {
		mvc.perform(get("/login"))
		.andExpect(status().isOk())
		.andDo(print());
	}
}
