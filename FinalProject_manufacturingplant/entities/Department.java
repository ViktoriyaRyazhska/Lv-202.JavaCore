package com.manufacturingplant.entities;

import java.util.ArrayList;

public class Department {

	private int departmentId;

	private String departmentName;

	private String chairman;

	private ArrayList<DepartamentEmployee> departmentEmployeeList;

	public Department() {
	}

	public Department(int departmentId, String departmentName, String chairman) {
		super();
		this.departmentId = departmentId;
		this.departmentName = departmentName;
		this.chairman = chairman;
	}

	public Department(int departmentId, String departmentName, String chairman,
			ArrayList<DepartamentEmployee> departmentEmployeeList) {
		super();
		this.departmentId = departmentId;
		this.departmentName = departmentName;
		this.chairman = chairman;
		this.departmentEmployeeList = departmentEmployeeList;
	}

	public int getDepartmentId() {
		return departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public String getChairman() {
		return chairman;
	}

	public ArrayList<DepartamentEmployee> getDepartmentEmployeeList() {
		return departmentEmployeeList;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public void setChairman(String chairman) {
		this.chairman = chairman;
	}

	public void setDepartmentEmployeeList(ArrayList<DepartamentEmployee> departmentEmployeeList) {
		this.departmentEmployeeList = departmentEmployeeList;
	}

	@Override
	public String toString() {
		return "ВідділІД " + departmentId + "; " + departmentName + "; начальник відділу -> " + chairman;
	}

}
