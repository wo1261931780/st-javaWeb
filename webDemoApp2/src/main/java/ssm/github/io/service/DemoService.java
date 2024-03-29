package ssm.github.io.service;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import ssm.github.io.mapper.DemoMapper;
import ssm.github.io.pojo.TbBrand;
import ssm.github.io.util.SqLsessionFactoryUtil;

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
public class DemoService {
	/**
	 * 根据id进行查询
	 *
	 * @param id
	 * @return
	 */
	public static TbBrand selectById(int id) {
		SqlSessionFactory sqlSessionFactory = SqLsessionFactoryUtil.getSqlSessionFactory();
		SqlSession sqlSession = sqlSessionFactory.openSession();
		DemoMapper mapper = sqlSession.getMapper(DemoMapper.class);
		TbBrand tbBrand = mapper.selectById(id);
		sqlSession.close();
		return tbBrand;
	}

	/**
	 * 查询所有
	 *
	 * @return
	 */
	public List<TbBrand> selectAll() {
		SqlSessionFactory sqlSessionFactory = SqLsessionFactoryUtil.getSqlSessionFactory();
		SqlSession sqlSession = sqlSessionFactory.openSession();
		DemoMapper mapper = sqlSession.getMapper(DemoMapper.class);
		List<TbBrand> tbBrands = mapper.selectAll();
		sqlSession.close();
		return tbBrands;
	}

	/**
	 * 插入一条数据
	 *
	 * @param brand
	 */
	public void insertNewRecorde(TbBrand brand) {
		SqlSessionFactory sqlSessionFactory = SqLsessionFactoryUtil.getSqlSessionFactory();
		SqlSession sqlSession = sqlSessionFactory.openSession();
		DemoMapper mapper = sqlSession.getMapper(DemoMapper.class);
		mapper.addOne(brand);
		sqlSession.commit();// 增删改，最好都提交一些事物
		sqlSession.close();
	}


}
