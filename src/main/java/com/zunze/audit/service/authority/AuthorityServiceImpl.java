package com.zunze.audit.service.authority;

import com.zunze.audit.DAO.statement.authority.RoleDAO;
import com.zunze.audit.DAO.statement.authority.UserDAO;
import com.zunze.audit.domain.authority.Role;
import com.zunze.audit.domain.authority.User;

public class AuthorityServiceImpl implements AuthorityService{
	
	private UserDAO<User> userDAO;
	private RoleDAO<Role> roleDAO;
	
	/**
	 * 保存用户信息
	 * @param user
	 * @return
	 */
	public boolean saveUser(User user){
		return userDAO.saveOrUpdate(user);
	}
	
	/**
	 * 保存角色信息
	 * @param parent
	 * @param child
	 * @return
	 */
	public boolean saveRole(Role parent,Role child){
		if(parent == null){
			return roleDAO.saveOrUpdate(child);
		}else {
			parent.addChildRole(child);
			return roleDAO.saveOrUpdate(parent);
		}
	}
	/**
	 * 用户授予角色
	 * @param user
	 * @param role
	 * @return
	 */
	public boolean Role2User(User user,Role role){
		user.addRole(role);
		return userDAO.saveOrUpdate(user);
	}
	
}
