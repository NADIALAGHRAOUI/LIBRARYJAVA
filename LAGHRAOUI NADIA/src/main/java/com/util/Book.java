package com.util;

public class Book {
	int IdBook, IdCategory;
	String namebook, author;
	public int getIdBook() {
		return IdBook;
	}
	public void setIdBook(int idBook) {
		IdBook = idBook;
	}
	public int getIdCategory() {
		return IdCategory;
	}
	public void setIdCategory(int idCategory) {
		IdCategory = idCategory;
	}
	public String getNamebook() {
		return namebook;
	}
	public void setNamebook(String namebook) {
		this.namebook = namebook;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	@Override
	public String toString() {
		return "Book [IdBook=" + IdBook + ", IdCategory=" + IdCategory + ", namebook=" + namebook + ", author=" + author
				+ "]";
	}
	public Book(int idBook, int idCategory, String namebook, String author) {
		super();
		IdBook = idBook;
		IdCategory = idCategory;
		this.namebook = namebook;
		this.author = author;
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
