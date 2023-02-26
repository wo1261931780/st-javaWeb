package com.stssm.github.io.javaweb.aaa006jdbc20220618;

import com.stssm.github.io.javaweb.aaa006jdbc20220618.pojo.DemoPojo0618;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import static com.stssm.github.io.javaweb.aaa002jdbc20220531.Aaa001Demo.LOG_SHOW;
import static com.stssm.github.io.javaweb.aaa002jdbc20220531.Aaa001Demo.RESOURCE;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.javaweb.aaa004JDBC2022年6月17日
 * Bbb010User:  liujiajun_junw
 * Time:  2022-06-22-07  星期五
 * @author liujiajun_junw
 */
public class Aaa020javaEe {
	public static void main(String[] args) throws IOException {
		// *********************************************************************
		// String resource = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(RESOURCE);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		List<DemoPojo0618> resList = sqlSession.selectList("DemoMapper0618.selectAll");// 获得一个list类型的结果
		// 这里有一个很大的问题：我要手动获取对应的方法，写方法名是可能出错的
		// 为了解决这个问题，就需要使用代理模式
		// 通过代理模式，来获得对应类中的方法
		// 之前要求xml和类名在同一个目录下面，因为编译完成后，也会将其放到一起
		// 但是在开发过程中，要求类和resource分开放
		LOG_SHOW.debug(resList);
		sqlSession.close();
	}
}
