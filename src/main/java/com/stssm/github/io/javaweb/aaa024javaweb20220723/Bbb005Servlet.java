package com.stssm.github.io.javaweb.aaa024javaweb20220723; /**
 * Created by Intellij IDEA.
 * Project:ajax-demo
 * Package:${PACKAGE_NAME}
 *
 * @author liujiajun_junw
 * @Date 2022-07-21-55  星期六
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
import java.io.IOException;

import static com.stssm.github.io.javaweb.aaa002jdbc20220531.Aaa001Demo.LOG_SHOW;

@WebServlet(name = "Bbb005Servlet", value = "/Bbb005Servlet")
public class Bbb005Servlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");

		LOG_SHOW.debug("测试页面");
		String name = request.getParameter("name");
		LOG_SHOW.debug(name);
		response.getWriter().write("我是axios");




	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doGet(request, response);
	}
}
