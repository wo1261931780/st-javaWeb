package com.stssm.github.io.javaweb.aaa018javaweb20220710;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;

import static com.stssm.github.io.javaweb.aaa002jdbc20220531.Aaa001Demo.LOG_SHOW;
import static com.stssm.github.io.javaweb.aaa002jdbc20220531.Aaa001Demo.SPLICE;

/**
 * Created by Intellij IDEA.
 * Project:show
 * Package:demo
 *
 * @param
 * @author liujiajun_junw
 * @Date 2022-07-09-37  星期日
 * @description
 * @return
 * @exception
 */
@WebServlet("/reqTest2")
public class Aaa071Simplification extends HttpServlet {
	/**
	 * @param req
	 * @param resp
	 * @throws ServletException
	 * @throws IOException
	 */
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// super.doGet(req, resp);
		// 但是简化以后，也需要做类型的判断
		// 为了简化开发，代码的请求过程，会将其作为键值对存储
		// 但是考虑到key和value存在覆盖问题
		// 所以map集合，最终的格式是string和string[]
		LOG_SHOW.debug("我是get方法");
		String method = req.getMethod();
		LOG_SHOW.debug(method);// 这里也有一个坑
		// 里面的全部都是大写，小写会导致不识别
		switch (method) {
			case "GET":
				LOG_SHOW.debug("我是get");
				String queryString = req.getQueryString();
				LOG_SHOW.debug(queryString);// account=123456&password=123465&hobbies=2&hobbies=3
				LOG_SHOW.debug(SPLICE);
				Map<String, String[]> parameterMap = req.getParameterMap();
				LOG_SHOW.debug("我是完整数组：" + parameterMap);// 在没有输入任何数据的情况下，只能得到一个空字符串，不是null
				LOG_SHOW.debug(SPLICE);
				for (String s : parameterMap.keySet()) {
					LOG_SHOW.debug("我是key：" + s);
					String[] strings = parameterMap.get(s);
					LOG_SHOW.debug("我是value的数组：" + Arrays.toString(strings));
				}
				LOG_SHOW.debug(SPLICE);
				String[] hobbies = req.getParameterValues("hobbies");
				LOG_SHOW.debug("我是直接获取value的数组：" + hobbies);// [Ljava.lang.String;@298bd38e
				LOG_SHOW.debug("我是直接获取value的数组：" + Arrays.toString(hobbies));// [Ljava.lang.String;@298bd38e
				break;
			case "POST":
				LOG_SHOW.debug("我是post");
				BufferedReader reader = req.getReader();
				LOG_SHOW.debug(reader.readLine());
				LOG_SHOW.debug(SPLICE);
				// 获取详细参数的方法是通用的，所以直接拿到结果就可以

				break;
			default:
				break;
		}


	}

	/**
	 * @param req
	 * @param resp
	 * @throws ServletException
	 * @throws IOException
	 */
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// super.doPost(req, resp);
		LOG_SHOW.debug("我是post方法");
		this.doGet(req, resp);// 通过循环调用，简化代码
	}
}
