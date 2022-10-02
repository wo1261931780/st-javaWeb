package com.stssm.github.io.javaweb.aaa018javaweb20220710;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static com.stssm.github.io.javaweb.aaa002jdbc20220531.Aaa001Demo.LOG_SHOW;

/**
 * Created by Intellij IDEA.
 * Project:show
 * Package:${PACKAGE_NAME}
 *
 * @author liujiajun_junw
 * @Date 2022-07-13-32  星期日
 * @description
 * @param
 * @return
 * @exception
 */

@WebServlet(name = "Aaa076Forward", value = "/Aaa076Forward")
public class Aaa076Forward extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// request.setCharacterEncoding("UTF-8");
		LOG_SHOW.debug("开始转发");
		// request.getRequestDispatcher("/Aaa077Forward").forward(request, response);
		// 直接设置要转发的目的地就可以
		// 一般是在第一个资源中处理一部分的数据，然后将其转发给第二个资源，继续完成处理的过程
		// request是可以存储数据的，因此我们也可以将其成为域对象
		// ---------------------------------------------------------------------
		request.setAttribute("key", "value");
		// 实际上，这里都是对请求体进行操作
		// 相当于把key:value直接扔进去了
		// 换句话来说，我们现在已经在操作网页的数据交互部分了
		// 这里还有一个坑，
		// 必须要先设置好数据，再执行转发，否则拿不到东西
		request.getRequestDispatcher("/Aaa077Forward").forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doGet(request, response);
	}
}
