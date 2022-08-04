package com.stssm.github.io.javaweb.aaa027JAVAWEB2022年7月26日.web.servlet;

import com.alibaba.fastjson.JSON;
import com.stssm.github.io.javaweb.aaa027JAVAWEB2022年7月26日.pojo.bbb029TbBrand;
import com.stssm.github.io.javaweb.aaa027JAVAWEB2022年7月26日.service.bbb031brandService;
import com.stssm.github.io.javaweb.aaa027JAVAWEB2022年7月26日.service.impl.bbb030BrandServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/selectAllServlet")
/**
 * @author liujiajun_junw
 */
public class bbb034SelectAllServlet extends HttpServlet {

	private final bbb031brandService bbb031brandService = new bbb030BrandServiceImpl();

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1. 调用service查询
		List<bbb029TbBrand> brands = bbb031brandService.selectAll();

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
