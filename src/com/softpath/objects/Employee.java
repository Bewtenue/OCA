package com.softpath.objects;

public class Employee {
	
	int age;
	double salary;
	
	public Employee()
	{
		
	}
	
	public Employee(int ageValue, double salaryValue)
	{
		age=ageValue;
		salary= salaryValue;
	}
	/*Employee()
	{
		
	}
	
	Employee(int age, double salary)
	{
		
	}*/
	
	double getSalary(double salaryE)
	{
		//return this.salary;
		return salaryE;
	}
	
	int ageMethod()
	{
		return this.age;
	}
	
	void getName()
	{
		
	}
	
	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.age = 24;
		employee.salary = 100;
		
		Employee employee2 = null;
		employee2 = employee;
		
		System.out.println(employee2.salary);
	}
}
