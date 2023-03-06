package wo1261931780.stjavaWeb.history.aaa004jdbc20220615;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import org.junit.jupiter.api.Test;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Properties;

import static wo1261931780.stjavaWeb.history.aaa002jdbc20220531.Aaa001Demo.LOG_SHOW;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.javaweb.aaa004jdbc20220615.example
 * Bbb010User:  wo1261931780@gmail.com
 * Time:  2022-06-21-59  星期三
 *
 * @author liujiajun_junw
 */
public class Aaa019javaEeTestDemo3Test {
	@Test
	public void test() throws Exception {
		Properties prop = new Properties();
		prop.load(new FileInputStream("src/druid.properties"));
		DataSource dataSource = DruidDataSourceFactory.createDataSource(prop);
		Connection connection = dataSource.getConnection();
		// ******************************************************************************
		String brandName = "测试3";
		String companyName = "测试3";
		int ordered = 333;
		String description = "444";
		int status = 555;
		int id = 4;

		String demoSql = "update tb_brand set brand_name=? , company_name=? , ordered=? , description=? , status=? where id=?";
		PreparedStatement preparedStatement = connection.prepareStatement(demoSql);
		preparedStatement.setString(1, brandName);
		preparedStatement.setString(2, companyName);
		preparedStatement.setInt(3, ordered);
		preparedStatement.setString(4, description);
		preparedStatement.setInt(5, status);
		preparedStatement.setInt(6, id);

		int clomn = preparedStatement.executeUpdate();

		preparedStatement.close();
		connection.close();
		LOG_SHOW.debug("插入数据结果：" + (clomn == 1));
	}
}
