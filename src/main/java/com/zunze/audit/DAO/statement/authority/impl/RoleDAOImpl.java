package com.zunze.audit.DAO.statement.authority.impl;


import org.springframework.stereotype.Repository;

import com.zunze.audit.DAO.BaseHibernateDAOImpl;
import com.zunze.audit.DAO.statement.authority.RoleDAO;
@Repository("roleDAO")
public class RoleDAOImpl<T> extends BaseHibernateDAOImpl<T> implements RoleDAO<T>{

}
