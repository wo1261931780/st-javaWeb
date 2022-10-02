package com.stssm.github.io.junw;

import com.stssm.github.io.javaweb.aaa006jdbc20220618.mapper.BrandMapper0618;
import com.stssm.github.io.javaweb.aaa006jdbc20220618.pojo.TbBrand0618;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import static com.stssm.github.io.javaweb.aaa002jdbc20220531.Aaa001Demo.LOG_SHOW;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.junw
 * Bbb010User:  liujiajun_junw
 * Time:  2022-06-21-09  星期六
 */
public class bbb029TbBrandTest0618 {
	@Test
	public void demoShow() throws IOException {
		String resource = "mybatis-config.xml";
		InputStream resourceAsStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
		SqlSession sqlSession = build.openSession();
		BrandMapper0618 mapper = sqlSession.getMapper(BrandMapper0618.class);
		List<TbBrand0618> tbBrand0618s = mapper.showRes();
		LOG_SHOW.debug(tbBrand0618s);
		sqlSession.close();
	}

	@Test
	public void demoShowById() throws IOException {
		String resource = "mybatis-config.xml";
		String id = "1";
		InputStream resourceAsStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
		SqlSession sqlSession = build.openSession();
		BrandMapper0618 mapper = sqlSession.getMapper(BrandMapper0618.class);
		TbBrand0618 tbBrand0618 = mapper.selectById(Integer.parseInt(id));
		LOG_SHOW.debug(tbBrand0618);
		sqlSession.close();
	}
}
