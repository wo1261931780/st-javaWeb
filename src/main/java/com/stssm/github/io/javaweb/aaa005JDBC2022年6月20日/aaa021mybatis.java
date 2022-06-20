package com.stssm.github.io.javaweb.aaa005JDBC2022年6月20日;

import com.stssm.github.io.javaweb.aaa005JDBC2022年6月19日.mapper.TbBrandMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.javaweb.aaa005JDBC2022年6月20日
 * User:  liujiajun_junw
 * Time:  2022-06-22-46  星期一
 */
public class aaa021mybatis {


	@Test
	public void test() {
		String resource = "mybatis-config.xml";
		try {
			InputStream resourceAsStream = Resources.getResourceAsStream(resource);
			SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
			SqlSession sqlSession = build.openSession(true);
			TbBrandMapper mapper = sqlSession.getMapper(TbBrandMapper.class);
			

			sqlSession.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
