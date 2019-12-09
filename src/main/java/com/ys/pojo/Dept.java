package com.ys.pojo;

public class Dept {

	private Integer deptId;
	private String deptdesc;
	
	public Integer getDeptId() {
		return deptId;
	}
	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}
	public String getDeptdesc() {
		return deptdesc;
	}
	public void setDeptdesc(String deptdesc) {
		this.deptdesc = deptdesc;
	}
	
	@Override
	public String toString() {
		return "Dept [deptId=" + deptId + ", deptdesc=" + deptdesc + "]";
	}
}
