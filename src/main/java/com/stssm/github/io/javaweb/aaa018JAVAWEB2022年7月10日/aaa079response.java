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
 * Package:demo
 *
 * @param
 * @author liujiajun_junw
 * @Date 2022-07-21-19  星期日
 * @description
 * @return
 * @exception
 */
@WebServlet("/aaa079response")
public class aaa079response extends HttpServlet {
	/**
	 * @param req
	 * @param resp
	 * @throws ServletException
	 * @throws IOException
	 */
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// super.doGet(req, resp);
		System.out.println("我被重定向了");
	}

	/**
	 * @param req
	 * @param resp
	 * @throws ServletException
	 * @throws IOException
	 */
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// super.doPost(req, resp);
		this.doGet(req, resp);
	}
}
