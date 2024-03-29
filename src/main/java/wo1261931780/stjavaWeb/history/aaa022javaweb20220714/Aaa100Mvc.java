package wo1261931780.stjavaWeb.history.aaa022javaweb20220714;

import static wo1261931780.stjavaWeb.history.aaa002jdbc20220531.Aaa001Demo.LOG_SHOW;

/**
 * Created by Intellij IDEA.
 * Project:jsp-demo
 * Package:com.itheima.web
 *
 * @param
 * @author liujiajun_junw
 * @Date 2022-07-21-37  星期五
 * @description
 * @return
 * @exception
 */
public class Aaa100Mvc {
	// MVC的三层模式，分别是控制器，数据模型和视图
	// 控制器，就是我们说的最多的接口
	// 数据模型就是model，我们使用的表格
	// view就是视图
	// 模型不一定是Javabean这种实体类，有的时候，model也是
	// 在实际开发中，jsp一般就是用来展示的
	// 像我们现在的项目，就是后端数据传递到前端，然后jsp负责数据的交互和展示
	// ----------------------------------------------
	// 数据访问层，就是我们说的持久层
	// 数据访问层，就是对数据加工，把数据从数据库取出来，交给逻辑层进行处理的操作
	// 一般就是各种dao和mapper
	// 主要是最数据库做CRUD的操作
	// ----------------------------------------------
	// 表现层，就是controller层，
	// 主要是接受前端请求，封装数据，
	// 主要是对外展示，作为数据访问的标准
	// ----------------------------------------------
	// 业务逻辑层，使我们使用最多的，主要就是处理逻辑，做业务代码的书写
	// 也就是一般的service层
	// ----------------------------------------------
	// springMVC，就是spring整个大框架下面的一个小项目
	// SSM就是，springMVC，对应表现层+spring，对应业务逻辑层+mybatis，对应数据访问层

	/**
	 * 测试
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		LOG_SHOW.debug("123");
	}
}
