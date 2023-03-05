package wo1261931780.stjavaWeb.history.aaa004jdbc20220615;

import com.alibaba.druid.pool.DruidDataSourceFactory;

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
public class Aaa013TestDemo2Test {
	// @Test
	public void test() throws Exception {
		Properties prop = new Properties();
		prop.load(new FileInputStream("src/druid.properties"));// 首先获取德鲁伊的配置
		DataSource dataSource = DruidDataSourceFactory.createDataSource(prop);// 创建数据库连接池对象
		Connection connection = dataSource.getConnection();
		// ******************************************************************************
		String brandName = "测试";
		String companyName = "测试2";
		int ordered = 333;
		String description = "";
		int status = 444;

		String demoSql = "insert into tb_brand(brand_name, company_name, ordered, description, status) values(?,?,?,?,?)";
		PreparedStatement preparedStatement = connection.prepareStatement(demoSql);
		preparedStatement.setString(1, brandName);
		preparedStatement.setString(2, companyName);
		preparedStatement.setInt(3, ordered);
		preparedStatement.setString(4, description);
		preparedStatement.setInt(5, status);

		int clomn = preparedStatement.executeUpdate();

		preparedStatement.close();
		connection.close();
		LOG_SHOW.debug("插入数据结果：" + (clomn == 1));
	}
}
