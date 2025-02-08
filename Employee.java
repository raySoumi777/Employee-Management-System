package Emp;

import java.util.HashMap;

public abstract class Employee {
	String name,dept,designation;
	int id,salary;
	public abstract int getSalary();
	public abstract void addEmployee(Employee e);
	public abstract Employee showDetails(String Dept,String Name);
	public abstract int getTotalSalary(String dept);
	public abstract HashMap deptDetails(String dept2);
}
