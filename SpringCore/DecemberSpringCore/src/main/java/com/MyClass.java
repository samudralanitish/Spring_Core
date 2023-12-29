package com;

import java.beans.Beans;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyClass {
	public static void main(String[] args) {
//		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
		Student student = context.getBean(Student.class);
		System.out.println(student.sid);
		System.out.println(student.name);
		System.out.println(student.adr.dno);
		System.out.println(student.adr.city);
	}
}
