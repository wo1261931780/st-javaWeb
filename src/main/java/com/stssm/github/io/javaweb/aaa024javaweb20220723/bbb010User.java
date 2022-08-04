package com.stssm.github.io.javaweb.aaa024javaweb20220723;

/**
 * @author liujiajun_junw
 */
public class bbb010User {

	private Integer id;
	private String username;
	private String password;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "bbb010User{" +
				       "id=" + id +
				       ", username='" + username + '\'' +
				       ", password='" + password + '\'' +
				       '}';
	}
}
