package wo1261931780.stjavaWeb.history.aaa024javaweb20220723;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

import static wo1261931780.stjavaWeb.history.aaa002jdbc20220531.Aaa001Demo.LOG_SHOW;

/**
 * Created by Intellij IDEA.
 * Project:filter-demo
 * Package:com.itheima.web.filter
 *
 * @param
 * @author liujiajun_junw
 * @Date 2022-07-12-09  星期六
 * @description
 * @return
 * @exception
 */
@WebFilter("/*")
public class Aaa111Filter implements Filter {
	// 上面是拦截资源的路径，而不是访问的路径
	// 说白了，如果是index.jsp，
	// 就是有人在访问index.jsp的时候，对请求和响应做处理
	// 否则，就不处理

	/**
	 * @param filterConfig
	 * @throws ServletException
	 */
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		LOG_SHOW.debug("123");
	}

	/**
	 * @param servletRequest
	 * @param servletResponse
	 * @param filterChain
	 * @throws IOException
	 * @throws ServletException
	 */
	@Override
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
		// 这三个方法对应生命周期的三个阶段
		// 我们默认使用的是这里的筛选器
		LOG_SHOW.debug("1.我是测试，我进行了一次拦截");
		// Code.Chain.doFilter(servletRequest,servletResponse);// 如果不放行，会报错
		filterChain.doFilter(servletRequest, servletResponse);// 这里和课程的代码不一样
		// 在放行过程中，有一个放行前处理，和放行后处理
		// 放行前，处理一次，在返回的时候，只会执行放行后的代码，不会重复执行
		LOG_SHOW.debug("4.已经放行的内容，进行了返回，执行放行后的代码");
	}

	/**
	 *
	 */
	@Override
	public void destroy() {
		LOG_SHOW.debug("123");
	}
}
