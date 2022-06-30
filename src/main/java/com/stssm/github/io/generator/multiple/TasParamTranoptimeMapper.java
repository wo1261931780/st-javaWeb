// package com.stssm.github.io.generator.multiple;
//
// import org.apache.ibatis.annotations.Mapper;
// import org.apache.ibatis.annotations.Param;
//
// import java.util.List;
//
// /**
//  * Created by Intellij IDEA.
//  * Project:st-ssm.github.io
//  * Package:com.stssm.github.io.generator
//  *
//  * @param
//  * @author liujiajun_junw
//  * @Date 2022-06-20-58  星期三
//  * @description
//  * @return
//  * @exception
//  */
// @Mapper
// public interface TasParamTranoptimeMapper {
// 	/**
// 	 * delete by primary key
// 	 *
// 	 * @param id primaryKey
// 	 * @return deleteCount
// 	 */
// 	int deleteByPrimaryKey(String id);
//
// 	/**
// 	 * insert record to table
// 	 *
// 	 * @param record the record
// 	 * @return insert count
// 	 */
// 	int insert(TasParamTranoptimeModel record);
//
// 	int insertOrUpdate(TasParamTranoptimeModel record);
//
// 	int insertOrUpdateSelective(TasParamTranoptimeModel record);
//
// 	/**
// 	 * insert record to table selective
// 	 *
// 	 * @param record the record
// 	 * @return insert count
// 	 */
// 	int insertSelective(TasParamTranoptimeModel record);
//
// 	/**
// 	 * select by primary key
// 	 *
// 	 * @param id primary key
// 	 * @return object by primary key
// 	 */
// 	TasParamTranoptimeModel selectByPrimaryKey(String id);
//
// 	/**
// 	 * update record selective
// 	 *
// 	 * @param record the updated record
// 	 * @return update count
// 	 */
// 	int updateByPrimaryKeySelective(TasParamTranoptimeModel record);
//
// 	/**
// 	 * update record
// 	 *
// 	 * @param record the updated record
// 	 * @return update count
// 	 */
// 	int updateByPrimaryKey(TasParamTranoptimeModel record);
//
// 	int updateBatch(List<TasParamTranoptimeModel> list);
//
// 	int updateBatchSelective(List<TasParamTranoptimeModel> list);
//
// 	int batchInsert(@Param("list") List<TasParamTranoptimeModel> list);
// }
