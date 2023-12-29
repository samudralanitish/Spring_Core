package com;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Address {
	@Value("${dno}")
	int dno;
	@Value("${city}")
	String city;
	
	//using getter & setter injection
//	public int getDno() {
//		return dno;
//	}
//	public void setDno(int dno) {
//		this.dno = dno;
//	}
//	public String getCity() {
//		return city;
//	}
//	public void setCity(String city) {
//		this.city = city;
//	}
	
	// using Constructor injection
//	public Address(int dno, String city) {
//		super();
//		this.dno = dno;
//		this.city = city;
//	}
	
	
	
	
}
