package com.stssm.github.io.javaweb.aaa018JAVAWEB2022年7月11日.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import pojo.user;

/**
 * Created by Intellij IDEA.
 * Project:show
 * Package:mapper
 *
 * @param
 * @author liujiajun_junw
 * @Date 2022-07-22-02  星期一
 * @description
 * @return
 * @exception
 */
public interface loginMapper {
	/*
	 * 生成查询结果
	 * @param id
	 * @param paw
	 * @return
	 * */
	@Select("select *from study002jdbc.account where id=#{id} and password=#{paw}")
	user login(@Param("id") String id, @Param("paw") String paw);
}
