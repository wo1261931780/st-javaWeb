package ssm.github.io.controller; /**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:${PACKAGE_NAME}
 *
 * @author liujiajun_junw
 * @Date 2022-07-09-26  星期日
 * @description
 * @param
 * @return
 * @exception
 */

import ssm.github.io.pojo.TbBrand;
import ssm.github.io.service.DemoService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "SelectByIdServlet", value = "/SelectByIdServlet")
public class SelectByIdServlet extends HttpServlet {
	// private final DemoService x = new DemoService();

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		TbBrand brand = new TbBrand();
		brand.setId(Integer.parseInt(request.getParameter("id")));
		// request.setAttribute("brand", brand);
		TbBrand resBrand = DemoService.selectById(Integer.parseInt(request.getParameter("id")));
		request.setAttribute("brand", resBrand);
		request.getRequestDispatcher("/changMessage.jsp").forward(request, response);

	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doGet(request, response);
	}
}
