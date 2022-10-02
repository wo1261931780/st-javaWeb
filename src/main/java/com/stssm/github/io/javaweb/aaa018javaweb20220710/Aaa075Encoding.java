package com.stssm.github.io.javaweb.aaa018javaweb20220710;

import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

import static com.stssm.github.io.javaweb.aaa002jdbc20220531.Aaa001Demo.LOG_SHOW;

/**
 * Created by Intellij IDEA.
 * Project:show
 * Package:demo
 *
 * @param
 * @author liujiajun_junw
 * @Date 2022-07-13-10  星期日
 * @description
 * @return
 * @exception
 */
public class Aaa075Encoding {
	public static void main(String[] args) throws Exception {
		String x = "张三";
		String encode = URLEncoder.encode(x, "utf-8");
		LOG_SHOW.debug("我是编码以后的：" + encode);// 首先浏览器按照指定的格式进行解析
		// 然后将其传递给tomcat服务器
		// ---------------------------------------------------------------------

		// String decode = URLDecoder.decode(encode, "utf-8");
		String decode = URLDecoder.decode(encode, StandardCharsets.ISO_8859_1);// tomcat按照写死的格式进行解析
		LOG_SHOW.debug("我是解码以后的：" + decode);// 得到的数据产生了乱码
		// ---------------------------------------------------------------------

		byte[] bytes = decode.getBytes(StandardCharsets.ISO_8859_1);
		// 因为底层的字节是不变的，我们按照相同的格式，解析得到具体的字节数据
		// String s = new String(bytes, "UTF-8");
		String s = new String(bytes, StandardCharsets.UTF_8);// 比较规范的写法
		// 然后将其还原为字符串，就可以拿到我们想要的信息
		LOG_SHOW.debug(s);


	}
}
