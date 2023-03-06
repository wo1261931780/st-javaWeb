package wo1261931780.stjavaWeb.history.aaa018javaweb20220710;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
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
 * @Date 2022-07-22-04  星期日
 * @description
 * @return
 * @exception
 */
@WebServlet("/Aaa080Response响应字符数据")
public class Aaa080Response extends HttpServlet {

	/**
	 * @param req
	 * @param resp
	 * @throws ServletException
	 * @throws IOException
	 */
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// super.doGet(req, resp);
		PrintWriter writer = resp.getWriter();// 这里应该是获取了一个对象，因为对象才能执行方法
		writer.write("aaa");
		writer.write("<h1>123</h1>");// 直接写数据，浏览器只会当成文本去解析
		resp.setHeader("content-type", "text/html");// 如果不在里面设置一个头信息，就会按照默认格式解析
		// 这里和我想的一样，不是按照文本解析，而是按照response响应对象去解析
		// 所以设置头文件的位置，对最终结果没有影响
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
