package com.stssm.github.io.javaweb.aaa002JDBC2022年5月31日;

import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.javaweb.aaaJDBC2022年5月31日
 * User:  wo1261931780@gmail.com
 * Time:  2022-05-20-42  星期二
 *
 * @author 1
 */
public class aaa004StatementTest {


	@Test
	public void show1() throws Exception {
		final String url = "jdbc:mysql:///study001sql?useSSL=false";
		final String loginName = "root";
		final String loginPassword = "LIU18959297292";

		final Connection connection = DriverManager.getConnection(url, loginName, loginPassword);
		final String sql1 = "update study002jdbc.demo1 set price='3000' where id=1";

		try {
			connection.setAutoCommit(false);// 开启事物
			final Statement stat = connection.createStatement();// 创建SQL
			final int res = stat.executeUpdate(sql1);// 执行SQL语句，返回受影响的行数
			System.out.println("受影响的行数为：" + res);
			connection.commit();// 提交事物
		} catch (final Exception e) {
			e.printStackTrace();
			// 在异常中进行事物的回滚操作
			connection.rollback();// 回滚事物
		} finally {
			connection.close();
		}
	}

	@Test
	public void show2() throws Exception {
		final String url = "jdbc:mysql:///study001?useSSL=false";
		final String loginName = "root";
		final String loginPassword = "LIU18959297292";
		final Connection conn = DriverManager.getConnection(url, loginName, loginPassword);
		final String sql1 = "update demo14bankaccount set balance='123' where id=1 ";
		// String sql2 = "create database  dbdemo2";
		final String sql2 = "drop database if exists dbdemo2";
		final Statement stat = conn.createStatement();
		// int res = stat.executeUpdate(sql1);
		final int res = stat.executeUpdate(sql2);
		System.out.println(res);// 新增数据库和删除数据库，返回的结果都是0
		conn.commit();
		conn.close();
	}
}
