package com.stssm.github.io.javaweb.aaa007jdbc20220619;

import com.stssm.github.io.javaweb.aaa007jdbc20220619.mapper.TbBrandMapper0619;
import com.stssm.github.io.javaweb.aaa007jdbc20220619.pojo.TbBrand0619;
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

import static com.stssm.github.io.javaweb.aaa002jdbc20220531.Aaa001Demo.LOG_SHOW;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.javaweb.aaa004JDBC2022年6月19日
 * Bbb010User:  liujiajun_junw
 * @author liujiajun_junw
 * Time:  2022-06-09-18  星期日
 */
public class Aaa022mybatisTest {

	@Test
	public void show() {
		String resource = "mybatis-config.xml";
		try {
			InputStream resourceAsStream = Resources.getResourceAsStream(resource);
			SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
			SqlSession sqlSession = build.openSession();
			TbBrandMapper0619 mapper = sqlSession.getMapper(TbBrandMapper0619.class);
			int status = 1;
			String companyName = "华为";
			String brandName = "华为";
			companyName = "%" + companyName + "%";
			brandName = "%" + brandName + "%";
			// 手动进行一次模糊查询
			// Bbb029TbBrand tbBrand = mapper.selectById(id);
			List<TbBrand0619> tbBrand0619s = mapper.queryTotal(status, companyName, brandName);
			LOG_SHOW.debug(tbBrand0619s);
			sqlSession.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void showObject() {
		String resource = "mybatis-config.xml";
		try {
			InputStream resourceAsStream = Resources.getResourceAsStream(resource);
			SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
			SqlSession sqlSession = build.openSession();
			TbBrandMapper0619 mapper = sqlSession.getMapper(TbBrandMapper0619.class);
			// *********************************************************************
			int status = 1;
			String companyName = "华为";
			String brandName = "华为";
			companyName = "%" + companyName + "%";
			brandName = "%" + brandName + "%";
			// *********************************************************************
			TbBrand0619 x = new TbBrand0619();
			x.setStatus(status);
			x.setCompanyName(companyName);
			x.setBrandName(brandName);
			List<TbBrand0619> tbBrand0619s = mapper.queryTotal2(x);// 这里以一个对象为单位进行查询
			LOG_SHOW.debug(tbBrand0619s);
			sqlSession.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void showMap() {
		String resource = "mybatis-config.xml";
		try {
			InputStream resourceAsStream = Resources.getResourceAsStream(resource);
			SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
			SqlSession sqlSession = build.openSession();
			TbBrandMapper0619 mapper = sqlSession.getMapper(TbBrandMapper0619.class);
			// *********************************************************************
			int status2 = 1;
			String companyName2 = "华为";
			String brandName2 = "华为";
			companyName2 = "%" + companyName2 + "%";
			brandName2 = "%" + brandName2 + "%";
			// *********************************************************************
			Map<String, java.io.Serializable> x = new HashMap<>(3);
			x.put("status", status2);
			// 这里给不同的名称，做了区分
			// status2就是前端传过来的变量，需要赋值的
			// status就是mapper中的变量
			x.put("companyName", companyName2);
			x.put("brandName", brandName2);
			List<TbBrand0619> tbBrand0619s = mapper.queryTotal3(x);// 这里以一个对象为单位进行查询
			LOG_SHOW.debug(tbBrand0619s);
			sqlSession.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void showQueryByCondition() {
		String resource = "mybatis-config.xml";
		try {
			InputStream resourceAsStream = Resources.getResourceAsStream(resource);
			SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
			SqlSession sqlSession = build.openSession();
			TbBrandMapper0619 mapper = sqlSession.getMapper(TbBrandMapper0619.class);
			// *********************************************************************
			int status2 = 1;
			String companyName2 = "华为";
			String brandName2 = "华为";
			companyName2 = "%" + companyName2 + "%";
			brandName2 = "%" + brandName2 + "%";
			// *********************************************************************
			TbBrand0619 tbBrand0619 = new TbBrand0619();
			tbBrand0619.setStatus(status2);
			tbBrand0619.setCompanyName(companyName2);
			tbBrand0619.setBrandName(brandName2);
			// *********************************************************************
			List<TbBrand0619> tbBrand0619s = mapper.querySingleCondition(tbBrand0619);
			LOG_SHOW.debug(tbBrand0619s);
			sqlSession.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
