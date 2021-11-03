package com.nars.standard.validators;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
@ManagedBean
@SessionScoped
public class User implements Serializable{
	private static final long serialVersionUID = 7134492943336358840L;
	private double salary;
	private String username;
	private int age;
	
	public int getAge() {
	return age;
	}
	public void setAge(int age) {
	this.age = age;
	}
	public String getUsername() {
	return username;
	}
	public void setUsername(String username) {
	this.username = username;
	}
	public double getSalary() {
	return salary;
	}
	public void setSalary(double salary) {
	this.salary = salary;
	}
	
}
