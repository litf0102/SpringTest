package com.springtest.front.demo.dao;

import java.util.List;

import com.springtest.front.demo.model.EMP;

public interface EmpDao extends BaseDao<EMP> {
	public List<EMP> findEmpById(String mapper ,String id) throws Exception;
	public List<EMP> findEmpByNameAndSex(String mapper, EMP emp) throws Exception;
}
