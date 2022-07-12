package com.stssm.github.io.javaweb.aaa018JAVAWEB2022年7月11日;

import com.stssm.github.io.javaweb.aaa018JAVAWEB2022年7月11日.mapper.loginMapper;
import com.stssm.github.io.javaweb.aaa018JAVAWEB2022年7月11日.pojo.user;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;

/**
 * Created by Intellij IDEA.
 * Project:show
 * Package:${PACKAGE_NAME}
 *
 * @param
 * @author liujiajun_junw
 * @Date 2022-07-21-42  星期一
 * @description
 * @return
 * @exception
 */

@WebServlet("/aaa082request")
public class aaa082request extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String account = request.getParameter("account");
		String password = request.getParameter("password");
		String resource = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		loginMapper mapper = sqlSession.getMapper(loginMapper.class);
		user login = mapper.login(account, password);
		sqlSession.close();
		response.setContentType("text/html;charset=utf-8");
		PrintWriter writer = response.getWriter();

		if (login != null) {
			System.out.println("登录成功");
			writer.write("登录成功");
		} else {
			System.out.println("登录失败");
			writer.write("登录失败");
		}


	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doGet(request, response);
	}
}
