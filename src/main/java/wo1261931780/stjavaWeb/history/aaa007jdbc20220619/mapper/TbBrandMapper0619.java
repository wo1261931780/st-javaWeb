package wo1261931780.stjavaWeb.history.aaa007jdbc20220619.mapper;

import com.stssm.github.io.javaweb.aaa007jdbc20220619.pojo.TbBrand0619;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.mapper
 * Bbb010User:  liujiajun_junw
 * Time:  2022-06-09-27  星期日
 *
 * @author liujiajun_junw
 */
public interface TbBrandMapper0619 {

	/**
	 * 根据id定位具体结果
	 *
	 * @param id
	 * @return TbBrand类
	 */
	TbBrand0619 selectById(int id);

	/**
	 * 根据id进行查询
	 *
	 * @param id
	 * @return TbBrand0618
	 */
	TbBrand0619 selectByDy(int id);

	// List<Bbb029TbBrand> queryTotal();
	// 上面这些好像不能直接使用方法重载，如果使用了，会导致第一个被加载，后面的没有


	/**
	 * 注意一下，这里的param对应的是SQL中的参数占位符名称
	 * 比如companyName对应的是#{companyName}
	 * 而后面的String companyName，对应的是java中的变量名
	 *
	 * @param status
	 * @param companyName
	 * @param brandName
	 * @return 返回结果
	 */
	List<TbBrand0619> queryTotal(@Param("status") int status, @Param("companyName") String companyName, @Param("brandName") String brandName);

	/**
	 * 根据条件，查询所有数据
	 *
	 * @param tbBrand0619
	 * @return 返回TbBrand的集合
	 */
	List<TbBrand0619> queryTotal2(TbBrand0619 tbBrand0619);

	/**
	 * 根据map查询所有数据
	 *
	 * @param map
	 * @return 返回TbBrand集合
	 */
	List<TbBrand0619> queryTotal3(@Param("map") Map map);

	/**
	 * 根据map查询所有数据
	 *
	 * @param map
	 * @return 返回TbBrand集合
	 */
	List<TbBrand0619> queryTotal4(@Param("map")Map map);

	/**
	 * 根据map查询所有数据
	 *
	 * @param map
	 * @return 返回TbBrand集合
	 */
	List<TbBrand0619> queryTotal5(@Param("map")Map map);

	/**
	 * 根据map查询所有数据
	 *
	 * @param map
	 * @return 返回TbBrand集合
	 */
	List<TbBrand0619> queryTotal6(@Param("map")Map map);

	/**
	 * 根据条件查询所有数据
	 *
	 * @param tbBrand0619
	 * @return 返回TbBrand集合
	 */
	List<TbBrand0619> querySingleCondition(TbBrand0619 tbBrand0619);

	/**
	 * 根据条件新增一条数据
	 *
	 * @param tbBrand0619
	 * @return 返回TbBrand集合
	 */
	void mybatisInsert(TbBrand0619 tbBrand0619);

	/**
	 * 根据条件新增一条数据
	 *
	 * @param tbBrand0619
	 * @return 返回TbBrand集合
	 */
	void mybatisInsert2(TbBrand0619 tbBrand0619);

	/**
	 * 根据条件新增一条数据
	 *
	 * @param tbBrand0619
	 * @return 返回TbBrand集合
	 */
	int mybatisChange(TbBrand0619 tbBrand0619);

	/**
	 * 根据条件新增一条数据
	 *
	 * @param tbBrand0619
	 * @return 返回TbBrand集合
	 */
	int mybatisChange2(TbBrand0619 tbBrand0619);

	/**
	 * 查询数据（未完成）
	 *
	 * @param i
	 * @return 返回TbBrand集合
	 */
	void selectAnnotate(int i);
}
