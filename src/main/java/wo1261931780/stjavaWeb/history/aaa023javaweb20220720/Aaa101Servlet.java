package wo1261931780.stjavaWeb.history.aaa023javaweb20220720; /**
 * Created by Intellij IDEA.
 * Project:cookie-demo
 * Package:${PACKAGE_NAME}
 *
 * @author liujiajun_junw
 * @Date 2022-07-20-19  星期四
 * @description
 * @param
 * @return
 * @exception
 */

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static com.stssm.github.io.javaweb.aaa002jdbc20220531.Aaa001Demo.LOG_SHOW;

@WebServlet(name = "Aaa101Servlet", value = "/Aaa101Servlet")
public class Aaa101Servlet extends HttpServlet {
	// 一次请求的过程中，如果没有断开，多次请求资源的过程，还算是一次会话
	// 不管多少个请求和响应的过程，只要一个客户端和服务端在不断开的情况下，就算一次
	// 对服务器来说，识别每次的会话是否是同一个客户端发出的
	// 这就是会话跟踪的过程

	// ---------------------------------------------------------------
	// 服务器在运行的过程中，会接收到多次请求
	// 但是对于服务器来说，是不清楚每次请求是否是同一个客户端发出的，所以才需要使用会话跟踪技术

	// 对于一次用户登录的过程，在首页和账号详情之间的跳转，都算一次会话过程
	// 现在的服务器请求，往往使用http，也正是http无状态的特性，才导致我们需要在每次请求的过程中
	// 共享数据,从而区分不同的会话
	// ---------------------------------------------------------------

	// 客户端的cookie，就是把数据放到浏览器
	// 服务端的session，就是把数据放到服务器

	// cookie是服务器创建的，创建完成以后，会将其交给浏览器
	// 浏览器存到缓存中，然后将其作为依据
	// 在请求另外一个资源的时候，就带着cookie和数据，发送给服务器
	// 浏览器的cookie，都是用键值对的形式去创建

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		// 这里是用来发送cookie的
		Cookie x = new Cookie("demoName", "demoPaw");
		response.addCookie(x);
		x.setMaxAge(60 * 60 * 24 * 7); // 存在7天的时间
		// 我们的java代码会自动进行运算，但是一般我们会直接放数据在里面，这样可以提高性能

		Cookie[] cookies = request.getCookies();
		for (Cookie cookie : cookies) {
			LOG_SHOW.debug(cookie.getName());
			LOG_SHOW.debug(cookie.getValue());
			// demoName
			// demoPaw
			// Idea-d5c8856d
			// bbb863f5-3074-4e7b-bc9c-bd7cf83343ec
			// Webstorm-b9ef4fb5
			// 0db14430-0fb3-4cd3-b4b0-b21398ff801d
			// 这里默认会传回来所有的cookie，
			// 不过换句话说，这样有安全问题，我可以拿到别的客户端发送的cookie数据
			// 不过话说回来，也正是因为cookie是多个，所以上面才是数组的形式获取的
			// 不过从我们上面构造cookie的过程也可以发现，cookie对于java来说，也是一个对象
			// 我们浏览器中看到的set-cookie，实际上就是一个响应头
		}
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doGet(request, response);
	}
}
