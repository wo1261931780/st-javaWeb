package com.stssm.github.io.javaweb.aaa018JAVAWEB2022年7月11日;

import org.apache.commons.io.IOUtils;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by Intellij IDEA.
 * Project:show
 * Package:user
 *
 * @param
 * @author liujiajun_junw
 * @Date 2022-07-21-23  星期一
 * @description
 * @return
 * @exception
 */
@WebServlet("/aaa081response")
public class aaa081response extends HttpServlet {


	/**
	 * @param req
	 * @param resp
	 * @throws ServletException
	 * @throws IOException
	 */
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// super.doGet(req, resp);

		// 这里测试字节输入流
		FileInputStream fileInputStream = new FileInputStream("C:\\Users\\1\\Documents\\GitHub\\show\\src\\main\\java\\user\\bqb.png");
		ServletOutputStream outputStream = resp.getOutputStream();
		// byte[] bytes = new byte[1024];
		// int length = 0;
		// while ((length = fileInputStream.read(bytes)) != -1) {
		// 	outputStream.write(bytes,0,length);
		// }
		// fileInputStream.close();
		// 上面是一个基本的输入输出流，做字节内容的拷贝和输出
		// 但是实际工作基本不用，因为太麻烦
		// 我们可以直接使用Apache提供的插件
		// --------------------------------------------------------------------
		int copy = IOUtils.copy(fileInputStream, outputStream);
		System.out.println("我是文件的大小，按照字节数量展示：" + copy);
		fileInputStream.close();


	}

	/**
	 * @param req
	 * @param resp
	 * @throws ServletException
	 * @throws IOException
	 */
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// super.doPost(req, resp);
		this.doGet(req, resp);
	}
}
