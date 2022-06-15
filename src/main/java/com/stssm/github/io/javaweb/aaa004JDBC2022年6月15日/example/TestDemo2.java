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
 * User:  wo1261931780@gmail.com
 * Time:  2022-06-21-59  星期三
 *
 * @author liujiajun_junw
 */
public class TestDemo2 {
	@Test
	public void test() throws Exception {
		Properties prop = new Properties();
		prop.load(new FileInputStream("src/druid.properties"));
		DataSource dataSource = DruidDataSourceFactory.createDataSource(prop);
		Connection connection = dataSource.getConnection();
		// ******************************************************************************
		String brandName = "测试";
		String companyName = "测试2";
		int ordered = 333;
		String description = "";
		int status = 444;

		String demoSql = "insert into study002jdbc.tb_brand(brand_name, company_name, ordered, description, status) values(?,?,?,?,?)";
		PreparedStatement preparedStatement = connection.prepareStatement(demoSql);
		preparedStatement.setString(1, brandName);
		preparedStatement.setString(2, companyName);
		preparedStatement.setInt(3, ordered);
		preparedStatement.setString(4, description);
		preparedStatement.setInt(5, status);


		preparedStatement.close();
		connection.close();
		// System.out.println(x);
	}
}
