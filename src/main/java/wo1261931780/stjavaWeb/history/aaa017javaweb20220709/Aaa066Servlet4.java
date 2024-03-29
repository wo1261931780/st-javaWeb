package wo1261931780.stjavaWeb.history.aaa017javaweb20220709;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import static wo1261931780.stjavaWeb.history.aaa002jdbc20220531.Aaa001Demo.LOG_SHOW;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.javaweb.aaa017javaweb20220709
 *
 * @param
 * @author liujiajun_junw
 * @Date 2022-07-14-45  星期六
 * @description
 * @return
 * @exception
 */
@WebServlet("/Aaa066Servlet4")
public class Aaa066Servlet4 extends Aaa065Servlet3 {
	// 上面的webservlet有点类似于网络访问资源路径
	// 上面a65，就类似于之前的httpServlet
	// 下面继承以后，进一步做逻辑处理

	/**
	 * 使用protected修饰符，子类可以看到方法
	 *
	 * @param servletRequest
	 * @param servletResponse
	 */
	@Override
	protected void doGet(ServletRequest servletRequest, ServletResponse servletResponse) {
		// super.doGet(servletRequest, servletResponse);
		LOG_SHOW.debug("我是get");
	}

	/**
	 * @param servletRequest
	 * @param servletResponse
	 */
	@Override
	protected void doPost(ServletRequest servletRequest, ServletResponse servletResponse) {
		// super.doPost(servletRequest, servletResponse);
		LOG_SHOW.debug("我是post");
	}
}
