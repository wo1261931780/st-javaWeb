package com.stssm.github.io.javaweb.aaa004JDBC2022年6月18日.mapper;

import com.stssm.github.io.javaweb.aaa004JDBC2022年6月18日.pojo.TbBrand;

import java.util.List;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.javaweb.aaa004JDBC2022年6月18日.mapper
 * User:  liujiajun_junw
 * Time:  2022-06-21-20  星期六
 */
public interface BrandMapper {
	List<TbBrand> showRes();

	TbBrand selectById(int id);


}
