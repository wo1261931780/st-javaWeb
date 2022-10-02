package com.stssm.github.io.javaweb.aaa027javaweb20220726.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

import static com.stssm.github.io.javaweb.aaa002jdbc20220531.Aaa001Demo.LOG_SHOW;
import static com.stssm.github.io.javaweb.aaa002jdbc20220531.Aaa001Demo.RESOURCE;

/**
 * @author liujiajun_junw
 */

public class SqlSessionFactoryUtils {
	public SqlSessionFactoryUtils() {
		LOG_SHOW.debug("123");
	}

	private static SqlSessionFactory sqlSessionFactory;

	static {
		// 静态代码块会随着类的加载而自动执行，且只执行一次
		try {
			// String resource = "mybatis-config.xml";
			InputStream inputStream = Resources.getResourceAsStream(RESOURCE);
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


	public static SqlSessionFactory getSqlSessionFactory() {
		return sqlSessionFactory;
	}
}
