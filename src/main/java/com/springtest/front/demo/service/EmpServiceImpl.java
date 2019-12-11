package com.springtest.front.demo.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springtest.front.demo.dao.EmpDao;
import com.springtest.front.demo.model.EMP;

@Service
public class EmpServiceImpl implements EmpService {
	@Autowired
	private EmpDao empDao;
	
	@Override
	public List<EMP> getEmp(String id) throws Exception {
		// TODO Auto-generated method stub
		Map<String,Object> parameter = new HashMap<>();
		parameter.put("id", id);
		
		return empDao.findEmpById("com.springtest.front.demo.dao.mapper.EmpMapper.getEmp", id);
	}

	@Transactional(rollbackFor = Exception.class)
	@Override
	public int deleteEmp(String id) throws Exception {
		Map<String,Object> parameter = new HashMap<>();
		parameter.put("id", id);
		
		return empDao.delete("com.springtest.front.demo.dao.mapper.EmpMapper.deleteEmp", parameter);
	}
	
	@Transactional(rollbackFor = Exception.class)
	@Override
	public int addEmp(EMP emp) throws Exception {
		Map<String,Object> parameter = new HashMap<>();
		parameter.put("id", emp.getId());
		parameter.put("name", emp.getName());
		parameter.put("sex", emp.getSex());
		
		return empDao.save("com.springtest.front.demo.dao.mapper.EmpMapper.addEmp", parameter);
	}
	
	@Override
	public List<EMP> findEmpByNameAndSex(EMP emp) throws Exception {
		return empDao.findEmpByNameAndSex("com.springtest.front.demo.dao.mapper.EmpMapper.findEmpByNameAndSex", emp);
	}
	
	@Override
	public List<EMP> getEmpDetail(String id) throws Exception {
		// TODO Auto-generated method stub
		Map<String,Object> parameter = new HashMap<>();
		parameter.put("id", id);
		
		return empDao.findEmpById("com.springtest.front.demo.dao.mapper.EmpMapper.getEmpDetail", id);
	}
}
