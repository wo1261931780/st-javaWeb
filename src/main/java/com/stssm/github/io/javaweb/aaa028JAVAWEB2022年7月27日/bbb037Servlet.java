package com.stssm.github.io.javaweb.aaa028JAVAWEB2022年7月27日;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by Intellij IDEA.
 * Project:brand-case
 * Package:$
 * {
 * PACKAGE_NAME
 * }
 * @WebServlet(name = "bbb037Servlet", value = "/bbb037Servlet")
 * 因为我之前配置过一个分发的servlet
 * 所有的servlet都会从这个分发的路径走过去
 * 所以这里才不需要配置
 * @param
 * @author liujiajun_junw
 * @Date 2022-07-20-14  星期三
 * @description
 * @return
 * @exception
 */
public class bbb037Servlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// super.service(req, resp);
		String requestUri = req.getRequestURI();
		System.out.println("我是全部路径：" + requestUri);// 我是全部路径：/brand-case/brand/demo
		// 这里的路径就是对应的方法名称
		int index = requestUri.lastIndexOf("/");
		String substring = requestUri.substring(index + 1);
		System.out.println("我是当前资源访问路径：" + substring);// 我是当前资源访问路径：/demo
		System.out.println(this);// com.itheima.web.servlet.bbb036Servlet@1976025b
		// 谁在访问这个分发的文件，那么就是谁作为对象，参与下面的调用过程
		Class<? extends bbb037Servlet> aClass = this.getClass();
		try {
			Method method = aClass.getMethod(substring, HttpServletRequest.class, HttpServletResponse.class);
			// method.invoke(req, resp);
			method.invoke(this, req, resp);
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// throw new RuntimeException(e);
			e.printStackTrace();
		}

	}
}
