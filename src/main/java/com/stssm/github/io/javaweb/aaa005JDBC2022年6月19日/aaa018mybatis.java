package com.stssm.github.io.javaweb.aaa005JDBC2022年6月19日;

import com.stssm.github.io.javaweb.aaa005JDBC2022年6月19日.mapper.TbBrandMapper;
import com.stssm.github.io.javaweb.aaa005JDBC2022年6月19日.pojo.TbBrand;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.javaweb.aaa004JDBC2022年6月19日
 * User:  liujiajun_junw
 * Time:  2022-06-09-18  星期日
 */
public class aaa018mybatis {

	@Test
	public void show() {
		String resource = "mybatis-config.xml";
		try {
			InputStream resourceAsStream = Resources.getResourceAsStream(resource);
			SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
			SqlSession sqlSession = build.openSession();
			TbBrandMapper mapper = sqlSession.getMapper(TbBrandMapper.class);
			int status = 1;
			String companyName = "华为";
			String brandName = "华为";
			companyName = "%" + companyName + "%";
			brandName = "%" + brandName + "%";
			// 手动进行一次模糊查询
			// TbBrand tbBrand = mapper.selectById(id);
			List<TbBrand> tbBrands = mapper.queryTotal(status, companyName, brandName);
			System.out.println(tbBrands);
			sqlSession.close();

		} catch (IOException e) {
			System.out.println(e);
		}
	}

	@Test
	public void showObject() {
		String resource = "mybatis-config.xml";
		try {
			InputStream resourceAsStream = Resources.getResourceAsStream(resource);
			SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
			SqlSession sqlSession = build.openSession();
			TbBrandMapper mapper = sqlSession.getMapper(TbBrandMapper.class);
			// *********************************************************************
			int status = 1;
			String companyName = "华为";
			String brandName = "华为";
			companyName = "%" + companyName + "%";
			brandName = "%" + brandName + "%";
			// *********************************************************************
			TbBrand x = new TbBrand();
			x.setStatus(status);
			x.setCompanyName(companyName);
			x.setBrandName(brandName);
			List<TbBrand> tbBrands = mapper.queryTotal2(x);// 这里以一个对象为单位进行查询
			System.out.println(tbBrands);
			sqlSession.close();
		} catch (IOException e) {
			System.out.println(e);
		}
	}

	@Test
	public void showMap() {
		String resource = "mybatis-config.xml";
		try {
			InputStream resourceAsStream = Resources.getResourceAsStream(resource);
			SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
			SqlSession sqlSession = build.openSession();
			TbBrandMapper mapper = sqlSession.getMapper(TbBrandMapper.class);
			// *********************************************************************
			int status2 = 1;
			String companyName2 = "华为";
			String brandName2 = "华为";
			companyName2 = "%" + companyName2 + "%";
			brandName2 = "%" + brandName2 + "%";
			// *********************************************************************
			Map x = new HashMap();
			x.put("status", status2);
			// 这里给不同的名称，做了区分
			// status2就是前端传过来的变量，需要赋值的
			// status就是mapper中的变量
			x.put("companyName", companyName2);
			x.put("brandName", brandName2);
			List<TbBrand> tbBrands = mapper.queryTotal3(x);// 这里以一个对象为单位进行查询
			System.out.println(tbBrands);
			sqlSession.close();
		} catch (IOException e) {
			System.out.println(e);
		}
	}

	@Test
	public void showQueryByCondition() {
		String resource = "mybatis-config.xml";
		try {
			InputStream resourceAsStream = Resources.getResourceAsStream(resource);
			SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
			SqlSession sqlSession = build.openSession();
			TbBrandMapper mapper = sqlSession.getMapper(TbBrandMapper.class);
			// *********************************************************************
			int status2 = 1;
			String companyName2 = "华为";
			String brandName2 = "华为";
			companyName2 = "%" + companyName2 + "%";
			brandName2 = "%" + brandName2 + "%";
			// *********************************************************************
			TbBrand tbBrand = new TbBrand();
			tbBrand.setStatus(status2);
			tbBrand.setCompanyName(companyName2);
			tbBrand.setBrandName(brandName2);
			// *********************************************************************
			List<TbBrand> tbBrands = mapper.querySingleCondition(tbBrand);
			System.out.println(tbBrands);
			sqlSession.close();
		} catch (IOException e) {
			System.out.println(e);
		}
	}

}
