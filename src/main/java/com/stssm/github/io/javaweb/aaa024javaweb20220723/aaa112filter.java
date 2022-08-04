package com.stssm.github.io.javaweb.aaa024javaweb20220723;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

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
public class aaa112filter implements Filter {
	/**
	 * @param filterConfig
	 * @throws ServletException
	 */
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {

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
		System.out.println("2.我是放行前处理");
		filterChain.doFilter(servletRequest, servletResponse);// 放行代码
		System.out.println("3.我是放行后处理");
	}

	/**
	 *
	 */
	@Override
	public void destroy() {

	}
}
