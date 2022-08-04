package com.stssm.github.io.javaweb.aaa003jdbc20220602;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.javaweb.aaa003jdbc20220602
 * bbb010User:  wo1261931780@gmail.com
 * Time:  2022-06-22-13  星期二
 * @author liujiajun_junw
 */
public class aaa007object {
	private String id;
	private String name;
	private String price;

	public aaa007object() {
	}

	public aaa007object(String id, String name, String price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "aaa007object{" +
				       "id='" + id + '\'' +
				       ", name='" + name + '\'' +
				       ", price='" + price + '\'' +
				       '}';
	}
}
