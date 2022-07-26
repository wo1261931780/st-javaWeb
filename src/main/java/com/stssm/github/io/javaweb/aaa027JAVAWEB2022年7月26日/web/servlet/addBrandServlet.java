/*
 * Author: liujiajun 45444154+wo1261931780@users.noreply.github.com
 * Date: 2022-07-26 21:45:08
 * LastEditors: liujiajun 45444154+wo1261931780@users.noreply.github.com
 * LastEditTime: 2022-07-26 21:46:15
 * FilePath: \brand-case\src\main\java\com\itheima\web\servlet\addBrandServlet.java
 * Description: 1111
 *
 * Copyright (c 022 by liujiaju 454414+wo1261931780@u

 */
package com.stssm.github.io.javaweb.aaa027JAVAWEB2022年7月26日.web.servlet;

import com.alibaba.fastjson.JSON;
import com.itheima.pojo.TbBrand;
import com.itheima.service.brandService;
import com.itheima.service.impl.brandServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;

@WebServlet(name = "brandServlet", value = "/brandServlet")
public class addBrandServlet extends HttpServlet {
	private final brandService demoService = new brandServiceImpl();
	// 我直接新建一个实现类，这样可以降低耦合性
	// 在实现类的逻辑和方法发生变化的时候
	// servlet中的代码不需要大量修改，提高开发的效率

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		BufferedReader br = request.getReader();
		String demo = br.readLine();
		TbBrand xxBrand = JSON.parseObject(demo, TbBrand.class);
		demoService.addBrand(xxBrand);
		response.getWriter().write(demo);

	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doGet(request, response);
	}
}
