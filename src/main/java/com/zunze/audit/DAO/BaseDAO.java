package com.zunze.audit.DAO;

public interface BaseDAO<T> {
	
	public boolean save(T entity);
	public boolean saveOrUpdate(T entity);
	public boolean update(T entity);
	public T merge(T entity);
	public boolean delete(T entity);
	public boolean evict(T entity);
}
