package com.stssm.github.io.junw;

import com.stssm.github.io.javaweb.aaa004JDBC2022年6月18日.mapper.BrandMapper;
import com.stssm.github.io.javaweb.aaa004JDBC2022年6月18日.pojo.TbBrand;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.junw
 * User:  liujiajun_junw
 * Time:  2022-06-21-09  星期六
 */
public class TbBrandTest {
	@Test
	public void demoShow() throws IOException {
		String resource = "mybatis-config.xml";
		InputStream resourceAsStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
		SqlSession sqlSession = build.openSession();
		BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);
		List<TbBrand> tbBrands = mapper.showRes();
		System.out.println(tbBrands);
		sqlSession.close();
	}

	@Test
	public void demoShowById() throws IOException {
		String resource = "mybatis-config.xml";
		String id = "1";
		InputStream resourceAsStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
		SqlSession sqlSession = build.openSession();
		BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);
		TbBrand tbBrand = mapper.selectById(Integer.parseInt(id));
		System.out.println(tbBrand);
		sqlSession.close();
	}
}
