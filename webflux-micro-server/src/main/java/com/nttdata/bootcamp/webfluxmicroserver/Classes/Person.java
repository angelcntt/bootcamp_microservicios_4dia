package com.nttdata.bootcamp.webfluxmicroserver.Classes;

public class Person {
	private String firtsname;
	
	private String lastname;
	
	private Integer age;
	
	
	
	

	public Person(String firtsname, String lastname, Integer age) {
		this.firtsname = firtsname;
		this.lastname = lastname;
		this.age = age;
	}

	public String getFirtsname() {
		return firtsname;
	}

	public void setFirtsname(String firtsname) {
		this.firtsname = firtsname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
	
	
}
