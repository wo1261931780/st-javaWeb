package wo1261931780.stjavaWeb.history.aaa006jdbc20220618;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import wo1261931780.stjavaWeb.history.aaa006jdbc20220618.mapper.DemoMapper0618;

import java.io.IOException;
import java.io.InputStream;

import static wo1261931780.stjavaWeb.history.aaa002jdbc20220531.Aaa001Demo.RESOURCE;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.javaweb.aaa004JDBC2022年6月17日
 * Bbb010User:  liujiajun_junw
 * Time:  2022-06-22-07  星期五
 *
 * @author liujiajun_junw
 */
public class Aaa021ProxyMapper {
	public static void main(String[] args) throws IOException {
		// String resource = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(RESOURCE);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		// *********************************************************************
		DemoMapper0618 resMapper = sqlSession.getMapper(DemoMapper0618.class);// 相当于这里获取了一个mapper对象
		// 对象有几个东西需要修改
		// 一个是xml文件，内部的空间名namespace必须指定到mapper的java文件存在的位置
		// 然后是resource目录下，必须有一个相同目录的xml文件，
		// 这样才能保证打包的时候xml文件和class文件在同个目录
		// 从而保证class文件可以直接定位到需要执行的xml文件
		// *********************************************************************
		// 然后在xml文件中，resultType返回的是pojo的对象类型
		// 在mybatis参数文件中，修改mapper标签的resource目录，为执行SQL的xml文件所在目录
		// *********************************************************************
		// List<DemoPojo0618> demoPojo0618s = resMapper.selectAll();// 让我刚刚拿到的mapper，去执行内部的方法
		// LOG_SHOW.debug(demoPojo0618s.toString());// 展示结果
		sqlSession.close();
		// 我们一般把mapper对应的xml成为statement
	}
}
