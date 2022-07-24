package com.stssm.github.io.javaweb.aaa025JAVAWEB2022年7月24日;

/**
 * Created by Intellij IDEA.
 * Project:ajax-demo
 * Package:com.itheima.web.servlet
 *
 * @param
 * @author liujiajun_junw
 * @Date 2022-07-10-56  星期日
 * @description
 * @return
 * @exception
 */
public class bbb015brandPojo {
	private String name;
	private Integer age;
	private String address;

	public bbb015brandPojo() {
	}

	public bbb015brandPojo(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}

	@Override
	public String toString() {
		return "bbb015brandPojo{" +
				       "name='" + name + '\'' +
				       ", age=" + age +
				       ", address='" + address + '\'' +
				       '}';
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
