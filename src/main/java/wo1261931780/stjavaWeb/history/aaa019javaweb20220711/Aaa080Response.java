package com.stssm.github.io.javaweb.aaa019javaweb20220711;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Intellij IDEA.
 * Project:show
 * Package:User
 *
 * @param
 * @author liujiajun_junw
 * @Date 2022-07-22-04  星期日
 * @description
 * @return
 * @exception
 */
@WebServlet("/Aaa080Response")
public class Aaa080Response extends HttpServlet {

	/**
	 * @param req
	 * @param resp
	 * @throws ServletException
	 * @throws IOException
	 */
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// super.doGet(req, resp);
		resp.setContentType("text/hytml;charset=utf-8");// 设置响应格式和字符集
		PrintWriter writer = resp.getWriter();// 这里应该是获取了一个对象，因为对象才能执行方法
		writer.write("aaa");
		writer.write("<h1>123</h1>");// 直接写数据，浏览器只会当成文本去解析
		resp.setHeader("content-type", "text/html");// 如果不在里面设置一个头信息，就会按照默认格式解析
		// 2023年2月19日22:06:56
		// 这里和我想的一样，不是按照文本解析，而是按照response响应对象去解析
		// 所以设置头文件的位置，对最终结果没有影响
		// 这里的writer是随着response对象获取出来的
		// 而response对象会自动销毁，
		// 因此，这里的writer也会跟着response一起被关闭
		// --------------------------------------------------------------------
		// 这里的输出格式不是UTF-8，因此直接展示中文会乱码
	}

	/**
	 * @param req
	 * @param resp
	 * @throws ServletException
	 * @throws IOException
	 */
	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// super.doPut(req, resp);
		this.doGet(req, resp);
	}
}
