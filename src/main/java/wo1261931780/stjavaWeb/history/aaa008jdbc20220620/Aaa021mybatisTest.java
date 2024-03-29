package wo1261931780.stjavaWeb.history.aaa008jdbc20220620;

import wo1261931780.stjavaWeb.history.aaa008jdbc20220620.mapper.TbBrandMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

import static wo1261931780.stjavaWeb.history.aaa002jdbc20220531.Aaa001Demo.RESOURCE;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:wo1261931780.stjavaWeb.history.aaa005JDBC2022年6月20日
 * Bbb010User:  liujiajun_junw
 * @author liujiajun_junw
 * Time:  2022-06-22-46  星期一
 */
public class Aaa021mybatisTest {


	// @Test
	public void test() {
		// String resource = "mybatis-config.xml";
		Integer id2 = 15;
		try {
			InputStream resourceAsStream = Resources.getResourceAsStream(RESOURCE);
			SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
			SqlSession sqlSession = build.openSession(true);
			TbBrandMapper mapper = sqlSession.getMapper(TbBrandMapper.class);
			mapper.selectAnnotate(id2);


			sqlSession.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
