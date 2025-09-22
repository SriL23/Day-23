package com.codegnan.oopExample;

public class Employee2 {
        int emId;
		String name;
		double salary;
		Employee2(int emId,String name,double salary){
			this.emId=emId;
			this.name=name;
			this.salary=salary;
			
		}
		public void setEmID(int emId) {
			this.emId=emId;
		}
		public int getEmID() {
			return emId;
		}
		public void setName(String name) {
			this.name=name;
		}
		public String getName() {
			return name;
			
		}
		public void setSalary(double salary) {
			if(salary>0) {
			this.salary=salary;
                 }
			else
			System.out.println("Salary must be pasitive");

		}
		public double getSalary() {
			return salary;
		}
		
		public void displayEmployeeInfo() {
			System.out.println("Employee Details");
			System.out.println("Employee Id : "+emId);
			System.out.println("Employee Name : "+name);
			System.out.println("Employee Salary : "+salary);
			
		}
		public static void main(String[] args) {
			

	}

}
