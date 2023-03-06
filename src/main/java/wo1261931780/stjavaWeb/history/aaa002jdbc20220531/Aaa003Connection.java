package wo1261931780.stjavaWeb.history.aaa002jdbc20220531;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import static wo1261931780.stjavaWeb.history.aaa002jdbc20220531.Aaa001Demo.LOG_SHOW;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.javaweb.aaaJDBC2022年5月31日
 * Bbb010User:  wo1261931780@gmail.com
 * Time:  2022-05-20-24  星期二
 *
 * @author 1
 */
public class Aaa003Connection {

	public static void main(final String[] args) throws Exception {
		final String url = "jdbc:mysql:///study001sql?useSSL=false";
		// 上面已经写了，但是重新提示一下，这里省略了localhost，简化写法
		final String loginName = "root";
		final String loginPassword = "root";

		final Connection connection = DriverManager.getConnection(url, loginName, loginPassword);
		final String sql1 = "update demo1 set E_NAME =2000 where id=1";

		try {
			connection.setAutoCommit(false);// 开启事物
			final Statement stat = connection.createStatement();
			final int res = stat.executeUpdate(sql1);
			String format = String.format("res的结果为：%s", res);
			LOG_SHOW.debug(format);
			connection.commit();// 提交事物
		} catch (final Exception e) {
			e.printStackTrace();
			// 在异常中进行事物的回滚操作
			connection.rollback();// 回滚事物
		}
	}
}
