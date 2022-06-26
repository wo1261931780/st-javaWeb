package com.stssm.github.io.javaweb.aaa006JDBC2022年6月18日;

import com.stssm.github.io.javaweb.aaa006JDBC2022年6月18日.pojo.DemoPojo;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.javaweb.aaa004JDBC2022年6月17日
 * User:  liujiajun_junw
 * Time:  2022-06-22-07  星期五
 */
public class aaa015 {
	public static void main(String[] args) throws IOException {
		// *********************************************************************
		String resource = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		List<DemoPojo> resList = sqlSession.selectList("DemoMapper.selectAll");// 获得一个list类型的结果
		// 这里有一个很大的问题：我要手动获取对应的方法，写方法名是可能出错的
		// 为了解决这个问题，就需要使用代理模式
		// 通过代理模式，来获得对应类中的方法
		// 之前要求xml和类名在同一个目录下面，因为编译完成后，也会将其放到一起
		// 但是在开发过程中，要求类和resource分开放
		System.out.println(resList);
		sqlSession.close();

	}


}
