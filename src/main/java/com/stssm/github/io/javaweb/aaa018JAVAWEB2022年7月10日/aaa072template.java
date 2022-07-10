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
		// 浏览器会将中文转换为16进制的编码格式，然后交给tomcat解析
		// 因为二者的字符集不同，进而导致tomcat解析异常，出现乱码
		// ---------------------------------------------------------------------
		// 两个中文，按照UTF-8，每个中文占3个字节，换算得到6个字节
		// 再换算得到48个二进制的数字
		// 每四个字节，按照16进制转换，加上百分号，就得到一个16进制的数
		// 我们在使用get请求的时候，也是发送url编码后的数据

		String userName = request.getParameter("account");
		System.out.println(userName);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");//网页的编码默认是UTF-8
		// 这里我们将请求体的解析格式也设置为UTF-8就可以避免乱码
		// 但是这种方法在post中不会生效
		this.doGet(request, response);
	}
}
