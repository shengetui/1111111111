package com.xt.contro;


import com.sun.istack.internal.NotNull;

public class Gg {
	@NotNull
private Integer id;
	
private String name;
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Gg(Integer id, String name) {
	super();
	this.id = id;
	this.name = name;
}
public Gg() {
	super();
	// TODO Auto-generated constructor stub
}


}
