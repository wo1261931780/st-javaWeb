package wo1261931780.stjavaWeb.history.aaa022javaweb20220714; /**
 * Created by Intellij IDEA.
 * Project:jsp-demo
 * Package:${PACKAGE_NAME}
 *
 * @author liujiajun_junw
 * @Date 2022-07-21-08  星期三
 * @description
 * @param
 * @return
 * @exception
 */


import wo1261931780.stjavaWeb.history.aaa021javaweb20220713.pojo.Brand;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/Aaa098Servlet")
public class Aaa098Servlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// request.setCharacterEncoding("UTF-8");
		List<Brand> x = new ArrayList<>();
		x.add(new Brand(1, "三只松鼠", "三只松鼠", 100, "三只松鼠，好吃不上火", 1));
		x.add(new Brand(2, "优衣库", "优衣库", 200, "优衣库，服适人生", 0));
		x.add(new Brand(3, "小米", "小米科技有限公司", 1000, "为发烧而生", 1));
		request.setAttribute("brand", x);
		request.getRequestDispatcher("/aaa095.jsp").forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doGet(request, response);
	}
}
