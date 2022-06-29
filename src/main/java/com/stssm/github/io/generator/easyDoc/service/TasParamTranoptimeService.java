package com.stssm.github.io.generator.easyDoc.service;

import com.stssm.github.io.generator.easyDoc.entity.TasParamTranoptime;
// import org.springframework.data.domain.Page;
// import org.springframework.data.domain.PageRequest;

/**
 * 交易节点操作时长参数信息表(宁波项目测试表-后续会主动删除)(TasParamTranoptime)表服务接口
 *
 * @author makejava
 * @since 2022-06-29 20:55:30
 */
public interface TasParamTranoptimeService {

	/**
	 * 通过ID查询单条数据
	 *
	 * @param id 主键
	 * @return 实例对象
	 */
	TasParamTranoptime queryById(String id);

	/**
	 * 分页查询
	 *
	 * @param tasParamTranoptime 筛选条件
	 * @param pageRequest        分页对象
	 * @return 查询结果
	 */
	// Page<TasParamTranoptime> queryByPage(TasParamTranoptime tasParamTranoptime, PageRequest pageRequest);

	/**
	 * 新增数据
	 *
	 * @param tasParamTranoptime 实例对象
	 * @return 实例对象
	 */
	TasParamTranoptime insert(TasParamTranoptime tasParamTranoptime);

	/**
	 * 修改数据
	 *
	 * @param tasParamTranoptime 实例对象
	 * @return 实例对象
	 */
	TasParamTranoptime update(TasParamTranoptime tasParamTranoptime);

	/**
	 * 通过主键删除数据
	 *
	 * @param id 主键
	 * @return 是否成功
	 */
	boolean deleteById(String id);

}
