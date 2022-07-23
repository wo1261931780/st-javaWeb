package com.stssm.github.io.javaweb.aaa024JAVAWEB2022年7月23日; /**
 * Created by Intellij IDEA.
 * Project:filter-demo
 * Package:${PACKAGE_NAME}
 *
 * @author liujiajun_junw
 * @Date 2022-07-12-41  星期六
 * @description
 * @param
 * @return
 * @exception
 */

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebFilter(filterName = "aaa100Filter")
public class aaa100Filter implements Filter {
	public void init(FilterConfig config) throws ServletException {
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {
		HttpServletRequest x = (HttpServletRequest) request;
		// 需要对静态资源进行筛选，然后放行
		String[] resources = {"/css/", "/login.jsp"};
		String url = x.getRequestURL().toString();
		for (String resource : resources) {
			if (resource.contains(url)) {
				return;
			}

		}


		HttpSession session = x.getSession();
		Object user = session.getAttribute("user");
		if (user != null) {
			// 是否放行，需要具体判断
			chain.doFilter(request, response);
		} else {
			request.setAttribute("loginMsg", "您尚未登录");
			request.getRequestDispatcher("/login.jsp").forward(request, response);
			// 这里有个问题，我们的静态资源，类似css和js，也是资源的一种
			// 如果这里一次性全部拦截了，会导致重新登陆的时候，看不到网页的布局效果
		}


	}

	public void destroy() {
	}
}
