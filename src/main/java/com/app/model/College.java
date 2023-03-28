package com.app.model;



public class College {
	
	private int id;
	private String collegeName;
	private String collegeAddress;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public String getCollegeAddress() {
		return collegeAddress;
	}
	public void setCollegeAddress(String collegeAddress) {
		this.collegeAddress = collegeAddress;
	}
	@Override
	public String toString() {
		return "College [id=" + id + ", collegeName=" + collegeName + ", collegeAddress=" + collegeAddress + "]";
	}

	
}
