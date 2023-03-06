package wo1261931780.stjavaWeb.history.aaa024javaweb20220723;

import org.apache.ibatis.session.SqlSessionFactory;
import wo1261931780.stjavaWeb.history.aaa027javaweb20220726.util.SqlSessionFactoryUtils;

/**
 * @author liujiajun_junw
 */
public class Bbb011UserService {
	SqlSessionFactory factory = SqlSessionFactoryUtils.getSqlSessionFactory();

	/**
	 * 登录方法
	 *
	 * @param username
	 * @param password
	 * @return
	 */

	// public Bbb010User login(String username, String password) {
	// // 2. 获取SqlSession
	// SqlSession sqlSession = factory.openSession();
	// // 3. 获取UserMapper
	// UserMapper mapper = sqlSession.getMapper(UserMapper.class);
	// // 4. 调用方法
	// Bbb010User User = mapper.select(username, password);
	//
	// // 释放资源
	// sqlSession.close();
	//
	// return User;
	// }


	/**
	 * 注册方法
	 *
	 * @return
	 */

	// public boolean register(Bbb010User User) {
	// 2. 获取SqlSession
	// SqlSession sqlSession = factory.openSession();
	// 3. 获取UserMapper
	// UserMapper mapper = sqlSession.getMapper(UserMapper.class);
	//
	// // 4. 判断用户名是否存在
	// Bbb010User u = mapper.selectByUsername(User.getUsername());

	// if (u == null) {
	// 	// 用户名不存在，注册
	// 	mapper.add(User);
	// 	sqlSession.commit();
	// }
	// sqlSession.close();
	//
	// return u == null;

	// }
}
