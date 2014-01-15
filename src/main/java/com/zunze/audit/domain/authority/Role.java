package com.zunze.audit.domain.authority;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Role {
	private long id;
	private String roleName;
	private String roleType;
	private String province;
	private Date startDate;
	private Date endDate;
	private Set<Role> childRoles = new HashSet<Role>();
	private Set<User> userSet = new HashSet<User>();
	
	public Set<User> getUserSet() {
		return userSet;
	}
	public void setUserSet(Set<User> userSet) {
		this.userSet = userSet;
	}
	public Set<Role> getChildRoles() {
		return childRoles;
	}
	public void setChildRoles(Set<Role> childRoles) {
		this.childRoles = childRoles;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public String getRoleType() {
		return roleType;
	}
	public void setRoleType(String roleType) {
		this.roleType = roleType;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	/**
	 * role为单向联结
	 * @param role
	 * @return
	 */
	public boolean addChildRole(Role role){
		if(role == null){
			//TODO 异常
			return false;
		}
		this.getChildRoles().add(role);
		return true;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((endDate == null) ? 0 : endDate.hashCode());
		result = prime * result
				+ ((province == null) ? 0 : province.hashCode());
		result = prime * result
				+ ((roleName == null) ? 0 : roleName.hashCode());
		result = prime * result
				+ ((startDate == null) ? 0 : startDate.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Role other = (Role) obj;
		if (endDate == null) {
			if (other.endDate != null)
				return false;
		} else if (!endDate.equals(other.endDate))
			return false;
		if (province == null) {
			if (other.province != null)
				return false;
		} else if (!province.equals(other.province))
			return false;
		if (roleName == null) {
			if (other.roleName != null)
				return false;
		} else if (!roleName.equals(other.roleName))
			return false;
		if (startDate == null) {
			if (other.startDate != null)
				return false;
		} else if (!startDate.equals(other.startDate))
			return false;
		return true;
	}
	
}
