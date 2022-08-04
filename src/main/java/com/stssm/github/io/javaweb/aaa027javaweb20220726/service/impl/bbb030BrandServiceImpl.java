/*
 * Author: liujiajun 45444154+wo1261931780@users.noreply.github.com
 * Date: 2022-07-26 20:22:43
 * LastEditors: liujiajun 45444154+wo1261931780@users.noreply.github.com
 * LastEditTime: 2022-07-26 21:43:21
 * FilePath: \brand-case\src\main\java\com\itheima\service\impl\bbb030BrandServiceImpl.java
 * Description: 1111
 *
 * Copyright (c) 2022 by liujiajun 45444154+wo1261931780@users.noreply.github.com, All Rights Reserved.
 */
package com.stssm.github.io.javaweb.aaa027javaweb20220726.service.impl;

import com.stssm.github.io.javaweb.aaa027javaweb20220726.mapper.bbb028brandMapper;
import com.stssm.github.io.javaweb.aaa027javaweb20220726.pojo.bbb029TbBrand;
import com.stssm.github.io.javaweb.aaa027javaweb20220726.service.bbb031brandService;
import com.stssm.github.io.javaweb.aaa027javaweb20220726.util.SqlSessionFactoryUtils;
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
public class bbb030BrandServiceImpl implements bbb031brandService {

	SqlSessionFactory x = SqlSessionFactoryUtils.getSqlSessionFactory();

	/**
	 * 查询所有数据
	 *
	 * @return
	 */
	@Override
	public List<bbb029TbBrand> selectAll() {
		SqlSession sqlSession = x.openSession();
		bbb028brandMapper mapper = sqlSession.getMapper(bbb028brandMapper.class);
		List<bbb029TbBrand> bbb029TbBrands = mapper.selectAll();
		sqlSession.close();

		return bbb029TbBrands;
	}

	@Override
	public bbb029TbBrand addBrand(bbb029TbBrand brand) {
		// TODO Auto-generated method stub
		// 测试结果

		return null;
	}
}
