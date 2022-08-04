package com.stssm.github.io.javaweb.aaa019javaweb20220711.pojo;

/**
 * Created by Intellij IDEA.
 * Project:show
 * Package:pojo
 *
 * @param
 * @author liujiajun_junw
 * @Date 2022-07-21-57  星期一
 * @description
 * @return
 * @exception
 */
public class user {
	private String id;
	private String password;

	@Override
	public String toString() {
		return "user{" +
				       "id='" + id + '\'' +
				       ", password='" + password + '\'' +
				       '}';
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
