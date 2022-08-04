package com.stssm.github.io.javaweb.aaa025javaweb20220724;

import com.alibaba.fastjson.JSON;

/**
 * Created by Intellij IDEA.
 * Project:ajax-demo
 * Package:com.itheima.web.servlet
 *
 * @param
 * @author liujiajun_junw
 * @Date 2022-07-10-58 星期日
 * @description
 * @return
 * @exception
 */
public class bbb012 {
	public static void main(String[] args) {
		// json和js的格式类似
		// 但是json的键值对，必须使用大括号来表示
		// 我们在客户端和服务器，中间是使用json来传递数据，
		// 在服务端，需要对json进行解析，然后将其变成一个java对象进行后续的数据操作
		// 同理，服务器对数据的响应，需要将java对象封为一个json格式的字符数据
		// 这里直接使用开源的json格式化工具
		bbb015brandPojo brandTest = new bbb015brandPojo();
		brandTest.setAge(11);
		brandTest.setAddress("1111111");
		brandTest.setName("22222222222");
		String s = JSON.toJSONString(brandTest);
		System.out.println(s);// {"address":"1111111","age":11,"name":"22222222222"}
		bbb015brandPojo bbb015brandPojo = JSON.parseObject("{\"address\":\"1111111\",\"age\":11,\"name\":\"22222222222\"}",
				bbb015brandPojo.class);
		System.out.println(bbb015brandPojo);// bbb015brandPojo{name='22222222222', age=11, address='1111111'}
		System.out.println("我是对象内部的属性：" + bbb015brandPojo.getName());// 我是对象内部的属性：22222222222

	}
}
