package com.util;

import java.sql.ResultSet;
import java.sql.SQLException;


public class StudentManager {
	
	public static int Addstudent(Student s){
		DBinteraction.connect();
		String sql="Insert into student values(null,'"+s.getLogin()+"','"+s.getPassword()+"','"+s.getLastname()+"','"+s.getFirstname()+"')";
		int n=DBinteraction.Maj(sql);
		DBinteraction.disconnect();
		return n;
	}
	
	public int Addstudent(String log, String ps, String lname, String fname){
		DBinteraction.connect();
		String sql="Insert into student(login, password, lastname,firstname) values('"+log+"','"+ps+"','"+lname+"','"+fname+"')";
		int n=DBinteraction.Maj(sql);
		DBinteraction.disconnect();
		return n;
	}
	
		
	public  Student Authentification(String login, String password) {
		Student s = null ;
			DBinteraction.connect();
			ResultSet res = DBinteraction.select("select * from student where login='"+login+"' and password='"+password+"'");
			try {
				if(res.next())   
				{
					s=new Student();
					s.setLogin(res.getString(2));
					s.setPassword(res.getString(3));
					s.setLastname(res.getString(4));
					s.setFirstname(res.getString(5));

					}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return s;

		}
}
