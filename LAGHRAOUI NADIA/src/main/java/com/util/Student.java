package com.util;

public class Student {
	 private int  IdStudent;
	 private String login, password, lastname, firstname;
	public int getIdStudent() {
		return IdStudent;
	}
	public void setIdStudent(int idStudent) {
		IdStudent = idStudent;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	@Override
	public String toString() {
		return "Student [IdStudent=" + IdStudent + ", login=" + login + ", password=" + password + ", lastname="
				+ lastname + ", firstname=" + firstname + "]";
	}
	public Student(int idStudent, String login, String password, String lastname, String firstname) {
		super();
		IdStudent = idStudent;
		this.login = login;
		this.password = password;
		this.lastname = lastname;
		this.firstname = firstname;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
