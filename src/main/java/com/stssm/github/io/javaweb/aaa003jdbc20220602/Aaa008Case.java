package com.stssm.github.io.javaweb.aaa003jdbc20220602;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.javaweb.aaa003jdbc20220602
 * Bbb010User:  wo1261931780@gmail.com
 * Time:  2022-06-22-14  星期二
 * @author liujiajun_junw
 */
public class Aaa008Case {
	public static void main(String[] args) {
		String paw = "LIU18959297292";
		String url = "jdbc:mysql:///study002jdbc?useSSL=false";
		String acc = "root";
		ArrayList<Aaa007Object> objects = new ArrayList<>();
		try (
				Connection connection = DriverManager.getConnection(url, acc, paw)
		) {
			String demosql = "select *from study002jdbc.demo1 where name is not null";
			ResultSet resultSet = connection.createStatement().executeQuery(demosql);
			while (resultSet.next()) {
				int id = resultSet.getInt("id");
				String name = resultSet.getString("name");
				String price = resultSet.getString("price");
				Aaa007Object x = new Aaa007Object(String.valueOf(id), name, price);
				System.out.println(objects.add(x));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		System.out.println(objects);


	}
}
