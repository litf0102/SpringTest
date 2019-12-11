package com.springtest.front.demo.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.springtest.front.demo.model.EMP;

@Repository
public class EmpDaoImpl extends BaseDaoImpl<EMP> implements EmpDao {

	@Override
	public List<EMP> findEmpById(String mapper,  String id) throws Exception {
		// TODO Auto-generated method stub
		Map<String,Object> parameter = new HashMap<>();
		parameter.put("id",id);
		return super.findList(mapper,parameter);
	}
	
	@Override
	public List<EMP> findEmpByNameAndSex(String mapper, EMP emp) throws Exception {
		// TODO Auto-generated method stub
		Map<String,Object> parameter = new HashMap<>();
		parameter.put("name",emp.getName());
		parameter.put("sex",emp.getSex());
		return super.findList(mapper,parameter);
	}
}
