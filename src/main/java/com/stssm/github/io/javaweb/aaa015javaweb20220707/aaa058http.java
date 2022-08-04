package com.stssm.github.io.javaweb.aaa015javaweb20220707;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.javaweb.aaa015JDBC2022年7月7日
 *
 * @param
 * @author liujiajun_junw
 * @Date 2022-07-22-19  星期四
 * @description
 * @return
 * @exception
 */
public class aaa058http {
	public static void main(String[] args) {
		System.out.println("我是http协议");
		// 在我们网页端，可以直接切换http的请求，看到具体的请求体和请求头
		// 请求头就是key和value的格式
		// 比如host:www.baidu.com
		// 这里host就是key，value就是百度的网址
		// -----------------------------------------------------
		// 如果是post
		// 在请求头之后，有一个空行
		// 空行下面存放的就是请求体的内容
		// 一般就是我们要传递的数据
		// -----------------------------------------------------
		// 注意一下get和post的区别：
		// get一般直接放在/HTTP/1.1后面，
		// 类似于：/HTTP/1.1 xxx
		// 但是post就是独立出来一个请求体
		// 把我们需要的数据都放到请求体中
		// -----------------------------------------------------
		// 还有一个老生常谈的区别：get有长度限制，post没有长度限制

	}
}
