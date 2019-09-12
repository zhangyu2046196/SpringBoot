package com.youyuan.springboot.entities;

import java.io.Serializable;

/**
 * 部门bean
 */
public class Department implements Serializable {

	private static final long serialVersionUID = -6911957081688572192L;
	private Integer id;
	private String departmentName;

	public Department() {
	}
	
	public Department(int i, String string) {
		this.id = i;
		this.departmentName = string;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	@Override
	public String toString() {
		return "Department [id=" + id + ", departmentName=" + departmentName + "]";
	}
	
}
