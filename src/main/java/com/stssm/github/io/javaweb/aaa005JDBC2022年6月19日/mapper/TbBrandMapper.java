package com.stssm.github.io.javaweb.aaa005JDBC2022年6月19日.mapper;

import com.stssm.github.io.javaweb.aaa005JDBC2022年6月19日.pojo.TbBrand;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.mapper
 * User:  liujiajun_junw
 * Time:  2022-06-09-27  星期日
 *
 * @author liujiajun_junw
 */
public interface TbBrandMapper {

	TbBrand selectById(int id);

	TbBrand selectByDy(int id);

	// List<TbBrand> queryTotal();
	// 上面这些好像不能直接使用方法重载，如果使用了，会导致第一个被加载，后面的没有

	/**
	 * 注意一下，这里的param对应的是SQL中的参数占位符名称
	 * 比如companyName对应的是#{companyName}
	 * 而后面的String companyName，对应的是java中的变量名
	 *
	 * @param status
	 */
	List<TbBrand> queryTotal(@Param("status") int status, @Param("companyName") String companyName, @Param("brandName") String brandName);

	List<TbBrand> queryTotal2(TbBrand tbBrand);

	List<TbBrand> queryTotal3(Map map);

	List<TbBrand> queryTotal4(Map map);

	List<TbBrand> queryTotal5(Map map);

	List<TbBrand> queryTotal6(Map map);

	List<TbBrand> querySingleCondition(TbBrand tbBrand);

	void mybatisInsert(TbBrand tbBrand);

	void mybatisInsert2(TbBrand tbBrand);

	int mybatisChange(TbBrand tbBrand);

	int mybatisChange2(TbBrand tbBrand);

	void selectAnnotate(int i);
}
