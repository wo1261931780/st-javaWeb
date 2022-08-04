package com.stssm.github.io.javaweb.aaa008jdbc20220620;

import com.stssm.github.io.javaweb.aaa008jdbc20220620.mapper.TbBrandMapper;
import com.stssm.github.io.javaweb.aaa008jdbc20220620.pojo.TbBrand;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.javaweb.aaa005JDBC2022年6月20日
 * Bbb010User:  liujiajun_junw
 * @author liujiajun_junw
 * Time:  2022-06-20-24  星期一
 */
public class Aaa020mybatisTest {


	@Test
	public void deleteById() {
		int id = 13;
		String brandName = "123";
		String companyName = "123";
		Integer ordered = 11;
		String description = "123";
		Integer status = 1;
		TbBrand tbBrand = new TbBrand();
		tbBrand.setId(id);
		String resource = "mybatis-config.xml";
		try {
			InputStream resourceAsStream = Resources.getResourceAsStream(resource);
			SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
			SqlSession sqlSession = build.openSession(true);
			TbBrandMapper mapper = sqlSession.getMapper(TbBrandMapper.class);
			mapper.deleteById(id);
			sqlSession.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void deleteByIds() {
		int[] id = {123, 1, 12};
		String resource = "mybatis-config.xml";
		try {
			InputStream resourceAsStream = Resources.getResourceAsStream(resource);
			SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
			SqlSession sqlSession = build.openSession(true);
			TbBrandMapper mapper = sqlSession.getMapper(TbBrandMapper.class);
			mapper.deleteByIds(id);
			sqlSession.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testBySelect() {
		int id = 3;
		// String brandName = "华为";
		String brandName = "";
		String companyName = "";
		Integer ordered = 11;
		String description = "123";
		Integer status = 1;
		String resource = "mybatis-config.xml";
		try {
			InputStream resourceAsStream = Resources.getResourceAsStream(resource);
			SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
			SqlSession sqlSession = build.openSession(true);
			TbBrandMapper mapper = sqlSession.getMapper(TbBrandMapper.class);
			mapper.selectTotal(id, brandName, companyName);
			sqlSession.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testCase() {
		int id = 3;
		String brandName = "华为";
		String companyName = "华为";
		Integer ordered = 11;
		TbBrand tbBrand = new TbBrand();
		tbBrand.setCompanyName(companyName);
		tbBrand.setOrdered(ordered);
		Map map = new HashMap(5);
		map.put(id, tbBrand);
		String resource = "mybatis-config.xml";
		try {
			InputStream resourceAsStream = Resources.getResourceAsStream(resource);
			SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
			SqlSession sqlSession = build.openSession(true);
			TbBrandMapper mapper = sqlSession.getMapper(TbBrandMapper.class);
			mapper.mapCase(map);
			sqlSession.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		// 上面这个问题没有解决
		// 2022年6月20日22:45:45

	}
}
