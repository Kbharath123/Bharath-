package com.java.Employee;



public class Department {
	
	
	private int deptId;
	private String deptName;
	private String deptLoc;
	Employee [] employees;
	
	
	
	
	
	public Department(int deptId, String deptName, String deptLoc, Employee[] employees) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
		this.deptLoc = deptLoc;
		this.employees = employees;
	}

	public void disp()
	{
		System.out.println("department detailes:");
		System.out.println(deptId);
		System.out.println(deptName);
		System.out.println(deptLoc);
        System.out.println("employee details:");
        for(Employee emp : employees)
        {
        System.out.println(emp.getEmpId());
		System.out.println(emp.getEmpName());
        }
	}

	
	}

