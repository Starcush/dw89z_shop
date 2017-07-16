package com.my.shop.seller;

public class Product {
	private int num;
	private String name;
	private int quantity;
	private int price;
	private String img;
	private String content;
	private String s_id;
	private Category1 c1;
	private Category2 c2;
	private Category3 c3;
	public Product() {
		super();
	}
	public Product(int num, String name, int quantity, int price, String img, String content, String s_id, Category1 c1,
			Category2 c2, Category3 c3) {
		super();
		this.num = num;
		this.name = name;
		this.quantity = quantity;
		this.price = price;
		this.img = img;
		this.content = content;
		this.s_id = s_id;
		this.c1 = c1;
		this.c2 = c2;
		this.c3 = c3;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getS_id() {
		return s_id;
	}
	public void setS_id(String s_id) {
		this.s_id = s_id;
	}
	public Category1 getC1() {
		return c1;
	}
	public void setC1(Category1 c1) {
		this.c1 = c1;
	}
	public Category2 getC2() {
		return c2;
	}
	public void setC2(Category2 c2) {
		this.c2 = c2;
	}
	public Category3 getC3() {
		return c3;
	}
	public void setC3(Category3 c3) {
		this.c3 = c3;
	}

	@Override
	public String toString() {
		return "Product [num=" + num + ", name=" + name + ", quantity=" + quantity + ", price=" + price + ", img=" + img
				+ ", content=" + content + ", s_id=" + s_id + ", c1=" + c1 + ", c2=" + c2 + ", c3=" + c3 + "]";
	}
	
}
