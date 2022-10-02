package com.stssm.github.io.javaweb.aaa017javaweb20220709;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static com.stssm.github.io.javaweb.aaa002jdbc20220531.Aaa001Demo.LOG_SHOW;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:aaa017JDBC2022年7月9日
 *
 * @param
 * @author liujiajun_junw
 * @Date 2022-07-11-42  星期六
 * @description
 * @return
 * @exception
 */
@WebServlet("/showdemo2")
public class Aaa063Servlet2 extends HttpServlet {

	/**
	 * @param req
	 * @param resp
	 * @throws ServletException
	 * @throws IOException
	 */
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// super.doGet(req, resp);
		LOG_SHOW.debug("do...get");
		// 我们通过浏览器直接修改后缀，就是在做get请求
		// 打印这里的get语句
	}
	// 对get和post进行分发，主要是因为二者的请求体所在位置不同
	// 如果在servlet的实现类中，对应的service，对requisite和response的处理逻辑也不同

	/**
	 * @param req
	 * @param resp
	 * @throws ServletException
	 * @throws IOException
	 */
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// super.doPost(req, resp);
		LOG_SHOW.debug("do...post");
	}
}
