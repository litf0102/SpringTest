package com.springtest.front.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.springtest.front.demo.model.EMP;
import com.springtest.front.demo.service.EmpService;

import org.junit.Assert;
import org.junit.Test;

public class ServiceTest extends SpringBootTest2ApplicationTests {
	@Autowired
	private EmpService empService;

	@Test
	@Transactional
	public void testAddEmp_Case1() throws Exception{
		EMP emp = new EMP("a3131","TEST","1",null,null);
		Assert.assertEquals(1, empService.addEmp(emp));
	}

	@Test
	@Transactional
	//@Ignore("not ready yet")
	public void testAddEmp_Case2() throws Exception{
		EMP emp = new EMP("a2AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA221111111111111AAAAAAAAAAAAAAAAAAAAAAADDDDDDDDDDDDDDDDDDDDDDDDD","TEST","1",null,null);
		Assert.assertEquals(1,empService.addEmp(emp));
	}

}
