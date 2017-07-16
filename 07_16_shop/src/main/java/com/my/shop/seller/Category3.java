package com.my.shop.seller;

public class Category3 {
	private int id;
	private String name;
	private int p_id;
	public Category3() {
		super();
	}
	public Category3(int id, String name, int p_id) {
		super();
		this.id = id;
		this.name = name;
		this.p_id = p_id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getP_id() {
		return p_id;
	}
	public void setP_id(int p_id) {
		this.p_id = p_id;
	}
	@Override
	public String toString() {
		return "Category3 [id=" + id + ", name=" + name + ", p_id=" + p_id + "]";
	}
	
}
