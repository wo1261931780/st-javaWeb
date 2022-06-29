package com.stssm.github.io.generator.multiple;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
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
@Service
public class TasParamTranoptimeServiceImpl implements TasParamTranoptimeService {

	@Resource
	private TasParamTranoptimeMapper tasParamTranoptimeMapper;

	@Override
	public int deleteByPrimaryKey(String id) {
		return tasParamTranoptimeMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(TasParamTranoptime record) {
		return tasParamTranoptimeMapper.insert(record);
	}

	@Override
	public int insertOrUpdate(TasParamTranoptime record) {
		return tasParamTranoptimeMapper.insertOrUpdate(record);
	}

	@Override
	public int insertOrUpdateSelective(TasParamTranoptime record) {
		return tasParamTranoptimeMapper.insertOrUpdateSelective(record);
	}

	@Override
	public int insertSelective(TasParamTranoptime record) {
		return tasParamTranoptimeMapper.insertSelective(record);
	}

	// @Override
	// public TasParamTranoptime selectByPrimaryKey(String id) {
	//     return tasParamTranoptimeMapper.selectByPrimaryKey(id);
	// }

	@Override
	public int updateByPrimaryKeySelective(TasParamTranoptime record) {
		return tasParamTranoptimeMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(TasParamTranoptime record) {
		return tasParamTranoptimeMapper.updateByPrimaryKey(record);
	}

	@Override
	public int updateBatch(List<TasParamTranoptime> list) {
		return tasParamTranoptimeMapper.updateBatch(list);
	}

	@Override
	public int updateBatchSelective(List<TasParamTranoptime> list) {
		return tasParamTranoptimeMapper.updateBatchSelective(list);
	}

	@Override
	public int batchInsert(List<TasParamTranoptime> list) {
		return tasParamTranoptimeMapper.batchInsert(list);
	}

}
