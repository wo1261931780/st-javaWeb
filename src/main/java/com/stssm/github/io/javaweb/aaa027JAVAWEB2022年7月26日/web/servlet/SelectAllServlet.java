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
import java.io.IOException;
import java.util.List;

@WebServlet("/selectAllServlet")
public class SelectAllServlet extends HttpServlet {

	private final brandService brandService = new brandServiceImpl();

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1. 调用service查询
		List<TbBrand> brands = brandService.selectAll();

		// 2. 转为JSON
		String jsonString = JSON.toJSONString(brands);

		// 3. 写数据
		response.setContentType("text/json;charset=utf-8");
		response.getWriter().write(jsonString);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doGet(request, response);
	}
}
