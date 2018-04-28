package com.lanqiao.CRM.dao;

import java.util.List;

import com.lanqiao.CRM.entity.Log;

public interface LogDao {
	
	public void insert(Log log);
	
	public List<Log> findAll(String s);
	public int getTotal(String s);

}
