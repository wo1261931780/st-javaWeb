package com.stssm.github.io.javaweb.aaa027JAVAWEB2022年7月26日.web.servlet; /**
 * Created by Intellij IDEA.
 * Project:brand-case
 * Package:${PACKAGE_NAME}
 *
 * @author liujiajun_junw
 * @Date 2022-07-20-23  星期二
 * @description
 * @param
 * @return
 * @exception
 */

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

@WebServlet(name = "bbb032brandServlet", value = "/bbb032brandServlet")
public class bbb032brandServlet extends HttpServlet {
	private final bbb031brandService demoService = new bbb030BrandServiceImpl();
	// 我直接新建一个实现类，这样可以降低耦合性
	// 在实现类的逻辑和方法发生变化的时候
	// servlet中的代码不需要大量修改，提高开发的效率


	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		List<bbb029TbBrand> bbb029TbBrands = demoService.selectAll();
		// bbb029TbBrands
		String resultString = JSON.toJSONString(bbb029TbBrands);
		response.setContentType("text/html;charset=utf-8");
		response.getWriter().write(resultString);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doGet(request, response);
	}
}
