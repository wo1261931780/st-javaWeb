package com.stssm.github.io.javaweb.aaa015javaweb20220707;

import static com.stssm.github.io.javaweb.aaa002jdbc20220531.Aaa001Demo.LOG_SHOW;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.javaweb.aaa015JDBC2022年7月7日
 *
 * @param
 * @author liujiajun_junw
 * @Date 2022-07-22-31  星期四
 * @description
 * @return
 * @exception
 */
public class Aaa059Http {
	// 现在我们来讲一下响应格式
	// 因为我们是服务端的开发人员，我们一般观察响应体的格式
	// -----------------------------------------------------
	// 首先是状态码的分类，我们一般分为五类
	// 从100-500
	// 每个类型的报错，可以观察到大致的错误类型
	// 这里有一个缓存的问题
	// max-cache，表示我的缓存可以保留多久，
	// 根据保留时间，我后续访问的时候，就不需要再次请求，直接读取本地的缓存就可以
	// -----------------------------------------------------
	// 重定向，我当前的数据已经发送到另一个地方，
	// 需要在新的地方去寻找具体的资源，然后响应出来
	// 我们常见的状态码就是200，请求成功
	// 403，没有权限访问资源
	// 404，请求内容错误，或者是不存在相关资源
	// 428/429/431，都是新版的http协议对应的响应结果

	public static void main(String[] args) {
		LOG_SHOW.debug("123");
	}


}
