package com.springtest.front.demo.service;

import java.util.List;

import com.springtest.front.demo.model.EMP;

public interface EmpService {
	List<EMP> getEmp(String id) throws Exception;
	int deleteEmp(String id) throws Exception;
	List<EMP> getEmpDetail(String id) throws Exception;
	public int addEmp(EMP emp) throws Exception;
	public List<EMP> findEmpByNameAndSex(EMP emp) throws Exception;
}
