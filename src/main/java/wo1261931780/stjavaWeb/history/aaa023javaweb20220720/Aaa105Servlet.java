package wo1261931780.stjavaWeb.history.aaa023javaweb20220720; /**
 * Created by Intellij IDEA.
 * Project:cookie-demo
 * Package:${PACKAGE_NAME}
 *
 * @author liujiajun_junw
 * @Date 2022-07-21-12  星期四
 * @description
 * @param
 * @return
 * @exception
 */

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

import static wo1261931780.stjavaWeb.history.aaa002jdbc20220531.Aaa001Demo.LOG_SHOW;

@WebServlet(name = "Aaa105Servlet", value = "/Aaa105Servlet")
public class Aaa105Servlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		HttpSession session = request.getSession();
		Object result = session.getAttribute("name");
		LOG_SHOW.debug("我是session：" + session);
		LOG_SHOW.debug("我是result：" + result);
		// 不需要强转，但是要session中先存好数据，否则拿不到
		// LOG_SHOW.debug("我是result：" + result.toString());


	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doGet(request, response);
	}
}
