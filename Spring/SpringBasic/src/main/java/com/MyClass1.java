package com;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyClass1 {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Bean2.xml");
		Student student = context.getBean(Student.class);
		System.out.println(student.id);
		System.out.println(student.name);
		System.out.println(student.arr.dNo);
		System.out.println(student.arr.city);
//		context.close();
	}

}
