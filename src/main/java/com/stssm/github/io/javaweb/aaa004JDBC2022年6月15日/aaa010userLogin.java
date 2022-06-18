package com.stssm.github.io.javaweb.aaa004JDBC2022年6月15日;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.javaweb.aaa003JDBC2022年6月2日
 * User:  wo1261931780@gmail.com
 * Time:  2022-06-22-47  星期二
 */
public class aaa010userLogin {
	public static void main(String[] args) throws Exception {

		String paw = "LIU18959297292";
		// String url = "jdbc:mysql:///study002jdbc?useSSL=false";
		String url = "jdbc:mysql:///study002jdbc?useSSL=false&useServerPrepStmts=true";
		// 加一个后缀，就是添加一个预编译功能
		String login = "root";
		Connection connection = null;
		try {
			String name = "DemoPojo";
			String password = "123";
			connection = DriverManager.getConnection(url, login, paw);
			// 相当于，我设置好了连接以后，直接使用了prepare方法
			String demoSql = "select * from study002jdbc.account where id=? and password=?";
			PreparedStatement prs = connection.prepareStatement(demoSql);// 其实这一步，已经将SQL命令发送给了服务器，只不过还没有设置变量
			// 然后方法得到了一个prs对象
			prs.setString(1, name);
			// 我利用prs对象，来设置问号的具体数值
			prs.setString(2, password);// 在设置完成以后，才会开始执行
			// 这里避免SQL注入的原理，就是将我输入的内容，全部作为一个文本传输
			// 类似''，都会被转换为\',因此，最后问号内是一个完整的SQL，而不是被转换后的SQL
			// **************************************************************************************************
			// 这里有一个预编译的概念
			// 我一开始把SQL发送过去，实际上是将SQL的编译和赋值分离
			// 主要是提高了整体的性能

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			connection.close();

		}

	}
}
