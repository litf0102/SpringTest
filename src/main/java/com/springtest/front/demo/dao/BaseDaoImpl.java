package com.springtest.front.demo.dao;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public abstract class BaseDaoImpl<T> implements BaseDao<T> {
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;

	@Override
	public int save(String mapper, Map<String, Object> parameter) throws Exception {
		// TODO Auto-generated method stub
		return sqlSessionTemplate.insert(mapper,parameter);
	}

	@Override
	public int update(String mapper, Map<String, Object> parameter) throws Exception {
		// TODO Auto-generated method stub
		return sqlSessionTemplate.update(mapper,parameter);
	}

	@Override
	public int delete(String mapper, Map<String, Object> parameter) throws Exception {
		// TODO Auto-generated method stub
		return sqlSessionTemplate.delete(mapper,parameter);
	}

	@Override
	public T find(String mapper, Map<String, Object> parameter) throws Exception {
		// TODO Auto-generated method stub
		return sqlSessionTemplate.selectOne(mapper,parameter);
	}

	@Override
	public List<T> findList(String mapper, Map<String, Object> parameter) throws Exception {
		// TODO Auto-generated method stub
		return sqlSessionTemplate.selectList(mapper,parameter);
	}

}
