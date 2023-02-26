package com.stssm.github.io.javaweb.aaa023javaweb20220720; /**
 * Created by Intellij IDEA.
 * Project:cookie-demo
 * Package:${PACKAGE_NAME}
 *
 * @author liujiajun_junw
 * @Date 2022-07-21-00  星期四
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

@WebServlet(name = "Aaa104Servlet", value = "/Aaa104Servlet")
public class Aaa104Servlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		HttpSession session = request.getSession();
		session.setAttribute("name", "paw");
		// 这里还是使用键值对的形式去存取数据
		// 但是paw，可以是一个object
		// 从这个角度来说，session的数据量明显就比cooklie要大，适用的场景也更多
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doGet(request, response);
	}
}
