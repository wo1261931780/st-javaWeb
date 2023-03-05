package wo1261931780.stjavaWeb.history.aaa003jdbc20220602;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static com.stssm.github.io.javaweb.aaa002jdbc20220531.Aaa001Demo.LOG_SHOW;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.javaweb.aaa003jdbc20220602
 * Bbb010User:  wo1261931780@gmail.com
 * Time:  2022-06-22-38  星期二
 *
 * @author liujiajun_junw
 */
public class Aaa009proparedStatement {
	public static void main(String[] args) {
		// 这个类的作用是，预防SQL注入
		// SQL注入，简单来说，就是把SQL语句修改掉，然后登陆的时候输入任意代码都可以成功
		// 这个时候就会出现安全问题
		String paw = "root";
		String url = "jdbc:mysql:///study002jdbc?useSSL=false";
		String acc = "root";
		// ArrayList<Aaa007Object> objects = new ArrayList<>();
		try (
				Connection connection = DriverManager.getConnection(url, acc, paw);
				Statement statement = connection.createStatement()
		) {
			int id = 1;
			String password = "123";
			// String password = "' or '1' = '1";// 这里就是SQL注入
			// select * from study002jdbc.account where id='1' and password='' or '1' = '1'
			// 将一条完整的登录语句变成上面的样子，永远返回true，从而实现登录
			String demoSql = "select * from demo_14_bank_account where id='" + id + "' and balance='" + password + "'";
			ResultSet resultSet = statement.executeQuery(demoSql);
			LOG_SHOW.debug(String.valueOf(demoSql));
			LOG_SHOW.debug(resultSet.next() ? "登陆成功" : "登陆失败");

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
