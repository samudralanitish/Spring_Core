package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Student {
	@Value("${sid}")
	int sid;
	@Value("${name}")
	String name;
	
	@Autowired
	Address adr;

	//using getter & setter injection
	
//	public int getSid() {
//		return sid;
//	}
//	public Address getAdr() {
//		return adr;
//	}
//	public void setAdr(Address adr) {
//		this.adr = adr;
//	}
//	public void setSid(int sid) {
//		this.sid = sid;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
	
}
