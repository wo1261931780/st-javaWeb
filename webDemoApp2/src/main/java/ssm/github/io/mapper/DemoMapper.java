package ssm.github.io.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import ssm.github.io.pojo.TbBrand;

import java.util.List;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:ssm.github.io.mapper
 *
 * @param
 * @author liujiajun_junw
 * @Date 2022-07-21-12  星期六
 * @description
 * @return
 * @exception
 */
public interface DemoMapper {

	/**
	 * 我是测试
	 *
	 * @return 所有数据
	 */
	@Select("select * from tb_brand")
	@ResultMap("DemoMapper")
	List<TbBrand> selectAll();

	/**
	 * 新增一条数据
	 *
	 * @param brand
	 * @return 返回TbBrand的集合
	 */
	List<TbBrand> addOne(TbBrand brand);

	/**
	 * 根据id进行查询
	 *
	 * @param paramId
	 * @return 布尔类型结果
	 */
	@Select("select  * from tb_brand where id=#{paramId}")
	TbBrand selectById(@Param("paramId") int paramId);
}
