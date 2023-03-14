package wo1261931780.stjavaWeb.history.aaa019javaweb20220711.mapper;

import wo1261931780.stjavaWeb.history.aaa019javaweb20220711.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

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
public interface LoginMapper {
	/**
	 * 生成查询结果
	 * @param id
	 * @param paw
	 * @return 结果
	 */
	@Select("select *from study002jdbc.account where id=#{id} and password=#{paw}")
	User login(@Param("id") String id, @Param("paw") String paw);
}
