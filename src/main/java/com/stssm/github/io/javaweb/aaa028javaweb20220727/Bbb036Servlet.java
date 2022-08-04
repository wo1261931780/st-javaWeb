package com.stssm.github.io.javaweb.aaa028javaweb20220727;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Intellij IDEA.
 * Project:brand-case
 * Package:$
 * {
 * PACKAGE_NAME
 * }
 * @WebServlet(name = "Bbb036Servlet", value = "/Bbb036Servlet")
 * 作为一个基础的servlet，主要功能是进行分发，这里需要配置通配符路径
 * @param
 * @author liujiajun_junw
 * @Date 2022-07-20-01  星期三
 * @description
 * @return
 * @exception
 */

@WebServlet("/brand/*")
public class Bbb036Servlet extends Bbb037Servlet {
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

}
