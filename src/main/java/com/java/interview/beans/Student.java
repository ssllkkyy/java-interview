package com.java.interview.beans;

public class Student extends Person {
	public Student() {
	}

	public Student(String name, int age) {
		super(name, age);
	}

	@Override
	// 重写equal方法
	public boolean equals(Object obj)// s1.equals(s2);
	{
		// 1. this相当于s1,obj相当于s2
		// 2. (Object obj)相当于多态，提升了，向上转型 ：父类引用指向子类对象
		// 3. 多态弊端，不能访问 子类特有属性和和行为
		// 4. 需要向下转型

		Student s = (Student) obj;
		return this.getName().equals(s.getName()) && this.getAge() == s.getAge();
	}

	// 重写toString方法
	public String toString() {

		return "姓名是：" + getName() + ", 年龄是：" + getAge();
	}
}
