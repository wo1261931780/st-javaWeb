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
public class bbb013service {
	public List<bbb015brandPojo> selectAll() {
		List<bbb015brandPojo> demo = new ArrayList<>();
		bbb015brandPojo bbb015brandPojo = new bbb015brandPojo();
		bbb015brandPojo.setName("a1");
		bbb015brandPojo.setAge(11);
		bbb015brandPojo.setAddress("b1");
		bbb015brandPojo bbb015BrandPojo2 = new bbb015brandPojo();
		bbb015BrandPojo2.setName("a2");
		bbb015BrandPojo2.setAge(22);
		bbb015BrandPojo2.setAddress("b2");
		demo.add(bbb015brandPojo);
		demo.add(bbb015BrandPojo2);
		return demo;
	}


}
