package com.xt.contro;

import java.util.Date;

public class User {
	private int id;
private String username;
private int password;
private String name;
private int age;
private Date hap;



public Date getHap() {
	return hap;
}
public void setHap(Date hap) {
	this.hap = hap;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public int getPassword() {
	return password;
}
public void setPassword(int password) {
	this.password = password;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}

public User() {
	super();
	// TODO Auto-generated constructor stub
}
public User(int id, String username, int password, String name, int age) {
	super();
	this.id = id;
	this.username = username;
	this.password = password;
	this.name = name;
	this.age = age;
}



}
