package com.java.test;

import com.java.Employee.Department;
import com.java.Employee.Employee;

public class Launch {

	public static void main(String[] args) {
		
		Employee emp1 =new Employee(18, "sachin");
		Employee emp2 =new Employee(24, "virat");
		Employee emp3 =new Employee(42, "zabi");
		
		Employee[] e=new Employee[3];
		e[0] = emp1;
		e[1] = emp2;
		e[2] = emp3;
		
       Department dept = new Department(123,"bcci","dubai",e);
       dept.disp();
		
		
		

	}

}
