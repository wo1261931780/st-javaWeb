package com.stssm.github.io.javaweb.aaa029JAVAWEB2022年7月28日;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author liujiajun_junw
 */
public interface BrandMapper {

	/**
	 * 查询所有
	 *
	 * @return
	 */
	@Select("select * from tb_brand")
	@ResultMap("brandResultMap")
	List<Brand> selectAll();

	/**
	 * 添加数据
	 *
	 * @param brand
	 */
	@Insert("insert into tb_brand values(null,#{brandName},#{companyName},#{ordered},#{description},#{status})")
	void add(Brand brand);


	/**
	 * 批量删除
	 *
	 * @param ids
	 */
	void deleteByIds(@Param("ids") int[] ids);

	/**
	 * 分页查询
	 *
	 * @param begin
	 * @param size
	 * @return
	 */
	@Select("select * from tb_brand limit #{begin} , #{size}")
	@ResultMap("brandResultMap")
	List<Brand> selectByPage(@Param("begin") int begin, @Param("size") int size);

	/**
	 * 查询总记录数
	 *
	 * @return
	 */
	@Select("select count(*) from tb_brand ")
	int selectTotalCount();


	/**
	 * 分页条件查询
	 *
	 * @param begin
	 * @param size
	 * @param brand
	 * @return 品牌list
	 */
	List<Brand> selectByPageAndCondition(@Param("begin") int begin, @Param("size") int size, @Param("brand") Brand brand);

	/**
	 * 根据条件查询总记录数
	 * @param brand
	 * @return 0/1
	 */
	int selectTotalCountByCondition(Brand brand);


	// *********************************************************************

	/**
	 * 批量删除命令
	 *
	 * @param ids
	 * @return
	 */
	boolean delByList(@Param("ids") int[] ids);

	/**
	 * 查询所有的记录数量
	 *
	 * @param begin
	 * @param size
	 * @return
	 */
	@Select("select * from tb_brand limit #{begin} ,#{size};")
	List<Brand> selectAllData(@Param("begin") int begin, @Param("size") int size);


}
