package com.stssm.github.io.javaweb.aaa023JAVAWEB2022年7月20日; /**
 * Created by Intellij IDEA.
 * Project:cookie-demo
 * Package:${PACKAGE_NAME}
 *
 * @author liujiajun_junw
 * @Date 2022-07-21-23  星期四
 * @description
 * @param
 * @return
 * @exception
 */

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "aaa096Servlet", value = "/aaa096Servlet")
public class aaa096Servlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		// session的原理，底层是基于cookie实现的
		// 在我们一个客户端的不同请求过程中，每次都需要识别session是否是同一个
		// session内部有一个id存在
		// tomcat会将session的id，作为cookie发送给浏览器
		// 在浏览器存入对应的id以后，第二次发送请求，会将这个cookie一起发送过来
		// 服务端根据cookie来寻找内存中是否存在对应的session
		// -----------------------------------------------
		// session有个问题，保存服务器的内存中，
		// 如果服务器（异常）重启了，那么内存中的session会消失
		HttpSession session = request.getSession();
		session.invalidate();// 手动销毁session对象
		// 手动销毁，一般是在注销登录的时候使用
		// -----------------------------------------------
		// 如果手动关闭了浏览器，那么session也会消失
		// 因为session对应的id是用cookie的形式保存的，关闭浏览器会导致cookie消失，从而导致session无法被识别
		// 验证码使用session保存
		// cookie是保证用户在没有登录的情况下，做身份识别


	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doGet(request, response);
	}
}
