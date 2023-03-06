package wo1261931780.stjavaWeb.history.aaa017javaweb20220709;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

import static wo1261931780.stjavaWeb.history.aaa002jdbc20220531.Aaa001Demo.LOG_SHOW;


/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:PACKAGE_NAME
 *
 * @author liujiajun_junw
 * @Date 2022-07-10-11  星期六
 * @description 要访问资源，就必须要设置访问的路径，我们在注解上，添加对应的路径即可
 */
@WebServlet(urlPatterns = "/Aaa062Servlet", loadOnStartup = 1)// 这里，urlPattern表示访问的路径，loadOnStartUp表示优先级
public class Aaa062Servlet implements Servlet {
	private ServletConfig configDemo;

	// 说明一下，数字越小，优先级越高
	// 1表示第一次访问的时候创建
	// 0和负数表示服务器启动的时候创建

	/**
	 * @param servletConfig
	 * @throws ServletException
	 */
	@Override
	public void init(ServletConfig servletConfig) throws ServletException {
		LOG_SHOW.debug("我是初始化方法");// 只有在第一次访问的时候才会调用
		// 也因为是初始化，所以只会调用一次
		LOG_SHOW.debug(String.valueOf(servletConfig));
		this.configDemo = servletConfig;
	}
	// 我们看一下这里
	// 不同的方法也代表了不同的生命周期
	// init是最早的，service就是执行过程中的，destroy表示需要回收内存/结束的时候

	/**
	 * @return
	 */
	@Override
	public ServletConfig getServletConfig() {
		// 获取配置信息
		// return null;
		return configDemo;
	}

	/**
	 * @param servletRequest
	 * @param servletResponse
	 * @throws ServletException
	 * @throws IOException
	 * @Description 每次被访问的时候，都会被调用
	 */
	@Override
	public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
		// 每次启动，这个方法都会被执行一次
		LOG_SHOW.debug("我执行了");
		// servlet对象，由Tomcat服务器来创建
		// 同样的，也由Tomcat服务器来调用
	}

	/**
	 * @return
	 */
	@Override
	public String getServletInfo() {
		// 获取信息用的，作用不大，返回null或者空字符串都可以
		return null;
	}

	/**
	 *
	 */
	@Override
	public void destroy() {
		LOG_SHOW.debug("我是退出的方法");// 强制退出是不会展示的
		// 必须要按照指定的方法执行退出命令，才能打印结果
	}
}
