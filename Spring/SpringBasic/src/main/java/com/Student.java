package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component()
public class Student {
	@Value("${id}")
	int id;
	@Value("${name}")
	String name;
	@Autowired
//	@Qualifier("arr2")
	Address arr;
//	public int getId() {
//		return id;
//	}
//	public void setId(int id) {
//		this.id = id;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public Address getArr() {
//		return arr;
//	}
//	public void setArr(Address arr) {
//		this.arr = arr;
//	}


	
	
}
