package wo1261931780.stjavaWeb.history.aaa020javaweb20220712;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import wo1261931780.stjavaWeb.history.aaa019javaweb20220711.pojo.User;

/**
 * Created by Intellij IDEA.
 * Project:show
 * Package:mapper
 *
 * @param
 * @author liujiajun_junw
 * @Date 2022-07-22-02  星期一
 * @description
 * @return
 * @exception
 */
public interface Aaa089loginMapper {
	/**
	 * 生成查询结果
	 *
	 * @param id
	 * @param paw
	 * @return
	 */
	@Select("select * from study002jdbc.account where id=#{id} and password=#{paw}")
	User login(@Param("id") String id, @Param("paw") String paw);

	/**
	 * 账号登录
	 *
	 * @param account
	 * @return
	 */
	@Select("select * from study002jdbc.account where id=#{account}")
	User queryByUserName(@Param("account") String account);

	/**
	 * 注册账号
	 *
	 * @param user
	 */
	@Insert("insert into study002jdbc.account values (#{account},#{paw})")
	void insert(User user);
}
