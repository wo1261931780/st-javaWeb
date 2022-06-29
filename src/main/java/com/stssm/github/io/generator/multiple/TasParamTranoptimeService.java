package com.stssm.github.io.generator.multiple;

import java.util.List;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.generator
 *
 * @param
 * @author liujiajun_junw
 * @Date 2022-06-20-58  星期三
 * @description
 * @return
 * @exception
 */
public interface TasParamTranoptimeService {


	int deleteByPrimaryKey(String id);

	int insert(TasParamTranoptime record);

	int insertOrUpdate(TasParamTranoptime record);

	int insertOrUpdateSelective(TasParamTranoptime record);

	int insertSelective(TasParamTranoptime record);

	// TasParamTranoptime selectByPrimaryKey(String id);

	int updateByPrimaryKeySelective(TasParamTranoptime record);

	int updateByPrimaryKey(TasParamTranoptime record);

	int updateBatch(List<TasParamTranoptime> list);

	int updateBatchSelective(List<TasParamTranoptime> list);

	int batchInsert(List<TasParamTranoptime> list);

}
