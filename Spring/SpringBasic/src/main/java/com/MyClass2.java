package com;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyClass2 {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		Student student = context.getBean(Student.class);
		System.out.println(student.id);
		System.out.println(student.name);
		System.out.println(student.arr.dNo);
		System.out.println(student.arr.city);
	}
}
