package wo1261931780.stjavaWeb.history.aaa019javaweb20220711;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import wo1261931780.stjavaWeb.history.aaa019javaweb20220711.mapper.LoginMapper;
import wo1261931780.stjavaWeb.history.aaa019javaweb20220711.pojo.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;

import static wo1261931780.stjavaWeb.history.aaa002jdbc20220531.Aaa001Demo.LOG_SHOW;
import static wo1261931780.stjavaWeb.history.aaa002jdbc20220531.Aaa001Demo.RESOURCE;

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

@WebServlet("/Aaa085Request")
public class Aaa082Request extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String account = request.getParameter("account");
		String password = request.getParameter("password");
		// String resource = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(RESOURCE);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		LoginMapper mapper = sqlSession.getMapper(LoginMapper.class);
		User login = mapper.login(account, password);
		sqlSession.close();
		response.setContentType("text/html;charset=utf-8");
		PrintWriter writer = response.getWriter();

		if (login != null) {
			LOG_SHOW.debug("登录成功");
			writer.write("登录成功");
		} else {
			LOG_SHOW.debug("登录失败");
			writer.write("登录失败");
		}


	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doGet(request, response);
	}
}
