package com.java.interview.exam.math;

/**
 * @Title: aaa.java
 * @Package six
 * @Description: 定义一个普通的三角形类
 * @author Rocky
 * @date 2016年7月3日
 * @version V1.0
 */
abstract class Shape {
	{
		System.out.println("执行Shape的初始化块。。。");
	}
	private String color;

	// 定义了一个计算周长的抽象方法
	public abstract double calPerimeter();

	// 定义了一个返回形式的抽象方法
	public abstract String getType();

	// 定义Shape的构造器，该构造器并不是用于创建Shape对象
	// 而是用于被子类调用
	public Shape() {
	}

	public Shape(String color) {
		System.out.println("执行Shape构造器。。。");
		this.color = color;
	}

	// 省略color的setter和getter方法
	public void setColor(String color) {
		this.color = color;
	}

	public String getColor() {
		return this.color;
	}
}

public class Demo04 extends Shape {
	// 定义三角形的三边
	private double a;
	private double b;
	private double c;

	// 继承Shape类，继承color实例变量
	public Demo04(String color, double a, double b, double c) {
		super(color);
		this.setSides(a, b, c);
	}

	public void setSides(double a, double b, double c) {
		if (a >= b + c || b >= a + c || c >= a + b) {
			System.out.println("三角形两边之和大于第三边");
			return;
		}
		this.a = a;
		this.b = b;
		this.c = c;
	}

	// 重写Shape类的计算周长的抽象方法
	public double CalPerimeter() {
		return a + b + c;
	}

	// 重写Shape类的返回形状的抽象方法
	public String getType() {
		return "三角形";
	}

	@Override
	public double calPerimeter() {
		// TODO Auto-generated method stub
		return 0;
	}
}