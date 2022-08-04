package com.stssm.github.io.javaweb.aaa024JAVAWEB2022年7月23日;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @author liujiajun_junw
 */

@WebServlet("/registerServlet")
public class bbb009RegisterServlet extends HttpServlet {
	private final bbb011UserService service = new bbb011UserService();

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1. 获取用户名和密码数据
		String username = request.getParameter("username");
		String password = request.getParameter("password");

		// bbb010User user = new bbb010User();
		// user.setUsername(username);
		// user.setPassword(password);

		// 获取用户输入的验证码
		String checkCode = request.getParameter("checkCode");

		// 程序生成的验证码，从Session获取
		HttpSession session = request.getSession();
		String checkCodeGen = (String) session.getAttribute("checkCodeGen");

		// 比对
		if (!checkCodeGen.equalsIgnoreCase(checkCode)) {

			request.setAttribute("register_msg", "验证码错误");
			request.getRequestDispatcher("/bbb008register.jsp").forward(request, response);

			// 不允许注册
			return;
		}


		// 2. 调用service 注册
		// boolean flag = service.register(user);
		boolean flag = true;
		// 3. 判断注册成功与否
		if (flag) {
			// 注册功能，跳转登陆页面

			request.setAttribute("register_msg", "注册成功，请登录");
			request.getRequestDispatcher("/login.jsp").forward(request, response);
		} else {
			// 注册失败，跳转到注册页面

			request.setAttribute("register_msg", "用户名已存在");
			request.getRequestDispatcher("/bbb008register.jsp").forward(request, response);
		}


	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doGet(request, response);
	}
}
