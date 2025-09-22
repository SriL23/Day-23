package com.codegnan.oopExample;

public class Example2 {
	public double  rectangleArea(double length,double width) {
		return length*width;
	}
	public double circleArea(double radius) {
		return 3.14*radius*radius;
	}
	public double squareArea(double side) {
		return side*side;
	}
	public static void triangleArea(double base,double height){
		System.out.println("Triangle Area : "+0.5*base*height);
	}
	public static void trapezoidArea(double base1,double base2,double height) {
		System.out.println("Trapezoid Area : "+0.5*(base1+base2)*height);
	}
	public static void parallelogramArea(double base,double height) {
		System.out.println("Parallelogram Area : "+base*height);
	}
	public static void main(String[] args) {
		Example2 ob=new Example2();
		System.out.println("Rectangle Area :"+ob.rectangleArea(3,6));
		System.out.println("Circle Area : "+ob.circleArea(7));
		System.out.println("Square Area : "+ob.squareArea(4));
		triangleArea(6,4);
		trapezoidArea(4,5,6);
		parallelogramArea(3,8);
		
		
	}
     
}
