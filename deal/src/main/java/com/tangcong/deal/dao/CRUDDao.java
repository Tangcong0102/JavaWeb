package com.tangcong.deal.dao;

import org.apache.ibatis.annotations.Param;

public interface CRUDDao<T> {
	
	public void insert(T t)throws Exception;
	public void delete(String id)throws Exception;
	public void update(T t)throws Exception;
	public T select(@Param("column")String uniqueColumn ,@Param("value")Object value)throws Exception;
	
	public T selectById(String id)throws Exception;
	public boolean exist(@Param("column")String uniqueColumn ,@Param("value")Object value)throws Exception;
	
}
