package com.zunze.audit.DAO;

import org.hibernate.HibernateException;
import org.hibernate.Session;

public class BaseHibernateDAOImpl<T>  implements BaseDAO<T>{

	public Session session = null;
	
	public boolean save(T entity) {
		if(entity == null){
			//TODO 异常
			return false;
		}
		try{
			session.save(entity);
			return true;
		}catch(HibernateException ex){
			//TODO 异常
			return false;
		}
	}

	public boolean saveOrUpdate(T entity) {
		if(entity == null){
			//TODO 异常
			return false;
		}
		try{
			session.saveOrUpdate(entity);
			return true;
		}catch(HibernateException ex){
			//TODO 异常
			return false;
		}
	}

	public boolean update(T entity) {
		if(entity == null){
			//TODO 异常
			return false;
		}
		try{
			session.update(entity);
			return true;
		}catch(HibernateException ex){
			//TODO 异常
			return false;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public T merge(T entity) {
		if(entity == null){
			//TODO 异常
			return null;
		}
		try{
			return (T)session.merge(entity);
		}catch(HibernateException ex){
			//TODO 异常
			return null;
		}
	}

	@Override
	public boolean delete(T entity) {
		if(entity == null){
			//TODO 异常
			return false;
		}
		try{
			session.delete(entity);
			return true;
		}catch(HibernateException ex){
			//TODO 异常
			return false;
		}
	}

	@Override
	public boolean evict(T entity) {
		if(entity == null){
			//TODO 异常
			return false;
		}
		try{
			session.evict(entity);
			return true;
		}catch(HibernateException ex){
			//TODO 异常
			return false;
		}
	}

}
