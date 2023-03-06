package wo1261931780.stjavaWeb.history.aaa003jdbc20220602;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import static wo1261931780.stjavaWeb.history.aaa002jdbc20220531.Aaa001Demo.LOG_SHOW;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.javaweb.aaa003jdbc20220602
 * Bbb010User:  wo1261931780@gmail.com
 * Time:  2022-06-22-14  星期二
 *
 * @author liujiajun_junw
 */
public class Aaa008Case {
	public static void main(String[] args) {
		String paw = "root";
		String url = "jdbc:mysql:///study002jdbc?useSSL=false";
		String acc = "root";
		ArrayList<Aaa007Object> objects = new ArrayList<>();
		try (
				Connection connection = DriverManager.getConnection(url, acc, paw)
		) {
			String demoSql = "select * from demo1 where E_NAME is not null";
			ResultSet resultSet = connection.createStatement().executeQuery(demoSql);
			while (resultSet.next()) {
				int id = resultSet.getInt("id");
				String name = resultSet.getString("name");
				String price = resultSet.getString("price");
				Aaa007Object x = new Aaa007Object(String.valueOf(id), name, price);
				LOG_SHOW.debug(String.valueOf(objects.add(x)));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		LOG_SHOW.debug(String.valueOf(objects));
	}
}
