package com.stssm.github.io.javaweb.aaa027JAVAWEB2022年7月26日.service;

import com.itheima.pojo.TbBrand;

import java.util.List;

/**
 * Created by Intellij IDEA.
 * Project:brand-case
 * Package:com.itheima.service
 *
 * @param
 * @author liujiajun_junw
 * @Date 2022-07-20-19 星期二
 * @description
 * @return
 * @exception
 */
public interface brandService {

	/**
	 * 查询所有数据
	 *
	 * @return
	 */
	List<TbBrand> selectAll();

	/**
	 * 添加品牌
	 *
	 * @param brand
	 * @return
	 */
	TbBrand addBrand(TbBrand brand);
}
