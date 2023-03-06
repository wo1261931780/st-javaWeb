package wo1261931780.stjavaWeb.history.aaa020javaweb20220712.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

import static wo1261931780.stjavaWeb.history.aaa002jdbc20220531.Aaa001Demo.LOG_SHOW;
import static wo1261931780.stjavaWeb.history.aaa002jdbc20220531.Aaa001Demo.RESOURCE;

/**
 * Created by Intellij IDEA.
 * Project:show
 * Package:demo.util
 *
 * @param
 * @author liujiajun_junw
 * @Date 2022-07-21-24  星期二
 * @description
 * @return
 * @exception
 */
public class SqLsessionFactoryUtil {
	private static SqlSessionFactory sqlSessionFactory;// 提升作用域

	static {
		try {
			// String resource = "mybatis-config.xml";
			InputStream inputStream = Resources.getResourceAsStream(RESOURCE);
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	// 新建一个成员变量


	public SqLsessionFactoryUtil() {
		LOG_SHOW.debug("123");
	}

	public static SqlSessionFactory getSqlSessionFactory() {
		return sqlSessionFactory;
	}


}
