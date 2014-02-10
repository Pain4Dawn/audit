package com.zunze.audit.DAO;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.LockMode;
import org.hibernate.criterion.DetachedCriteria;

public interface BaseDAO<T extends Serializable, PK extends Serializable> {
	//基本检索增删改查操作
	public T get(PK id);
	//根据主键获取实体并枷锁。如果没有相应的实体，返回null
	public T getWithLock(PK id,LockMode lock);
	public T load(PK id);
	public T loadWithLock(PK id,LockMode lock);
	public List<T> loadAll();
	public boolean update(T entity);
	public boolean updateWithLock(T entity,LockMode lock);
	public boolean save(T entity);
	public boolean saveOrUpdate(T entity);
	public boolean saveOrUpdateAll(Collection<T> entities);
	public boolean delete(T entity);
	public boolean delete(T entity,LockMode lock);
	public boolean deleteByKey(PK id);
	//根据主键枷锁并删除指定实体
	public boolean deleteByKeyWithLock(PK id,LockMode lock);
	public boolean deleteAll(Collection<T> entities);
	/************************************************HQL********************************************************/
	public int bulkUpdate(String queryString);
	public int bulkUpdate(String queryString,Object[] values);
	//使用带参数的HSQL语句检索数据
	public List<T> find(String queryString);
	//使用带命名的参数的HSQL语句检索数据
	public List<T> findByNamedParam(String queryString,String[] paramNames,Object[] values);
	//使用带参数的命名HSQL语句检索数据
	public List<T> findByNamedQuery(String queryName);
	public List<T> findByNamedQueryAndNamedParam(String queryName,String[] paramNames,Object[] values);
	public Iterator<T> iterate(String queryString);
	public Iterator<T> iterate(String queryString,Object[] values);
	public boolean closeIterator(Iterator<T> it);
	/************************************************Criteria*************************************************************/
	public DetachedCriteria createDetachedCriteria();
	public Criteria createCriteria();
	public List<T> findByCriteria(DetachedCriteria criteria);
	public List<T> findByCriteria(DetachedCriteria criteria, int firstResult,int maxResult);
	//使用指定的实体及属性检索（满足除主键外属性=实体值）数据
	public List<T> findEqualByEntity(T entity,String[] propertyNames);
	//满足like
	public List<T> findLikeByEntity(T entity,String[] propertyNames);
	public int getRowCount(DetachedCriteria criteria);
	public Object getStatValue(DetachedCriteria criteria,String propertyName,String SatName);
	/*************************************************Others*****************************************************************/
	public boolean lock(T entity,LockMode lockMode);
	public void initialize(Object proxy);
	public void flush();
	public T merge(T entity);
	public boolean evict(T entity);
}
