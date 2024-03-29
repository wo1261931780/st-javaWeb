package wo1261931780.stjavaWeb;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;
import wo1261931780.stjavaWeb.history.aaa006jdbc20220618.mapper.BrandMapper0618;

import java.io.IOException;
import java.io.InputStream;

import static wo1261931780.stjavaWeb.history.aaa002jdbc20220531.Aaa001Demo.RESOURCE;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.junw
 * Bbb010User:  liujiajun_junw
 * Time:  2022-06-21-09  星期六
 */
public class bbb029TbBrandTest0618 {
	@Test
	public void demoShow() throws IOException {
		// String resource = "mybatis-config.xml";
		InputStream resourceAsStream = Resources.getResourceAsStream(RESOURCE);
		SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
		SqlSession sqlSession = build.openSession();
		BrandMapper0618 mapper = sqlSession.getMapper(BrandMapper0618.class);
		// List<TbBrand0618> tbBrand0618s = mapper.showRes();
		// LOG_SHOW.debug(tbBrand0618s.toString());
		sqlSession.close();
	}

	@Test
	public void demoShowById() throws IOException {
		// String resource = "mybatis-config.xml";
		String id = "1";
		InputStream resourceAsStream = Resources.getResourceAsStream(RESOURCE);
		SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
		SqlSession sqlSession = build.openSession();
		BrandMapper0618 mapper = sqlSession.getMapper(BrandMapper0618.class);
		// TbBrand0618 tbBrand0618 = mapper.selectById(Integer.parseInt(id));
		// LOG_SHOW.debug(String.valueOf(tbBrand0618));
		sqlSession.close();
	}
}
