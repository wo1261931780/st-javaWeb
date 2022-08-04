package com.stssm.github.io.javaweb.aaa020javaweb20220712.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by Intellij IDEA.
 * Project:show
 * Package:demo.util
 *
 * @param
 * @author liujiajun_junw
 * @Date 2022-07-21-24  星期二
 * @description
 * @return
 * @exception
 */
public class SQLsessionFactoryUtil {
	private static SqlSessionFactory sqlSessionFactory;// 提升作用域
	// 新建一个成员变量


	static {
		try {
			String resource = "mybatis-config.xml";
			InputStream inputStream = Resources.getResourceAsStream(resource);
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static SqlSessionFactory getSqlSessionFactory() {
		return sqlSessionFactory;
	}


}
