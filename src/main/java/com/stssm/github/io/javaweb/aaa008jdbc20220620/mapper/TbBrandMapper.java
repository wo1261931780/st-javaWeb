package com.stssm.github.io.javaweb.aaa008jdbc20220620.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.Map;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.javaweb.mapper
 * Bbb010User:  liujiajun_junw
 *
 * @author liujiajun_junw
 * Time:  2022-06-20-36  星期一
 */
@Mapper
public interface TbBrandMapper {
	/**
	 * 根据id删除一条数据
	 *
	 * @param id
	 */
	void deleteById(int id);

	/**
	 * void deleteByIds(int[] ids);
	 * 上面是没有添加注解的，所以数组必须使用array来称呼
	 * 下面这里加上了注解，所以可以直接使用ids代表整个数组
	 */

	/**
	 * 批量删除数据
	 *
	 * @param ids
	 */
	void deleteByIds(@Param("ids") int[] ids);


	/**
	 * 这里解析一下mybatis的底层代码
	 * 首先，在多个参数的情况下，mybatis会将其设置为map集合
	 * 然后在map中，每个参数的设置过程是：
	 * map.put("arg0",参数1)--- map.put("param1",参数1)
	 * map.put("arg1",参数2)--- map.put("param2",参数2)
	 * map.put("arg2",参数3)--- map.put("param3",参数3)
	 * 直接看mybatis源码，这里有一个ParamNameResolver实现类，里面有个getNamedParams方法
	 * 这里，如果我没有设置@param来手动命名参数，也可以使用底层的参数来作为替代
	 * 相比上面的参数设置，
	 * map.put("id",参数1)--- map.put("param1",参数1)
	 * 如果我手动设置一个param注解，上面的arg0就会变成id
	 * --------------------------------------------------------
	 * 同理，如果我只有单个参数，比如单个对象就是我的参数，那么就不会被封装为map的形式
	 *
	 * @param id
	 * @param brandName
	 * @param companyName
	 * @return
	 */

	int selectTotal(@Param("id2") int id, @Param("brandName2") String brandName, @Param("companyName2") String companyName);


	/**
	 * 测试map
	 *
	 * @param map
	 * @return
	 */
	int mapCase(@Param("map") Map map);

	/**
	 * 测试接口
	 *
	 * @param id
	 */
	@Select("select * from mybatis.tb_brand where id=#{id};")
	void selectAnnotate(int id);


}
