package wo1261931780.stjavaWeb.history.aaa018javaweb20220710;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;

import static wo1261931780.stjavaWeb.history.aaa002jdbc20220531.Aaa001Demo.LOG_SHOW;

/**
 * Created by Intellij IDEA.
 * Project:show
 * Package:demo
 *
 * @param
 * @author liujiajun_junw
 * @Date 2022-07-08-56  星期日
 * @description
 * @return
 * @exception
 */
@WebServlet("/Aaa077requestHead")
public class Aaa077requestHead extends HttpServlet {
	/**
	 * @param req
	 * @param resp
	 * @throws ServletException
	 * @throws IOException
	 */
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// super.doGet(req, resp);
		// 我们常见的xx:xx1
		// 这种格式的数据，都是键值对的形式
		// ---------------------------------------------------------------------

		String header = req.getHeader("User-agent");
		String format = String.format("我是请求头：%s", header);
		LOG_SHOW.debug(format);
		// Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/105.0.0.0 Safari/537.36
		// 这里是查看浏览器版本和内核信息
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
		// 如果是get请求，就是通过queryString来获取的
		// ---------------------------------------------------------------------
		// post需要通过输入流来获取

		LOG_SHOW.debug("我是提交信息");
		BufferedReader reader = req.getReader();// 不需要手动关闭
		String format = String.format("我是总行：%s", reader);
		LOG_SHOW.debug(format);
		String s = reader.readLine();
		LOG_SHOW.debug(s);// userName=12456&userPaw=56465
		// 请求完成以后，自动关闭
		// ---------------------------------------------------------------------
	}
}
