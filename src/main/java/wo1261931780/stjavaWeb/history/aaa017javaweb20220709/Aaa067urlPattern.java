package wo1261931780.stjavaWeb.history.aaa017javaweb20220709;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static wo1261931780.stjavaWeb.history.aaa002jdbc20220531.Aaa001Demo.LOG_SHOW;


@WebServlet(urlPatterns = {"/show1", "/show2"})// 目录可以是一个数组
/**
 * @WebServlet(urlPatterns = "/demo/show1")// 在具体的配置过程中，可以是精确的路径
 * @WebServlet(urlPatterns = "/demo/*")// 也可以是通配符设置的任意路径，
 * 但是优先级没有精确路径的高
 * @WebServlet(urlPatterns = "*.html")// 只要是html文件就可以访问，
 * 但是这里不能写路径斜杠，否则会报错
 * @WebServlet(urlPatterns = "/")和(urlPatterns = "/*")// 任意路径都可以访问，同时，后面跟着任意的路径也是可以的
 * 简单来说，就是不限制，但是优先级也是最低的，如果前面已经匹配了，这里就会被拦截
 * 反过来思考，我们可以根据这个，来配置404的页面，任意路径如果匹配不上，就直接进入404的提示页面
 * 这里有个雷
 * 如果我配置了任意路径的servlet，会导致我无法访问其他静态资源，只能访问我指定的那个servlet
 * @author liujiajun_junw
 */
public class Aaa067urlPattern extends HttpServlet {
	/**
	 * @param req
	 * @param resp
	 * @throws ServletException
	 * @throws IOException
	 */
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// super.doGet(req, resp);
		LOG_SHOW.debug("我是get方法");
	}
}
