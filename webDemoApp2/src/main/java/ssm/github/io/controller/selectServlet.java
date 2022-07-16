package ssm.github.io.controller; /**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:${PACKAGE_NAME}
 *
 * @author liujiajun_junw
 * @Date 2022-07-21-38  星期六
 * @description
 * @param
 * @return
 * @exception
 */

import ssm.github.io.pojo.TbBrand;
import ssm.github.io.service.demoService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "selectServlet", value = "/selectServlet")
public class selectServlet extends HttpServlet {
	private final demoService demoService = new demoService();

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// request.setCharacterEncoding("UTF-8");

		List<TbBrand> tbBrands = demoService.selectAll();
		request.setAttribute("brand", tbBrands);
		request.getRequestDispatcher("/showMeTable.jsp").forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doGet(request, response);
	}
}
