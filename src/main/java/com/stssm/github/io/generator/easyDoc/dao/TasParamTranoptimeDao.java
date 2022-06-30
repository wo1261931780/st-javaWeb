// package com.stssm.github.io.generator.easyDoc.dao;
//
// import com.stssm.github.io.generator.easyDoc.entity.TasParamTranoptime;
// import org.apache.ibatis.annotations.Param;
//
// import java.util.List;
//
// /**
//  * 交易节点操作时长参数信息表(宁波项目测试表-后续会主动删除)(TasParamTranoptimeModel)表数据库访问层
//  *
//  * @author makejava
//  * @since 2022-06-29 20:55:27
//  */
// public interface TasParamTranoptimeDao {
//
// 	/**
// 	 * 通过ID查询单条数据
// 	 *
// 	 * @param id 主键
// 	 * @return 实例对象
// 	 */
// 	TasParamTranoptime queryById(String id);
//
// 	/**
// 	 * 查询指定行数据
// 	 *
// 	 * @param tasParamTranoptime 查询条件
// 	 * @param pageable           分页对象
// 	 * @return 对象列表
// 	 */
// 	// List<TasParamTranoptimeModel> queryAllByLimit(TasParamTranoptimeModel tasParamTranoptime, @Param("pageable") Pageable pageable);
//
// 	/**
// 	 * 统计总行数
// 	 *
// 	 * @param tasParamTranoptime 查询条件
// 	 * @return 总行数
// 	 */
// 	long count(TasParamTranoptime tasParamTranoptime);
//
// 	/**
// 	 * 新增数据
// 	 *
// 	 * @param tasParamTranoptime 实例对象
// 	 * @return 影响行数
// 	 */
// 	int insert(TasParamTranoptime tasParamTranoptime);
//
// 	/**
// 	 * 批量新增数据（MyBatis原生foreach方法）
// 	 *
// 	 * @param entities List<TasParamTranoptimeModel> 实例对象列表
// 	 * @return 影响行数
// 	 */
// 	int insertBatch(@Param("entities") List<TasParamTranoptime> entities);
//
// 	/**
// 	 * 批量新增或按主键更新数据（MyBatis原生foreach方法）
// 	 *
// 	 * @param entities List<TasParamTranoptimeModel> 实例对象列表
// 	 * @return 影响行数
// 	 * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
// 	 */
// 	int insertOrUpdateBatch(@Param("entities") List<TasParamTranoptime> entities);
//
// 	/**
// 	 * 修改数据
// 	 *
// 	 * @param tasParamTranoptime 实例对象
// 	 * @return 影响行数
// 	 */
// 	int update(TasParamTranoptime tasParamTranoptime);
//
// 	/**
// 	 * 通过主键删除数据
// 	 *
// 	 * @param id 主键
// 	 * @return 影响行数
// 	 */
// 	int deleteById(String id);
//
// }
