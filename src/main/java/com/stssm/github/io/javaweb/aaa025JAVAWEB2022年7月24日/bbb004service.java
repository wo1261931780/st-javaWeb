package com.stssm.github.io.javaweb.aaa025JAVAWEB2022年7月24日;

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
public class bbb004service {
	public List<brandPojo> selectAll() {
		List<brandPojo> demo = new ArrayList<>();
		brandPojo brandPojo = new brandPojo();
		brandPojo.setName("a1");
		brandPojo.setAge(11);
		brandPojo.setAddress("b1");
		brandPojo brandPojo2 = new brandPojo();
		brandPojo2.setName("a2");
		brandPojo2.setAge(22);
		brandPojo2.setAddress("b2");
		demo.add(brandPojo);
		demo.add(brandPojo2);
		return demo;
	}


}
