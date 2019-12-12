package com.springtest.front.demo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.springtest.front.demo.dao.EmpDao;
import com.springtest.front.demo.model.EMP;

public class DaoTest extends SpringBootTest2ApplicationTests {

	@Autowired
	private EmpDao empDao;

	@Test
	public void testFindEmpById_Case1() throws Exception {
		List<EMP> listEmp = empDao.findEmpById("com.springtest.front.demo.dao.mapper.EmpMapper.getEmp", "1ssss");
		Assert.assertNotNull(listEmp);
		Assert.assertEquals(listEmp.size(),0);
	}
	
	@Test
	public void testFindEmpById_Case2() throws Exception {
		Assert.assertEquals(empDao.findEmpById("com.springtest.front.demo.dao.mapper.EmpMapper.getEmp", "0001").size(),1);
	}
	
	@Test
	@Transactional
	public void testSave_Case1() throws Exception {
		Map<String,Object> parameter = new HashMap<>();
		parameter.put("id","a001");
		parameter.put("name","a001_name");
		parameter.put("sex","1");
		long count = empDao.save("com.springtest.front.demo.dao.mapper.EmpMapper.addEmp",parameter);
		Assert.assertEquals(1, count);
	}
	
	@Test
	@Transactional
	public void testSave_Case2() throws Exception {
		Map<String,Object> parameter = new HashMap<>();
		parameter.put("id","a001aaaaAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
		parameter.put("name","a001AAAA_name");
		parameter.put("sex","A111");
		long count = empDao.save("com.springtest.front.demo.dao.mapper.EmpMapper.addEmp",parameter);
		Assert.assertEquals(1, count);
	}
}
