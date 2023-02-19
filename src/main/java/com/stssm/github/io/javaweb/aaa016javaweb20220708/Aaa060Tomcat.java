package com.stssm.github.io.javaweb.aaa016javaweb20220708;

import static com.stssm.github.io.javaweb.aaa002jdbc20220531.Aaa001Demo.LOG_SHOW;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.javaweb.aaa015JDBC2022年7月8日
 *
 * @param
 * @author liujiajun_junw
 * @Date 2022-07-21-33  星期五
 * @description
 * @return
 * @exception
 */
public class Aaa060Tomcat {

	// Tomcat是开源免费的服务器软件，也属于Apache组织
	// 可以支持少量的javaee规范
	// 其中的EJB规范，我们后续会使用spring来替代
	// -----------------------------------------------------
	// 我们一般把Tomcat成为web容器，或者servlet容器
	// servlet就是一种动态的web资源，也就是一种java类
	// 但是servlet中，没有main方法，不能独立运行，需要web服务器才能运行，所以，我们将Tomcat称为web容器
	// 再说简单点，就是运行web的东西
	// -----------------------------------------------------
	// 企业中，使用最多最广泛的就是Tomcat8版本
	// 源代码的压缩，有linux和win两种
	// linux就是tar.gz，win对应的就是zip
	// -----------------------------------------------------
	// 为什么软件都在bin目录？
	// 因为bin就是batery二进制的缩写，我们直接在里面打开执行文件就可以
	// -----------------------------------------------------
	// 我们win目录下的可执行文件，就是bat，
	// 对应linux下，就是sh脚本文件，
	// temp就是临时文件存放的路径，
	// 我们一般把项目丢到webapps这里，作为我们项目的核心目录
	// -----------------------------------------------------
	// javaWeb项目，一般是作为war包进行打包操作
	// 一般在Tomcat中，都是webapp项目
	// -----------------------------------------------------
	// 一般webapp的配置文件，都放到web-inf中
	// maven根据项目的类型，在打包的时候也会自动按照对应的格式进行打包
	// 比如webapp，执行package操作，就会自动打包变成war包
	// war包，顾名思义，就是web开头的项目包

	public static void main(String[] args) {
		LOG_SHOW.debug("123");
	}
}
