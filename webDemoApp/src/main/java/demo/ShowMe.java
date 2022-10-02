package demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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
public class ShowMe extends HttpServlet {
	public static final Logger LOG_SHOW = LoggerFactory.getLogger("Aaa001Demo.class");



	// private static final Logger LOG_SHOW = "";

	/**
	 * @param req
	 * @param resp
	 * @throws ServletException
	 * @throws IOException
	 */
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		LOG_SHOW.debug("我是get方法");
	}
}
