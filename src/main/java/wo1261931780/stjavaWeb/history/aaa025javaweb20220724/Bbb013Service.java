package wo1261931780.stjavaWeb.history.aaa025javaweb20220724;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Intellij IDEA.
 * Project:ajax-demo
 * Package:com.itheima.web.servlet
 *
 * @param
 * @author liujiajun_junw
 * @Date 2022-07-11-14  星期日
 * @description
 * @return
 * @exception
 */
public class Bbb013Service {
	public List<Bbb015brandPojo> selectAll() {
		List<Bbb015brandPojo> demo = new ArrayList<>();
		Bbb015brandPojo bbb015brandPojo = new Bbb015brandPojo();
		bbb015brandPojo.setName("a1");
		bbb015brandPojo.setAge(11);
		bbb015brandPojo.setAddress("b1");
		Bbb015brandPojo bbb015BrandPojo2 = new Bbb015brandPojo();
		bbb015BrandPojo2.setName("a2");
		bbb015BrandPojo2.setAge(22);
		bbb015BrandPojo2.setAddress("b2");
		demo.add(bbb015brandPojo);
		demo.add(bbb015BrandPojo2);
		return demo;
	}


}
