package com.stssm.github.io.javaweb.aaa020JAVAWEB2022年7月12日;

import com.stssm.github.io.javaweb.aaa019JAVAWEB2022年7月11日.pojo.user;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

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
public interface aaa089loginMapper {
	/**
	 * 生成查询结果
	 *
	 * @param id
	 * @param paw
	 * @return
	 */
	@Select("select * from study002jdbc.account where id=#{id} and password=#{paw}")
	user login(@Param("id") String id, @Param("paw") String paw);

	/**
	 * 账号登录
	 *
	 * @param account
	 * @return
	 */
	@Select("select * from study002jdbc.account where id=#{account}")
	user queryByUserName(@Param("account") String account);

	/**
	 * 注册账号
	 *
	 * @param user
	 */
	@Insert("insert into study002jdbc.account values (#{account},#{paw})")
	void insert(user user);
}
