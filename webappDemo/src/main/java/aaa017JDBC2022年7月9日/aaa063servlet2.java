package aaa017JDBC2022年7月9日;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:aaa017JDBC2022年7月9日
 *
 * @param
 * @author liujiajun_junw
 * @Date 2022-07-11-42  星期六
 * @description
 * @return
 * @exception
 */
@WebServlet("/demo")
public class aaa063servlet2 extends HttpServlet {

	/**
	 * @param req
	 * @param resp
	 * @throws ServletException
	 * @throws IOException
	 */
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// super.doGet(req, resp);
		System.out.println("do...get");
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
		System.out.println("do...post");
	}
}
