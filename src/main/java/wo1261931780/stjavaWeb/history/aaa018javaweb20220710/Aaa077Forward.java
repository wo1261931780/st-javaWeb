package wo1261931780.stjavaWeb.history.aaa018javaweb20220710;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static com.stssm.github.io.javaweb.aaa002jdbc20220531.Aaa001Demo.LOG_SHOW;

/**
 * Created by Intellij IDEA.
 * Project:show
 * Package:${PACKAGE_NAME}
 *
 * @param
 * @author liujiajun_junw
 * @Date 2022-07-13-34  星期日
 * @description
 * @return
 * @exception
 */
@WebServlet(name = "Aaa077Forward", value = "/Aaa077Forward")
public class Aaa077Forward extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// request.setCharacterEncoding("UTF-8");
		LOG_SHOW.debug("我被转发了");
		Object value = request.getAttribute("key");
		LOG_SHOW.debug("我是里面的值：" + value);
		// 这里就相当于在请求体中，执行数据获取的操作
		// 每次访问资源，都会执行一次转发的操作
		// 这里可以理解为流水线，类似工厂的工作方法
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doGet(request, response);
	}
}
