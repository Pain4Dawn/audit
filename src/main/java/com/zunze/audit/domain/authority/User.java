package com.zunze.audit.domain.authority;

import java.util.HashSet;
import java.util.Set;


public class User {
	private long id;
	private String userName;
	private ProvinceInfo provinceInfo;
	private Set<Role> roleSet = new HashSet<Role>();
	private Set<Menu> menuSet = new HashSet<Menu>();
	
	public Set<Menu> getMenuSet() {
		return menuSet;
	}
	public void setMenuSet(Set<Menu> menuSet) {
		this.menuSet = menuSet;
	}
	public Set<Role> getRoleSet() {
		return roleSet;
	}
	public void setRoleSet(Set<Role> roleSet) {
		this.roleSet = roleSet;
	}
	public ProvinceInfo getProvinceInfo() {
		return provinceInfo;
	}
	public void setProvinceInfo(ProvinceInfo provinceInfo) {
		this.provinceInfo = provinceInfo;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/**
	 * 用户添加角色，如果角色为空，抛出异常 role必须是已经持久化了
	 * @param role
	 * @return
	 */
	public boolean addRole(Role role){
		if(role == null){
			//TODO 异常
			return false;
		}
		this.getRoleSet().add(role);
		role.getUserSet().add(this);
		return true;
	}
}
