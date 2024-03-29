package wo1261931780.stjavaWeb.history.aaa002jdbc20220531;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:wo1261931780.stjavaWeb.history.aaaJDBC2022年5月31日
 * Bbb010User:  wo1261931780@gmail.com
 * Time:  2022-05-20-08  星期二
 *
 * @author liujiajun_junw
 */
public class Aaa001Demo {
	public static final String SPLICE = "****************************************************";
	public static final Logger LOG_SHOW = LoggerFactory.getLogger("Aaa001Demo.class");
	public static final String RESOURCE = "mybatis-config.xml";

	public static void main(final String[] args) throws Exception {

		// Class.forName("com.mysql.jdbc.Driver");
		// static {
		//     System.err.println("Loading class `com.mysql.jdbc.Driver'. This is deprecated. The new driver class is `com.mysql.cj.jdbc.Driver'. The driver is automatically registered via the SPI and manual loading of the driver class is generally unnecessary.");
		// }
		// ...本来是要使用java8的，jdk17已经将注册驱动的方法抛弃了
		// 在jdk5以后, 已经将注册驱动抛弃, 因为在驱动下面的service包中, 已经对其进行了处理
		// 甚至连这个for name都不太需要使用.

		final String url = "jdbc:mysql://127.0.0.1:3306/study001sql";// 固定格式的sql语法，协议
		final String user = "root";// mysql数据库的账号
		final String paw = "root";// 数据库的密码
		// 首先登录账号，获取连接
		try (
				final Connection connect = DriverManager.getConnection(url, user, paw)
				// getConnection，就相当于我用上面的参数来连接数据库
		) {
			final Statement statement = connect.createStatement();// 获取一个statement对象
			// String demoSql = "select * from demo13emp where emp_name is not null";
			final String demoSql = "update DEMO_13_EMP set salary='5000' where emp_name='任嘉伦'";
			final int affectRow = statement.executeUpdate(demoSql);// 数据库对象，执行对应的SQL语句
			String format = String.format("受影响的行数为：%s", affectRow);
			LOG_SHOW.debug(format);

			statement.close();
		}
	}
}
