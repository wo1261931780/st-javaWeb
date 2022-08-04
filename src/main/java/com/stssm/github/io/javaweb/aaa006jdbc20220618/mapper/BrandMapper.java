package com.stssm.github.io.javaweb.aaa006jdbc20220618.mapper;

import com.stssm.github.io.javaweb.aaa006jdbc20220618.pojo.TbBrand;

import java.util.List;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.javaweb.aaa004JDBC2022年6月18日.mapper
 * bbb010User: liujiajun_junw
 * Time: 2022-06-21-20  星期六
 *
 * @author liujiajun_junw
 */
public interface BrandMapper {
	/**
	 * 展示结果
	 *
	 * @return
	 */
	List<TbBrand> showRes();

	/**
	 * 登录功能
	 *
	 * @param id
	 * @return
	 */
	TbBrand selectById(int id);


}
