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
 * Package:demo
 *
 * @param
 * @author liujiajun_junw
 * @Date 2022-07-20-17  星期日
 * @description
 * @return
 * @exception
 */
@WebServlet("/Aaa078Response")
public class Aaa078Response extends HttpServlet {
	// 请求的转发，就是资源1处理完了信息以后，转发给资源2，由资源2做进一步的处理
	// 举个例子：
	// 我通知张三要去开会，张三发现所有人都要去，所以把消息转发给了李四，这样李四也去了
	// ---------------------------------------------------------------------
	// 请求的重定向，就是我向资源1发起请求，资源1告诉我他做不到，但是资源2可以做到
	// 所以我拿着资源1返回的消息，去找资源2完成了处理
	// 举个例子：
	// 就是我告诉张三，我要去会议室1开会，
	// 张三跟我说会议室1有人了，要去会议室2，所以我拿着张三给我的消息，去会议室2完成工作
	// ---------------------------------------------------------------------


	/**
	 * @param req
	 * @param resp
	 * @throws ServletException
	 * @throws IOException
	 */
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// super.doGet(req, resp);
		LOG_SHOW.debug("我是get");
		// resp.setStatus(302);// 不需要字符串，直接设置状态码
		// 浏览器就会根据状态码进行解析，然后做重定向的操作
		// resp.setHeader("Location", "/show/Aaa079Response");// 这里是项目的启动名，直接写路径名会导致定向失败
		// resp.setHeader("Location", "/show_war/Aaa079Response");
		// ---------------------------------------------------------------------
		resp.sendRedirect("/show_war/Aaa079Response"); // 这里直接设置一条语句就可以，内部的实现是一样的
		// 有个路径问题，课程说的比较简单，但是要搞清楚：
		// 我们的转发，都是在服务器内部进行的操作
		// 简单来说，就是针对服务器而言，
		// 服务器自己处理的操作，不需要添加虚拟目录，直接告诉服务器具体的资源路径就可以
		// ---------------------------------------------------------------------
		// 同样的，我们的重定向，是浏览器在做操作，是针对浏览器而言的
		// 浏览器需要根据我们给出的地址，进行重定向，因此需要配置好全部的路径
		// ---------------------------------------------------------------------
		// 除了转发不需要添加虚拟目录，其他的都需要手动添加
		// 理论上来说，所有写死的地方，都存在耦合性的问题
		// 类似上面这种，存在一个写死的资源路径，从而导致后续维护出现问题
		String contextPath = req.getContextPath();// 动态获取，解决问题
		resp.sendRedirect(contextPath+"/Aaa079Response");
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
		LOG_SHOW.debug("我是post");
		this.doGet(req, resp);
	}
}
