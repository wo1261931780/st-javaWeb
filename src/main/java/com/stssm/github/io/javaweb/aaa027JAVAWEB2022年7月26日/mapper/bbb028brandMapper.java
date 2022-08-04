package com.stssm.github.io.javaweb.aaa027JAVAWEB2022年7月26日.mapper;

import com.stssm.github.io.javaweb.aaa027JAVAWEB2022年7月26日.pojo.bbb029TbBrand;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by Intellij IDEA.
 * Project:brand-case
 * Package:com.itheima.mapper
 *
 * @param
 * @author liujiajun_junw
 * @Date 2022-07-20-10 星期二
 * @description
 * @return
 * @exception
 */
public interface bbb028brandMapper {

	/**
	 * 选择所有
	 *
	 * @return 测试
	 */
	@Select("select * from study002jdbc.tb_brand")
	@ResultMap("brandResultMap")
	List<bbb029TbBrand> selectAll();


	/**
	 * 为了解决字段映射的问题，这里使用注解来方便我们处理
	 * 注意注解的名称和xml中的名称需要对应
	 */
	/**
	 * 新增品牌
	 *
	 * @param brand
	 * @return 返回布尔
	 */
	bbb029TbBrand addBrand(bbb029TbBrand brand);
}
