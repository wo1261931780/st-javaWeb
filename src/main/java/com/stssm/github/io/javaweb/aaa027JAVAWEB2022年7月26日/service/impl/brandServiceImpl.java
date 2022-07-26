/*
 * Author: liujiajun 45444154+wo1261931780@users.noreply.github.com
 * Date: 2022-07-26 20:22:43
 * LastEditors: liujiajun 45444154+wo1261931780@users.noreply.github.com
 * LastEditTime: 2022-07-26 21:43:21
 * FilePath: \brand-case\src\main\java\com\itheima\service\impl\brandServiceImpl.java
 * Description: 1111
 *
 * Copyright (c) 2022 by liujiajun 45444154+wo1261931780@users.noreply.github.com, All Rights Reserved.
 */
package com.stssm.github.io.javaweb.aaa027JAVAWEB2022年7月26日.service.impl;

import com.itheima.mapper.brandMapper;
import com.itheima.pojo.TbBrand;
import com.itheima.service.brandService;
import com.itheima.util.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

/**
 * Created by Intellij IDEA.
 * Project:brand-case
 * Package:com.itheima.service.impl
 *
 * @param
 * @author liujiajun_junw
 * @Date 2022-07-20-22 星期二
 * @description
 * @return
 * @exception
 */
public class brandServiceImpl implements brandService {

	SqlSessionFactory x = SqlSessionFactoryUtils.getSqlSessionFactory();

	/**
	 * 查询所有数据
	 *
	 * @return
	 */
	@Override
	public List<TbBrand> selectAll() {
		SqlSession sqlSession = x.openSession();
		brandMapper mapper = sqlSession.getMapper(brandMapper.class);
		List<TbBrand> tbBrands = mapper.selectAll();
		sqlSession.close();

		return tbBrands;
	}

	@Override
	public TbBrand addBrand(TbBrand brand) {
		// TODO Auto-generated method stub
		// 测试结果

		return null;
	}
}
