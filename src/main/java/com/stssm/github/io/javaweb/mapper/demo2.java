package com.stssm.github.io.javaweb.mapper;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.javaweb.mapper
 *
 * @param
 * @author liujiajun_junw
 * @Date 2022-06-15-08  星期一
 * @description
 * @return
 * @exception
 */
public class demo2 {
	public static void main(String[] args) {
		demo d1 = new demo("1", 1);
		demo d2 = new demo("1", 2);
		demo d3 = new demo("3", 3);
		List<demo> l1 = new ArrayList<>();
		l1.add(d1);
		l1.add(d2);
		l1.add(d3);

		TreeSet<demo> x = new TreeSet<>();

	}
}
