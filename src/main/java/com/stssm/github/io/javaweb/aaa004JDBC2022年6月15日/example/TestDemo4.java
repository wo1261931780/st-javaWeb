package com.stssm.github.io.javaweb.aaa004JDBC2022年6月15日.example;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import org.junit.jupiter.api.Test;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Properties;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.javaweb.aaa004JDBC2022年6月15日.example
 * bbb010User:  wo1261931780@gmail.com
 * Time:  2022-06-21-59  星期三
 *
 * @author liujiajun_junw
 */
public class TestDemo4 {
	@Test
	public void test() throws Exception {
		Properties prop = new Properties();
		prop.load(new FileInputStream("src/druid.properties"));
		DataSource dataSource = DruidDataSourceFactory.createDataSource(prop);
		Connection connection = dataSource.getConnection();
		// ******************************************************************************
		int id = 4;

		String demoSql = "delete  from study002jdbc.tb_brand where id=?";
		PreparedStatement preparedStatement = connection.prepareStatement(demoSql);
		preparedStatement.setInt(1, id);

		int clomn = preparedStatement.executeUpdate();

		preparedStatement.close();
		connection.close();
		System.out.println("插入数据结果：" + (clomn == 1));
	}
}
