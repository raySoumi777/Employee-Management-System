package Emp;

import java.util.HashMap;

public class leader extends Employee {
	public leader(String name,String dept,String desg,int id,int salary) {
		super.name=name;
		super.dept=dept;
		super.designation=desg;
		super.id=id;
		super.salary=salary;
	}
	
	HashMap<Integer,Employee> emplist ;
	static HashMap <String ,HashMap> company= new HashMap();;
	
	public void addEmployee(Employee e) {
		System.out.println(e.name+" "+e.dept+" "+e.designation+" "+e.salary);
		if(company.get(e.dept)==null) {
			emplist = new HashMap();
			emplist.put(e.id, e);
			company.put(e.dept,emplist);
			System.out.println("Added successfully");
		}
		else {
			company.get(e.dept).put(e.id, e);
			System.out.println("Added successfully again");
		}
		
	}
	public void removeEmployee(int id,String dept) {
		company.get(dept).remove(id);
		System.out.println("removed successfully");
	}
	@Override
	public int getSalary() {
		return super.salary;
	}
	
	@Override
	public Employee showDetails(String dept,String Name) {
		// TODO Auto-generated method stub
		HashMap emp= company.get(dept);
		
		Employee e=null;
		for(int i=1;i<=emp.size();i++) {
			e= (Employee) emp.get(i);
			
			if(e.name.equalsIgnoreCase(Name)) {
				
				break;
			}
		}
		
		return e;
		
	}
	@Override
	public int getTotalSalary(String deptn) {
		// TODO Auto-generated method stub
		int Salary=0;
		Employee e;
		HashMap emp= company.get(deptn);
		for(int i=1;i<=emp.size();i++) {
			e= (Employee) emp.get(i);
			Salary=Salary+e.getSalary();
		}
		return Salary;

	}
	@Override
	public HashMap deptDetails(String dept2) {
		// TODO Auto-generated method stub
		return company.get(dept2);
	}

}
