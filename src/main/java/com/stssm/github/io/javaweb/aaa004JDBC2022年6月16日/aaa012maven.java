package com.stssm.github.io.javaweb.aaa004JDBC2022年6月16日;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.st-ssm.github.io.javaweb.aaa004JDBC2022年6月16日
 * User:liujiajun_junw
 * Time:2022-06-20-52  星期四
 */
public class aaa012maven {
	public static void main(String[] args) {
		// maven创造的目的，在于统一所有不同ide的项目结构
		// 通过maven管理的项目，项目结构和层次都相同
		// 通过唯一标识，让不同的项目之间相互依赖
		// 举个例子：
		// <dependencies>
		// 注意这里是复数的形式
		// <dependency>
		// 这里就是单个依赖
		// 	<groupId>org.springframework.boot</groupId>
		// 这里就是告诉你，你的依赖包是谁出品的
		// 	<artifactId>spring-boot-starter-web</artifactId>
		// 这里是具体的依赖包，根据英文名，也可以理解为工件
		// </dependency>
		// </dependencies>
		// *********************************************************************
		// maven一个重要概念就是仓库
		// 类似我上面这样，获取都是直接拿远程仓库里面的依赖包
		// 但是总的来说，maven的仓库一共有三种
		// 远程，私服，本地
		// 我们项目寻找依赖，都是在本地寻找，如果本地没有，才会到远程仓库去寻找对应的jar包
		// 这里，定位到远程仓库的过程，就是下载依赖的过程
		// 因为依赖下载过来，也是存放到本地，也是本地调用
		// *********************************************************************
		// 这里讲了一下maven的本地仓库
		// 如果我们不配置，本地的默认仓库就是.m2
		// 这个一般在c盘里面
		// 我们要配置本地的仓库，直接在setting.xml中修改对应的位置就可以
		// *********************************************************************


	}
}
