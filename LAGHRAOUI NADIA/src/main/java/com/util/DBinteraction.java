package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBinteraction {
	private static String url="jdbc:mysql://localhost:3306/library";
	private static Connection con;
	private static Statement st;
	
	public static void connect()
	{
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection(url, "root", "");
			st=con.createStatement();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void disconnect()
	{
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public static int Maj(String sql)
	{
		int nb=0;
		try {
			nb=st.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return nb;
	}
	public static ResultSet select(String sql)
	{
		ResultSet rs=null;
		try {
			rs = st.executeQuery(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rs;
	}
}
