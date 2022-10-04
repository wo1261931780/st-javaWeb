package com.stssm.github.io.javaweb.aaa004jdbc20220615;


import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.sql.Connection;
import java.util.Properties;

import static com.stssm.github.io.javaweb.aaa002jdbc20220531.Aaa001Demo.LOG_SHOW;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.javaweb.aaa004jdbc20220615
 * Bbb010User:  wo1261931780@gmail.com
 * Time:  2022-06-20-54  星期三
 *
 * @author liujiajun_junw
 */
public class Aaa011connectPool {
	public static void main(String[] args) throws Exception {
		// 这里开始讲连接池
		// 连接池类似餐厅的门迎的存在
		// 不可能带客人进来以后，就直接开除人家，
		// 同样的道理，一个连接完成SQL以后，就需要重新回到连接池，等待下次的连接
		// 根据课堂描述
		// 当连接全部被占用的时候来了新的请求，
		// 连接池会主动检查所有的连接,如果连接在休眠,会强制断开,然后接受新的请求.
		// 也是我们所说的,避免数据库连接遗漏
		Properties prop = new Properties();
		prop.load(new FileInputStream("src/druid.properties"));
		// 需要添加来自内容根的路径
		DataSource dataSource = DruidDataSourceFactory.createDataSource(prop);
		// LOG_SHOW.debug(System.getProperty("User.dir"));

		LOG_SHOW.debug(dataSource.toString());
		// 一开始这里下错了jar包，导致加载不生效
		// {
		// 	CreateTime:"2022-06-15 21:33:49",
		// 	ActiveCount:0,
		// 	PoolingCount:0,
		// 	CreateCount:0,
		// 	DestroyCount:0,
		// 	CloseCount:0,
		// 	ConnectCount:0,
		// 	Connections:[
		// 	]
		// }
		Connection connection = dataSource.getConnection();
		String format = String.format("我是连接池的一个连接：%s", connection);
		LOG_SHOW.debug(format);
		// 结果是：
		// 21:35:24.850 [main] INFO com.alibaba.druid.pool.DruidDataSource - {dataSource-1} inited
		// 我是连接池的一个连接：com.mysql.cj.jdbc.ConnectionImpl@6a57ae10
	}
}
