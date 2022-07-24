package com.stssm.github.io.javaweb.aaa023JAVAWEB2022年7月20日; /**
 * Created by Intellij IDEA.
 * Project:cookie-demo
 * Package:${PACKAGE_NAME}
 *
 * @author liujiajun_junw
 * @Date 2022-07-20-35  星期四
 * @description
 * @param
 * @return
 * @exception
 */

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "aaa102Servlet", value = "/aaa102Servlet")
public class aaa102Servlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		// 这里和91不一样，这里是获取的过程，没有添加之前的cookie
		Cookie[] cookies = request.getCookies();
		for (Cookie cookie : cookies) {
			System.out.println(cookie.getName());
			System.out.println(cookie.getValue());
		}
		// 我们的cookie实际上都是保存在浏览器的内存中
		// 但是会带来问题
		// 用户每次关闭浏览器的时候，cookie都会被销毁，从而导致每次都需要重新登陆
		// 这个时候，我们就需要让cookie的存在时间更长，专业的名词：cookie的持久化


	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doGet(request, response);
	}
}
