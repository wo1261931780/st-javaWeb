package com.stssm.github.io.javaweb.aaa023JAVAWEB2022年7月20日;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.javaweb.aaa023JAVAWEB2022年7月20日
 *
 * @param
 * @author liujiajun_junw
 * @Date 2022-07-20-59  星期三
 * @description
 * @return
 * @exception
 */
public class aaa091 {
	// 一次请求的过程中，如果没有断开，多次请求资源的过程，还算是一次会话
	// 不管多少个请求和响应的过程，只要一个客户端和服务端在不断开的情况下，就算一次
	// 对服务器来说，识别每次的会话是否是同一个客户端发出的
	// 这就是会话跟踪的过程

	// ---------------------------------------------------------------
	// 对于一次用户登录的过程，在首页和账号详情之间的跳转，都算一次会话过程
	// 现在的服务器请求，往往使用http，也正是http无状态的特性，才导致我们需要在每次请求的过程中
	// 共享数据,从而区分不同的会话
	// ---------------------------------------------------------------

	// 客户端的cookie，就是把数据放到浏览器
	// 服务端的session，就是把数据放到服务器


}
