package com.stssm.github.io.javaweb.aaa006jdbc20220618.mapper;

import com.stssm.github.io.javaweb.aaa006jdbc20220618.pojo.DemoPojo0618;

import java.util.List;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.javaweb.aaa004JDBC2022年6月18日.mapper
 * Bbb010User:  liujiajun_junw
 *
 * @author liujiajun_junw
 * Time:  2022-06-15-02  星期六
 */
public interface DemoMapper0618 {
	// DemoPojo0618 selectAll();

	/**
	 * 查询所有的记过
	 *
	 * @return 返回demoPojo集合
	 */
	List<DemoPojo0618> selectAll();// 这里可以根据需要自定义返回的类型
	// 不过，设置了不同的返回类型，那么也就接收了不同的SQL对象

	// 这里，整体的逻辑是：
	// 我从mapper中调用方法，然后方法去xml中执行对应的SQL
	// SQL执行完毕，在数据库中查询到对应的结果
	// 然后结果作为一个list返回

}
