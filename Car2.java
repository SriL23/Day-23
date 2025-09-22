package com.codegnan.oopExample;
import java.util.Scanner;
public class Car2 {
	String name;
	int year;
   public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}


   public static void main(String[] args) {
	   Scanner ob1=new Scanner(System.in);
	   Car2 ob=new Car2();
	    System.out.println("Enter Car Model : ");
	    String name=ob1.next();
		ob.setName(name);
		System.out.println("Enter Car Year : ");
		int year=ob1.nextInt();
		ob.setYear(year);
		System.out.println("Model of Car : "+ob.getName()+", Year : "+ob.getYear());
		 ob1.close();

	}
  

}
