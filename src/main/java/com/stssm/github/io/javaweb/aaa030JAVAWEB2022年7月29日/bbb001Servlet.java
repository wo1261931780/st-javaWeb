package com.stssm.github.io.javaweb.aaa030JAVAWEB2022年7月29日;

import com.alibaba.fastjson.JSON;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;

/**
 * Created by Intellij IDEA.
 * Project:brand-case
 * Package:$
 * {
 * PACKAGE_NAME
 * }
 * @WebServlet(name = "bbb001Servlet", value = "/bbb001Servlet")
 * 作为一个基础的servlet，主要功能是进行分发，这里需要配置通配符路径
 * @param
 * @author liujiajun_junw
 * @Date 2022-07-20-01  星期三
 * @description
 * @return
 * @exception
 */

@WebServlet("/brand/*")
public class bbb001Servlet extends bbb002Servlet {
	private final BrandService x = new BrandServiceImpl();

	/**
	 * 首先我们要确定，
	 * 这里的bbb002是继承http的类，在里面写好代码以后，因此拥有了分发的功能
	 * 然后我们让001去继承分发的类
	 * 这样才拥有了访问具体方法的功能
	 */
	public void selectAll(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("我是show1方法.................");
	}

	public void addAccount(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("我是添加方法.................");
	}

	public void delByIds(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		BufferedReader reader = req.getReader();
		String s = reader.readLine();
		int[] ints = JSON.parseObject(s, int[].class);
		boolean b = x.delByIds(ints);
		System.out.println("我是结果：" + b);
		resp.getWriter().write(String.valueOf(b));
	}

	public void selectGroupByPages(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String begin = req.getParameter("begin");
		String size = req.getParameter("size");
		int finalBegin = Integer.parseInt(begin);
		int finalSize = Integer.parseInt(size);
		PageBean<Brand> brandPageBean = x.selectByPage(finalBegin, finalSize);
		String s = JSON.toJSONString(brandPageBean);
		resp.setContentType("text/html;charset=utf-8");
		resp.getWriter().write(s);


	}
}
