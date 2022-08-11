package com.stssm.github.io.javaweb.aaa003jdbc20220602;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.javaweb.aaa003jdbc20220602
 * Bbb010User:  wo1261931780@gmail.com
 * Time:  2022-06-20-49  星期四
 *
 * @author 1
 */
public class Aaa005Statement {
	public static void main(final String[] args) throws Exception {
		String user = "root";
		String paw = "LIU18959297292";
		String url = "jdbc:mysql:///study002jdbc?useSSL=false";
		Connection connection = DriverManager.getConnection(url, user, paw);
		String demoSql = "update demo1 set E_NAME='测试' where id='123'";
		try {
			Statement demoStatement = connection.createStatement();
			int i = demoStatement.executeUpdate(demoSql);// 这里返回的就是受影响的行数
			System.out.println(i == 0);// 如果影响超过一行，就是成功，否则失败
			// 不过，如果我执行的是删除语句，这里也会返回0

			// ***********************************************************************************
			// boolean execute = connection.createStatement().execute(demoSql);
			// 这里可以通过给出的数据来判断SQL是否执行成功
			// 我们有的时候会直接使用excute来执行update命令
			// System.out.println("测试结果" + execute);
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("测试结果");
		} finally {
			connection.close();
		}
	}

}
