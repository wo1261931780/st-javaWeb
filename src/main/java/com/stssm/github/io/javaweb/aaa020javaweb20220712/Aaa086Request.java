package com.stssm.github.io.javaweb.aaa020javaweb20220712;

import com.stssm.github.io.javaweb.aaa019javaweb20220711.pojo.User;
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

@WebServlet("/Aaa086Request")
public class Aaa086Request extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String account = request.getParameter("account");
		String password = request.getParameter("password");
		String resource = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		Aaa089loginMapper mapper = sqlSession.getMapper(Aaa089loginMapper.class);
		User login = mapper.login(account, password);
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
