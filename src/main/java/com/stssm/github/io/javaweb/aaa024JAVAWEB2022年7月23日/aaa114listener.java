package com.stssm.github.io.javaweb.aaa024JAVAWEB2022年7月23日;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Created by Intellij IDEA.
 * Project:filter-demo
 * Package:com.itheima.web.filter
 *
 * @param
 * @author liujiajun_junw
 * @Date 2022-07-13-06  星期六
 * @description
 * @return
 * @exception
 */
@WebListener
public class aaa114listener implements ServletContextListener {
	// 上面的监听属性，不需要添加任何多余注解，因为本身就是自动执行的

	/**
	 * @param servletContextEvent
	 */
	@Override
	public void contextInitialized(ServletContextEvent servletContextEvent) {
		// 自动会执行，而且是在请求发起和结束之前
		// 有点类似我们之前的代码块
		System.out.println("我是监听器……");

	}

	/**
	 * @param servletContextEvent
	 */
	@Override
	public void contextDestroyed(ServletContextEvent servletContextEvent) {

	}


}
