package demo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:demo
 *
 * @param
 * @author liujiajun_junw
 * @Date 2022-07-15-21  星期六
 * @description
 * @return
 * @exception
 */
@WebServlet("/show1")
public class showMe extends HttpServlet {


	/**
	 * @param req
	 * @param resp
	 * @throws ServletException
	 * @throws IOException
	 */
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("我是get方法");
	}
}
