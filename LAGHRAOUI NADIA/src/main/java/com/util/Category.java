package com.util;

public class Category {
	int IdCategory;
	String category;
	
	public int getIdCategory() {
		return IdCategory;
	}
	public void setIdCategory(int idCategory) {
		IdCategory = idCategory;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	@Override
	public String toString() {
		return "Category [IdCategory=" + IdCategory + ", category=" + category + "]";
	}
	public Category(int idCategory, String category) {
		super();
		IdCategory = idCategory;
		this.category = category;
	}
	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
