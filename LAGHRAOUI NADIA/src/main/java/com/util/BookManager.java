package com.util;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class BookManager {

public int Addbook(int IdCategory, String namebook, String author) {
	DBinteraction.connect();
	String sql="Insert into book (IdCategory ,namebook , author) values("+IdCategory+",'"+namebook+"','"+author+"')";
	int n=DBinteraction.Maj(sql);
	DBinteraction.disconnect();
	return n;
}


public List<Book> SearchByAuthor(String author) throws SQLException{
	
	List<Book> re=new ArrayList <Book>();
	DBinteraction.connect();
	ResultSet res = DBinteraction.select("select * from Book where author="+author);
	while(res.next()) 
	{ 	
	
		Book b= new Book();
		b.setIdBook(res.getInt(1));
		b.setIdCategory(res.getInt(2));
		b.setNamebook(res.getString(3));
		b.setAuthor(res.getString(4));
		re.add(b);
	}
	return re;
}
	
public List<Book> ShowBooks() throws SQLException{
		
		List<Book> re=new ArrayList <Book>();
		DBinteraction.connect();
		ResultSet res = DBinteraction.select("select * from Book");
		while(res.next()) 
		{ 	
			Book b= new Book();
			b.setIdBook(res.getInt(1));
			b.setIdCategory(res.getInt(2));
			b.setNamebook(res.getString(3));
			b.setAuthor(res.getString(4));
			re.add(b);
		}
		return re;
		}

}
