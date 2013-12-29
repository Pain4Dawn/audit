package com.zunze.audit.domain.authority;

import java.util.HashSet;
import java.util.Set;

public class Menu {
	private long id;
	private String menuCode;
	private String menuName;
	private Set<User> userSet = new HashSet<User>();
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getMenuCode() {
		return menuCode;
	}
	public void setMenuCode(String menuCode) {
		this.menuCode = menuCode;
	}
	public String getMenuName() {
		return menuName;
	}
	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}
}
