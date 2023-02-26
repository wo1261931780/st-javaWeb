package com.stssm.github.io.javaweb.aaa023javaweb20220720; /**
 * Created by Intellij IDEA.
 * Project:cookie-demo
 * Package:${PACKAGE_NAME}
 *
 * @author liujiajun_junw
 * @Date 2022-07-20-42  星期四
 * @description
 * @param
 * @return
 * @exception
 */

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

import static com.stssm.github.io.javaweb.aaa002jdbc20220531.Aaa001Demo.LOG_SHOW;

@WebServlet(name = "Aaa103Servlet", value = "/Aaa103Servlet")
public class Aaa103Servlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String demo2 = "中文";
		// cookie不能使用中文，否则会报错
		String encode = URLEncoder.encode(demo2, StandardCharsets.UTF_8);
		Cookie x = new Cookie("demo1", encode);
		response.addCookie(x);
		Cookie[] cookies = request.getCookies();
		for (Cookie cookie : cookies) {
			LOG_SHOW.debug("我是key：" + cookie.getName());
			String decode = URLDecoder.decode(cookie.getValue(), StandardCharsets.UTF_8);
			if (decode != null) {
				LOG_SHOW.debug("我是value：" + decode);
			}
		}


	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doGet(request, response);
	}
}
