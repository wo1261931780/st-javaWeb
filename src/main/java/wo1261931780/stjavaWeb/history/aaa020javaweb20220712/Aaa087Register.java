package wo1261931780.stjavaWeb.history.aaa020javaweb20220712;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import wo1261931780.stjavaWeb.history.aaa019javaweb20220711.pojo.User;
import wo1261931780.stjavaWeb.history.aaa020javaweb20220712.util.SqLsessionFactoryUtil;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Intellij IDEA.
 * Project:show
 * Package:demo
 *
 * @param
 * @author liujiajun_junw
 * @Date 2022-07-20-49  星期二
 * @description
 * @return
 * @exception
 */
public class Aaa087Register extends HttpServlet {
	/**
	 * @param req
	 * @param resp
	 * @throws ServletException
	 * @throws IOException
	 */
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// super.doGet(req, resp);
		req.setCharacterEncoding("UTF-8");
		String account = req.getParameter("account");
		String password = req.getParameter("password");
		User user1 = new User();
		user1.setId(account);
		user1.setPassword(password);
		SqlSessionFactory sqlFactory = SqLsessionFactoryUtil.getSqlSessionFactory();
		SqlSession sqlSession = sqlFactory.openSession();// 需要独立出来，避免不同的事务之间互相影响
		Aaa089loginMapper mapper = sqlSession.getMapper(Aaa089loginMapper.class);
		// User user = mapper.queryByUserName(account);


		PrintWriter writer = resp.getWriter();
		// if (user != null) {
		// 	resp.setContentType("text/html;charset=utf-8");
		// 	writer.write("当前账号已存在");
		// } else {
		// 	// mapper.insert(user1);
		// 	sqlSession.commit();
		// 	writer.write("欢迎新用户");
		// }
		sqlSession.close();
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
