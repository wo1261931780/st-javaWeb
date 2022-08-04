package com.stssm.github.io.javaweb.aaa006jdbc20220618;

import com.stssm.github.io.javaweb.aaa006jdbc20220618.pojo.DemoPojo;
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
 * bbb010User:  liujiajun_junw
 * @author liujiajun_junw
 * Time:  2022-06-22-07  星期五
 */
public class aaa014 {
	public static void main(String[] args) throws IOException {
		// javaee的三层架构
		// 表现层是来做页面展示的，业务层负责逻辑处理，持久层负责数据库交互
		// mybatis就是持久层的框架
		// 使用以后，提高开发的效率
		// 硬编码，简单来说就是变量写死
		// 类似我的账号密码，每次都是直接复制固定的，如果后续发生了修改，那么我需要重新赋值，工作量比较大，又比较繁琐
		// pojo类，对应的是一个实体的表
		// *********************************************************************

		String resource = "mybatis-config.xml";// 直接加载对应的配置文件
		InputStream inputStream = Resources.getResourceAsStream(resource);// 获取resource中的对象
		// 实际上，这一步就是拿到mapper
		// 而mapper中有对应SQL的执行命令
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		// 然后通过SqlSessionFactoryBuilder这个对象，让他调用build方法
		// 获得一个工厂
		SqlSession sqlSession = sqlSessionFactory.openSession();
		// 让工厂获得sql执行对象
		List<DemoPojo> resList = sqlSession.selectList("DemoMapper.selectAll");// 获得一个list类型的结果
		// 指定我要执行的mapper以后，就可以根据mapper中的SQL，获得一个demopojo类型的list对象
		System.out.println(resList);
		sqlSession.close();// 不需要释放工厂，只需要释放这个执行方法的session就可以
		// *********************************************************************
		// List<DemoPojo> resList = sqlSession.selectList("DemoMapper.selectAll");
		// 这里有一个很大的问题：我要手动获取对应的方法，写方法名是可能出错的
	}


}
