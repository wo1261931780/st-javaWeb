package com.stssm.github.io.javaweb.aaa018JAVAWEB2022年7月10日;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Intellij IDEA.
 * Project:show
 * Package:${PACKAGE_NAME}
 *
 * @param
 * @author liujiajun_junw
 * @Date 2022-07-10-31  星期日
 * @description
 * @return
 * @exception
 */

@WebServlet(name = "aaa072template", value = "/aaa072template")
public class aaa072template extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
// 乱码是因为，tomcat和web浏览器的编解码字符集不一样
		String userName = request.getParameter("account");
		System.out.println(userName);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");// 网页的编码默认是UTF-8
		// 这里我们将请求体的解析格式也设置为UTF-8就可以避免乱码
		// 但是这种方法在post中不会生效
		this.doGet(request, response);
	}
}
