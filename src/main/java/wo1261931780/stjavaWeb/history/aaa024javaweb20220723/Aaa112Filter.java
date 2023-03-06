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
 * @Date 2022-07-12-31  星期六
 * @description
 * @return
 * @exception
 */
@WebFilter("/*")
public class Aaa112Filter implements Filter {
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
		LOG_SHOW.debug("2.我是放行前处理");
		filterChain.doFilter(servletRequest, servletResponse);// 放行代码
		LOG_SHOW.debug("3.我是放行后处理");
	}

	/**
	 *
	 */
	@Override
	public void destroy() {
		LOG_SHOW.debug("123");
	}
}
