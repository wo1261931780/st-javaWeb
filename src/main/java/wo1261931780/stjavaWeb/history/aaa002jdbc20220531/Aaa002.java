package wo1261931780.stjavaWeb.history.aaa002jdbc20220531;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import static wo1261931780.stjavaWeb.history.aaa002jdbc20220531.Aaa001Demo.LOG_SHOW;


/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:wo1261931780.stjavaWeb.history.aaa001JDBC
 * Bbb010User:  wo1261931780@gmail.com
 * Time:  2022-05-22-35  星期六
 *
 * @author 1
 */
public class Aaa002 {
	public static void main(final String[] args) {
		// 驱动注册可以直接省略
		// String mysqlUrl="jdbc:mysql://....../study001sql";
		// 中间省略了连接的名称
		// String mysqlUrl="jdbc:mysql:///study001sql";
		// 直接这样连接会出现安全提示，
		// 重新配置ssl需要经过复杂的操作，同时性能会下降20%左右
		final String mysqlUrl = "jdbc:mysql:///study001sql?useSSL=false";
		final String accName = "root";
		final String accPaw = "root";

		try (
				final Connection connection = DriverManager.getConnection(mysqlUrl, accName, accPaw);
				final Statement statement = connection.createStatement()
		) {
			final String sql = "update DEMO_13_EMP set salary='20222' where emp_name='任嘉伦' ";
			final int affectRow = statement.executeUpdate(sql);// statment是用来执行SQL的对象
			// 定义出来的所有SQL语句，都需要放到statement中执行出来
			LOG_SHOW.debug(String.valueOf(affectRow));
		} catch (final SQLException e) {
			e.printStackTrace();
		}
	}
}
