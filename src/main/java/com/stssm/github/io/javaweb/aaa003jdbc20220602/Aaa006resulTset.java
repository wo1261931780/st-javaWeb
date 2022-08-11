package com.stssm.github.io.javaweb.aaa003jdbc20220602;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.javaweb.aaa003jdbc20220602
 * Bbb010User:  wo1261931780@gmail.com
 * Time:  2022-06-21-26  星期二
 * @author liujiajun_junw
 */
public class Aaa006resulTset {
	public static void main(String[] args) throws Exception {
		String paw = "LIU18959297292";
		String login = "root";
		String url = "jdbc:mysql:///study002jdbc?useSSL=false";
		Connection connection = DriverManager.getConnection(url, login, paw);
		String demoSql = "select * from demo1 ";
		// ResultSet resultSet = connection.createStatement().executeQuery(demoSql);
		ResultSet resultSet = connection.createStatement().executeQuery(demoSql);
		// while (resultSet.next()) {
		// 	// System.out.println("我是result：" + resultSet);
		// 	int id = resultSet.getInt(1);
		// 	String name = resultSet.getString(2);
		// 	int price = resultSet.getInt(3);
		// 	// 注意了，这里是按照顺序依次增加的，不是同一个index=1
		// 	System.out.println(id + "--" + name + "--" + price);
		// }
		// ============================================================================
		while (resultSet.next()) {
			// System.out.println("我是result：" + resultSet);
			int id = resultSet.getInt("id");
			String name = resultSet.getString("name");
			int price = resultSet.getInt("price");
			// 修改以后，就会变成数据栏的名称
			System.out.println(id + "--" + name + "--" + price);

		}
		// ============================================================================
		// 上面两个东西的用法，在于取数据的方法不同
		// 如果是索引，可以直接拿到对应栏目的数据，前提是你知道栏目的位置
		// 我觉得这个方法用的比较少
		connection.close();
		// 如果是变量的名称，就是想拿什么数据拿什么数据
		// 这种比较适合自定义

	}
}
