package wo1261931780.stjavaWeb.history.aaa004jdbc20220615;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import wo1261931780.stjavaWeb.history.aaa004jdbc20220615.pojo.Aaa012CaseBrand;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
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
public class Aaa016TestDemoTest {
	// @Test
	public void test() throws Exception {
		Properties prop = new Properties();
		prop.load(new FileInputStream("src/druid.properties"));
		DataSource dataSource = DruidDataSourceFactory.createDataSource(prop);
		// DataSource dataSource = DruidDataSourceFactory.createDataSource(src / druid.properties);

		Connection connection = dataSource.getConnection();
		// ******************************************************************************
		// String demoSql = "select  * from study002jdbc.tb_brand where brand_name like ?;";
		// String brName = "huawei";
		// preparedStatement.setString(1, brName);
		// 上面是我设置错误的，因为SQL没有查出数据，所以打印没有结果
		// ******************************************************************************
		String demoSql = "select  * from tb_brand ;";
		// 注意这里的SQL还必须带上分号收尾
		PreparedStatement preparedStatement = connection.prepareStatement(demoSql);

		ResultSet resultSet = preparedStatement.executeQuery();
		List<Aaa012CaseBrand> x = new ArrayList<>();
		Aaa012CaseBrand x1 = null;// 创建一个初始对象就可以，不需要在遍历中重复创建
		while (resultSet.next()) {
			// Aaa012CaseBrand x1 = new Aaa012CaseBrand();
			x1 = new Aaa012CaseBrand();
			LOG_SHOW.debug(resultSet.getString("brand_name"));
			x1.setId(resultSet.getInt("id"));
			x1.setStatus(resultSet.getInt("status"));
			x1.setOrdered(resultSet.getInt("ordered"));
			x1.setBrandName(resultSet.getString("brand_name"));
			x1.setCompanyName(resultSet.getString("company_name"));
			x1.setDescription(resultSet.getString("description"));
			x.add(x1);
		}
		resultSet.close();
		preparedStatement.close();
		connection.close();
		LOG_SHOW.debug(x.toString());
	}
}
