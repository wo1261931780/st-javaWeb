package com.stssm.github.io.javaweb.aaa022JAVAWEB2022年7月14日;

import com.stssm.github.io.javaweb.aaa021JAVAWEB2022年7月13日.pojo.Brand;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Intellij IDEA.
 * Project:jsp-demo
 * Package:com.itheima.web
 *
 * @param
 * @author liujiajun_junw
 * @Date 2022-07-22-07  星期四
 * @description
 * @return
 * @exception
 */
@WebServlet("/aaa089JSTL")
public class aaa089JSTL extends HttpServlet {
	// jstl标签，是用来取代java代码的标签
	// 说的简单点，jstl就是用网页标签的形式，来代替java代码的书写
	// 有点类似于用网页的技术来做java
	// 这里有个坑需要说明一下：
	// jsp的书写和jstl，都是需要在pom中引入依赖的，否则是不生效的
	// 在idea中也是，如果没有引入标签，那么新建文件的时候，根本就没有这个选项
	//         <!--jstl-->
	//     <dependency>
	//         <groupId>jstl</groupId>
	//         <artifactId>jstl</artifactId>
	//         <version>1.2</version>
	//     </dependency>
	//
	//     <dependency>
	//         <groupId>taglibs</groupId>
	//         <artifactId>standard</artifactId>
	//         <version>1.1.2</version>
	//     </dependency>
	// 上面就是两个需要的依赖，jsp的依赖这里就不写了

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1. 准备数据
		List<Brand> brands = new ArrayList<Brand>();
		brands.add(new Brand(1, "三只松鼠", "三只松鼠", 100, "三只松鼠，好吃不上火", 1));
		brands.add(new Brand(2, "优衣库", "优衣库", 200, "优衣库，服适人生", 0));
		brands.add(new Brand(3, "小米", "小米科技有限公司", 1000, "为发烧而生", 1));


		// 2. 存储到request域中
		request.setAttribute("brands", brands);
		request.setAttribute("status", 1);
		request.getRequestDispatcher("/aaa005.jsp").forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doGet(request, response);
	}
}
