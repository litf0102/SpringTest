package com.springtest.front.demo.dao.mapper;

import java.sql.SQLException;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.springtest.front.demo.model.EMP;

@Repository
public interface EmpMapper {
	List<EMP> getEmp(String id) throws SQLException;
	int addEmp( EMP emp ) throws SQLException;
    int deleteEmp( String id ) throws SQLException;
    List<EMP> findEmpByNameAndSex(EMP emp) throws SQLException;
    List<EMP> getEmpDetail(String id) throws SQLException;
}
