package com.stssm.github.io.javaweb.aaa017javaweb20220709;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.javaweb.aaa016JDBC2022年7月8日
 *
 * @param
 * @author liujiajun_junw
 * @Date 2022-07-08-44  星期六
 * @description
 * @return
 * @exception
 */
public class Aaa061Servlet {
	// javaee一共有十三项规范，servlet就是其中的一种
	// servlet实际上就是一个接口，我们实现了接口，也就相当于实现了接口对应的规范
	// 我们使用servlet，需要指定scope依赖范围
	// 一般指定provided，表示编译和测试环境有效,运行环境无效
	// Tomcat打包的时候，自带了servlet，如果打包的时候还打包进去，就会产生冲突，从而报错
	// 我们指定了依赖范围，也是在做排除依赖包
	// -----------------------------------------------------
	// 之前老版本是使用xml来配置servlet,
	// 新版本就使用URLpattern来配置

}
