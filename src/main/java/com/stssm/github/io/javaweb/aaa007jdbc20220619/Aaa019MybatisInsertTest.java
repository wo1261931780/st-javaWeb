package com.stssm.github.io.javaweb.aaa007jdbc20220619;

import com.stssm.github.io.javaweb.aaa007jdbc20220619.mapper.TbBrandMapper;
import com.stssm.github.io.javaweb.aaa007jdbc20220619.pojo.TbBrand;
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
 * Package:com.stssm.github.io.javaweb.aaa005JDBC2022年6月19日
 * Bbb010User:  liujiajun_junw
 * @author liujiajun_junw
 * Time:  2022-06-16-03  星期日
 */
public class Aaa019MybatisInsertTest {
	@Test
	public void mybatisInsert() {
		String resource = "mybatis-config.xml";
		try {
			InputStream resourceAsStream = Resources.getResourceAsStream(resource);
			SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
			// SqlSession sqlSession = build.openSession();// 这里可以设置事物是自动提交还是手动提交
			SqlSession sqlSession = build.openSession(true);// 默认是手动提交，设置为true就是自动提交
			TbBrandMapper mapper = sqlSession.getMapper(TbBrandMapper.class);
			// *********************************************************************
			int status2 = 1;
			String companyName2 = "华为";
			String brandName2 = "华为";
			String desciption = "华为";
			int ordered = 123;
			// *********************************************************************
			TbBrand tbBrand = new TbBrand();
			tbBrand.setStatus(status2);
			tbBrand.setCompanyName(companyName2);
			tbBrand.setBrandName(brandName2);
			tbBrand.setDescription(desciption);
			tbBrand.setOrdered(ordered);
			mapper.mybatisInsert(tbBrand);
			sqlSession.commit();// 提交事物
			// 主键不用手动添加，因为是自动递增的

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void mybatisInsert2() {
		String resource = "mybatis-config.xml";
		try {
			InputStream resourceAsStream = Resources.getResourceAsStream(resource);
			SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
			SqlSession sqlSession = build.openSession(true);
			TbBrandMapper mapper = sqlSession.getMapper(TbBrandMapper.class);
			// *********************************************************************
			int status2 = 1;
			String companyName2 = "华为";
			String brandName2 = "华为";
			String desciption = "华为";
			int ordered = 123;
			// *********************************************************************
			TbBrand tbBrand = new TbBrand();
			tbBrand.setStatus(status2);
			tbBrand.setCompanyName(companyName2);
			tbBrand.setBrandName(brandName2);
			tbBrand.setDescription(desciption);
			tbBrand.setOrdered(ordered);
			mapper.mybatisInsert(tbBrand);
			Integer id = tbBrand.getId();
			System.out.println(id);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void mybatisUpdate() {
		String resource = "mybatis-config.xml";
		try {
			InputStream resourceAsStream = Resources.getResourceAsStream(resource);
			SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
			SqlSession sqlSession = build.openSession(true);
			TbBrandMapper mapper = sqlSession.getMapper(TbBrandMapper.class);
			// *********************************************************************
			int id2 = 1;
			int status2 = 1;
			String companyName2 = "华为";
			String brandName2 = "华为";
			String desciption = "华为";
			int ordered = 123;
			// *********************************************************************
			TbBrand tbBrand = new TbBrand();
			tbBrand.setStatus(status2);
			tbBrand.setCompanyName(companyName2);
			tbBrand.setBrandName(brandName2);
			tbBrand.setDescription(desciption);
			tbBrand.setOrdered(ordered);
			tbBrand.setId(id2);
			int i = mapper.mybatisChange(tbBrand);
			System.out.println("被影响的行数为：" + i);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void mybatisUpdate2() {
		String resource = "mybatis-config.xml";
		try {
			InputStream resourceAsStream = Resources.getResourceAsStream(resource);
			SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
			SqlSession sqlSession = build.openSession(true);
			TbBrandMapper mapper = sqlSession.getMapper(TbBrandMapper.class);
			// *********************************************************************
			int id2 = 3;
			int status2 = 1;
			String companyName2 = "华为";
			String brandName2 = "华为";
			String desciption = "华为";
			int ordered = 123;
			// *********************************************************************
			TbBrand tbBrand = new TbBrand();
			tbBrand.setStatus(status2);
			tbBrand.setCompanyName(companyName2);
			tbBrand.setBrandName(brandName2);
			tbBrand.setDescription(desciption);
			tbBrand.setOrdered(ordered);
			tbBrand.setId(id2);
			int i = mapper.mybatisChange2(tbBrand);
			System.out.println("被影响的行数为：" + i);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
