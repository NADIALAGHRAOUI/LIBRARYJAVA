package com.util;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CategoryOfBook {
	

public int AddCategory(String category) {
		DBinteraction.connect();
		String sql="Insert into category (category) values('"+category+"')";
		int n=DBinteraction.Maj(sql);
		DBinteraction.disconnect();
		return n;
	}
	
public List<Book> SearchByCategory(int IdCategory){
		Book b=null;
		List<Book> re = new ArrayList<Book>();
		DBinteraction.connect();
		ResultSet res= DBinteraction.select("select * from book where IdCategory="+IdCategory);
		
		try {
			while(res.next())
			
				b=new Book();
				b.setIdBook(res.getInt(1));
				b.setIdCategory(res.getInt(2));
				b.setNamebook(res.getString(3));
				b.setAuthor(res.getString(4));
				re.add(b);
			} catch (SQLException e) {
			// TODO Auto-generate
			e.printStackTrace();
		}
		DBinteraction.disconnect();
		return re;
}
public  List<Category> ShowAllCategory() throws SQLException{
	
	List<Category> re=new ArrayList <Category>();
	DBinteraction.connect();
	ResultSet res = DBinteraction.select("select * from category");
	try {
	while(res.next()) 
	{ 	
	
		Category c= new Category();
		c.setIdCategory(res.getInt(1));
		c.setCategory(res.getString(2));
		re.add(c);
	}
	} catch (SQLException e) {
		// TODO Auto-generate
		e.printStackTrace();
	}
	DBinteraction.disconnect();
	return re;
}
}



