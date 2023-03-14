package wo1261931780.stjavaWeb.history.aaa027javaweb20220726.web.servlet; /**
 * Created by Intellij IDEA.
 * Project:brand-case
 * Package:${PACKAGE_NAME}
 *
 * @author liujiajun_junw
 * @Date 2022-07-20-23  星期二
 * @description
 * @param
 * @return
 * @exception
 */

import com.alibaba.fastjson2.JSON;
import wo1261931780.stjavaWeb.history.aaa027javaweb20220726.pojo.Bbb029TbBrand;
import wo1261931780.stjavaWeb.history.aaa027javaweb20220726.service.Bbb031brandService;
import wo1261931780.stjavaWeb.history.aaa027javaweb20220726.service.impl.Bbb030BrandServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "Bbb032brandServlet", value = "/Bbb032brandServlet")
public class Bbb032brandServlet extends HttpServlet {
	private final Bbb031brandService demoService = new Bbb030BrandServiceImpl();
	// 我直接新建一个实现类，这样可以降低耦合性
	// 在实现类的逻辑和方法发生变化的时候
	// servlet中的代码不需要大量修改，提高开发的效率


	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		List<Bbb029TbBrand> bbb029TbBrands = demoService.selectAll();
		// Bbb029TbBrands
		String resultString = JSON.toJSONString(bbb029TbBrands);
		response.setContentType("text/html;charset=utf-8");
		response.getWriter().write(resultString);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doGet(request, response);
	}
}
