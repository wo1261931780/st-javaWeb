package com.stssm.github.io.javaweb.aaa003JDBC2022年6月2日;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.javaweb.aaa003JDBC2022年6月2日
 * bbb010User:  wo1261931780@gmail.com
 * Time:  2022-06-22-14  星期二
 */
public class aaa008case {
	public static void main(String[] args) {
		String paw = "LIU18959297292";
		String url = "jdbc:mysql:///study002jdbc?useSSL=false";
		String acc = "root";
		ArrayList<aaa007object> objects = new ArrayList<>();
		try (
				Connection connection = DriverManager.getConnection(url, acc, paw)
		) {
			String demosql = "select *from study002jdbc.demo1 where name is not null";
			ResultSet resultSet = connection.createStatement().executeQuery(demosql);
			while (resultSet.next()) {
				int id = resultSet.getInt("id");
				String name = resultSet.getString("name");
				String price = resultSet.getString("price");
				aaa007object x = new aaa007object(String.valueOf(id), name, price);
				System.out.println(objects.add(x));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		System.out.println(objects);


	}
}
