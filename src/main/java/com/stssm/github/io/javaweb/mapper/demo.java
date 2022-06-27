package com.stssm.github.io.javaweb.mapper;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.javaweb.mapper
 *
 * @param
 * @author liujiajun_junw
 * @Date 2022-06-15-08  星期一
 * @description
 * @return
 * @exception
 */
public class demo {
	private String name;
	private int id;

	public demo() {
	}

	public demo(String name, int id) {
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
