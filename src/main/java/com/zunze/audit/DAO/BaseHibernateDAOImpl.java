package com.zunze.audit.DAO;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.LockMode;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.DetachedCriteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class BaseHibernateDAOImpl<T extends Serializable,PK extends Serializable> extends HibernateDaoSupport implements BaseDAO<T ,PK>{

	private Class<T> entityClass = null;
	
	@SuppressWarnings("unchecked")
	public BaseHibernateDAOImpl(){
		this.entityClass = null;
		Class c = getClass();
		Type t = c.getGenericSuperclass();
		if(t instanceof ParameterizedType){
			Type[] p = ((ParameterizedType) t).getActualTypeArguments();
			this.entityClass = (Class<T>)p[0];
		}
	}

	@Override
	public T get(PK id) {
		// TODO Auto-generated method stub
		return (T)getHibernateTemplate().get(entityClass, id);
	}

	@Override
	public T getWithLock(PK id, LockMode lock) {
		// TODO Auto-generated method stub
		T t = (T)getHibernateTemplate().get(entityClass,id,lock);
		if( t != null){
			this.flush();
		}
		return t;
	}

	@Override
	public T load(PK id) {
		// TODO Auto-generated method stub
		return (T)getHibernateTemplate().load(entityClass, id);
	}

	@Override
	public T loadWithLock(PK id, LockMode lock) {
		// TODO Auto-generated method stub
		T t = (T)getHibernateTemplate().load(entityClass, id);
		if(t != null){
			this.flush();
		}
		return t;
	}

	@Override
	public List<T> loadAll() {
		// TODO Auto-generated method stub
		return (List<T>)getHibernateTemplate().loadAll(entityClass);
	}

	@Override
	public boolean update(T entity) {
		// TODO Auto-generated method stub
		getHibernateTemplate().update(entity);
		return true;
	}

	@Override
	public boolean updateWithLock(T entity, LockMode lock) {
		// TODO Auto-generated method stub
		getHibernateTemplate().update(entity,lock);
		return true;
	}

	@Override
	public boolean save(T entity) {
		// TODO Auto-generated method stub
		getHibernateTemplate().save(entity);
		return true;
	}

	@Override
	public boolean saveOrUpdate(T entity) {
		// TODO Auto-generated method stub
		getHibernateTemplate().saveOrUpdate(entity);
		return true;
	}

	@Override
	public boolean saveOrUpdateAll(Collection<T> entities) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(T entity) {
		// TODO Auto-generated method stub
		getHibernateTemplate().delete(entity);
		return true;
	}

	@Override
	public boolean deleteByKey(PK id) {
		// TODO Auto-generated method stub
		this.delete(this.load(id));
		return false;
	}

	@Override
	public boolean deleteByKeyWithLock(PK id, LockMode lock) {
		// TODO Auto-generated method stub
		this.delete(this.load(id), lock);
		return false;
	}

	@Override
	public int bulkUpdate(String queryString) {
		// TODO Auto-generated method stub
		return getHibernateTemplate().bulkUpdate(queryString);
	}

	@Override
	public int bulkUpdate(String queryString, Object[] values) {
		// TODO Auto-generated method stub
		return getHibernateTemplate().bulkUpdate(queryString, values);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<T> find(String queryString) {
		// TODO Auto-generated method stub
		return ((List<T>)getHibernateTemplate().find(queryString));
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<T> findByNamedParam(String queryString, String[] paramNames,
			Object[] values) {
		// TODO Auto-generated method stub
		return (List<T>)getHibernateTemplate().findByNamedParam(queryString, paramNames, values);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<T> findByNamedQuery(String queryName) {
		// TODO Auto-generated method stub
		return (List<T>)getHibernateTemplate().findByNamedQuery(queryName);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<T> findByNamedQueryAndNamedParam(String queryName,
			String[] paramNames, Object[] values) {
		// TODO Auto-generated method stub
		return (List<T>)getHibernateTemplate().findByNamedQueryAndNamedParam(queryName, paramNames, values);
	}

	@SuppressWarnings("unchecked")
	@Override
	public Iterator<T> iterate(String queryString) {
		// TODO Auto-generated method stub
		return (Iterator<T>)getHibernateTemplate().iterate(queryString);
	}

	@SuppressWarnings("unchecked")
	@Override
	public Iterator<T> iterate(String queryString, Object[] values) {
		// TODO Auto-generated method stub
		return (Iterator<T>)getHibernateTemplate().iterate(queryString, values);
	}

	@Override
	public boolean closeIterator(Iterator<T> it) {
		// TODO Auto-generated method stub
		getHibernateTemplate().closeIterator(it);
		return true;
	}

	@Override
	public DetachedCriteria createDetachedCriteria() {
		// TODO Auto-generated method stub
	
		return 	DetachedCriteria.forClass(entityClass);
	}

	@Override
	public Criteria createCriteria() {
		// TODO Auto-generated method stub
		return this.createDetachedCriteria().getExecutableCriteria(this.getSession());
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<T> findByCriteria(DetachedCriteria criteria) {
		// TODO Auto-generated method stub
		return 	(List<T>)getHibernateTemplate().findByCriteria(criteria);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<T> findByCriteria(DetachedCriteria criteria, int firstResult,
			int maxResult) {
		// TODO Auto-generated method stub
		return (List<T>)getHibernateTemplate().findByCriteria(criteria, firstResult, maxResult);
	}

	@Override
	public List<T> findEqualByEntity(T entity, String[] propertyNames) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<T> findLikeByEntity(T entity, String[] propertyNames) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getRowCount(DetachedCriteria criteria) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Object getStatValue(DetachedCriteria criteria, String propertyName,
			String SatName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean lock(T entity, LockMode lockMode) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void initialize(Object proxy) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public T merge(T entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean evict(T entity) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(T entity, LockMode lock) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteAll(Collection<T> entities) {
		// TODO Auto-generated method stub
		return false;
	}
	

}
