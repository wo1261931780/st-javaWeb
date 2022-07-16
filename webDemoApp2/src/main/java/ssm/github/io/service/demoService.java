package ssm.github.io.service;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import ssm.github.io.mapper.demoMapper;
import ssm.github.io.pojo.TbBrand;
import ssm.github.io.util.SQLsessionFactoryUtil;

import java.util.List;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:ssm.github.io.service
 *
 * @param
 * @author liujiajun_junw
 * @Date 2022-07-21-17  星期六
 * @description
 * @return
 * @exception
 */
public class demoService {

	public List<TbBrand> selectAll() {
		SqlSessionFactory sqlSessionFactory = SQLsessionFactoryUtil.getSqlSessionFactory();
		SqlSession sqlSession = sqlSessionFactory.openSession();
		demoMapper mapper = sqlSession.getMapper(demoMapper.class);
		List<TbBrand> tbBrands = mapper.selectAll();
		sqlSession.close();
		return tbBrands;
	}

	public void insertNewRecorde(TbBrand brand) {
		SqlSessionFactory sqlSessionFactory = SQLsessionFactoryUtil.getSqlSessionFactory();
		SqlSession sqlSession = sqlSessionFactory.openSession();
		demoMapper mapper = sqlSession.getMapper(demoMapper.class);
		mapper.addOne(brand);
		sqlSession.commit();// 增删改，最好都提交一些事物
		sqlSession.close();
	}


}
