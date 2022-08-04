package ssm.github.io.controller;
/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:${PACKAGE_NAME}
 *
 * @author liujiajun_junw
 * @Date 2022-07-22-42  星期六
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

@WebServlet(name = "AddServlet", value = "/AddServlet")
public class AddServlet extends HttpServlet {
	private final DemoService newService = new DemoService();

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		TbBrand tbBrand = new TbBrand();
		tbBrand.setBrandName(request.getParameter("brandName"));
		tbBrand.setCompanyName(request.getParameter("CompanyName"));
		tbBrand.setOrdered(Integer.parseInt(request.getParameter("Ordered")));
		tbBrand.setDescription(request.getParameter("Description"));
		tbBrand.setStatus(Integer.parseInt(request.getParameter("Status")));
		newService.insertNewRecorde(tbBrand);

		request.getRequestDispatcher("/SelectServlet").forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doGet(request, response);
	}
}
