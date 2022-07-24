package com.stssm.github.io.javaweb.aaa025JAVAWEB2022年7月24日;

import com.alibaba.fastjson.JSON;

/**
 * Created by Intellij IDEA.
 * Project:ajax-demo
 * Package:com.itheima.web.servlet
 *
 * @param
 * @author liujiajun_junw
 * @Date 2022-07-10-58  星期日
 * @description
 * @return
 * @exception
 */
public class bbb003 {
	public static void main(String[] args) {
		brandPojo brandTest = new brandPojo();
		brandTest.setAge(11);
		brandTest.setAddress("1111111");
		brandTest.setName("22222222222");
		String s = JSON.toJSONString(brandTest);
		System.out.println(s);// {"address":"1111111","age":11,"name":"22222222222"}
		brandPojo brandPojo = JSON.parseObject("{\"address\":\"1111111\",\"age\":11,\"name\":\"22222222222\"}", brandPojo.class);
		System.out.println(brandPojo);// brandPojo{name='22222222222', age=11, address='1111111'}
		System.out.println("我是对象内部的属性：" + brandPojo.getName());// 我是对象内部的属性：22222222222

	}
}
