package wo1261931780.stjavaWeb.history.aaa024javaweb20220723;

import static wo1261931780.stjavaWeb.history.aaa002jdbc20220531.Aaa001Demo.LOG_SHOW;

/**
 * Created by Intellij IDEA.
 * Project:ajax-demo
 * Package:com.itheima.web.servlet
 *
 * @param
 * @author liujiajun_junw
 * @Date 2022-07-20-46  星期六
 * @description
 * @return
 * @exception
 */
public class Bbb002 {
	// 类似注册和搜索，都是同步的请求，
	// 只要我使用了这个功能，那么页面就会根据我的要求去执行刷新等操作
	// 异步请求是在客户界面上看不到的
	// 但是后台会继续执行代码来获取数据
	public static void main(String[] args) {
		LOG_SHOW.debug("123");
	}
}
