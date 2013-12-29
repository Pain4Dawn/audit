package com.zunze.audit.domain.authority;

public class ProvinceInfo {
	private long id;
	private String provinceName;
	private String provinceDataSource;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getProvinceName() {
		return provinceName;
	}
	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}
	public String getProvinceDataSource() {
		return provinceDataSource;
	}
	public void setProvinceDataSource(String provinceDataSource) {
		this.provinceDataSource = provinceDataSource;
	}
}
