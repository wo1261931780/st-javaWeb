package com.stssm.github.io.javaweb.aaa025javaweb20220724;

import com.alibaba.fastjson.JSON;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by Intellij IDEA.
 * Project:ajax-demo
 * Package:${PACKAGE_NAME}
 *
 * @param
 * @author liujiajun_junw
 * @Date 2022-07-11-11  星期日
 * @description
 * @return
 * @exception
 */


@WebServlet(name = "bbb014Servlet", value = "/bbb014Servlet")
public class bbb014Servlet extends HttpServlet {

	private final bbb013service result = new bbb013service();

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		List<bbb015brandPojo> bbb015brandPojos = result.selectAll();
		// 将java对象转化为json字符串，成为序列化
		// 将字符串转换为java对象，反序列化
		String s = JSON.toJSONString(bbb015brandPojos);
		System.out.println("我是结果：" + s);
		response.setContentType("text/json;charset=utf-8");
		response.getWriter().write(s);
		request.getParameter("name");// 这里是不能直接拿到json数据的


	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doGet(request, response);
	}
}
