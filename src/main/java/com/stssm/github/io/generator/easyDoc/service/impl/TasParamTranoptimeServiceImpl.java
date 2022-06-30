// package com.stssm.github.io.generator.easyDoc.service.impl;
//
// import com.stssm.github.io.generator.easyDoc.dao.TasParamTranoptimeDao;
// import com.stssm.github.io.generator.easyDoc.entity.TasParamTranoptime;
// import com.stssm.github.io.generator.easyDoc.service.TasParamTranoptimeService;
// import org.springframework.stereotype.Service;
//
// import javax.annotation.Resource;
//
// /**
//  * 交易节点操作时长参数信息表(宁波项目测试表-后续会主动删除)(TasParamTranoptimeModel)表服务实现类
//  *
//  * @author makejava
//  * @since 2022-06-29 20:55:31
//  */
// @Service("tasParamTranoptimeService")
// public class TasParamTranoptimeServiceImpl implements TasParamTranoptimeService {
// 	@Resource
// 	private TasParamTranoptimeDao tasParamTranoptimeDao;
//
// 	/**
// 	 * 通过ID查询单条数据
// 	 *
// 	 * @param id 主键
// 	 * @return 实例对象
// 	 */
// 	@Override
// 	public TasParamTranoptime queryById(String id) {
// 		return this.tasParamTranoptimeDao.queryById(id);
// 	}
//
// 	/**
// 	 * 分页查询
// 	 *
// 	 * @param tasParamTranoptime 筛选条件
// 	 * @param pageRequest        分页对象
// 	 * @return 查询结果
// 	 */
// 	// @Override
// 	// public Page<TasParamTranoptimeModel> queryByPage(TasParamTranoptimeModel tasParamTranoptime, PageRequest pageRequest) {
// 	// 	long total = this.tasParamTranoptimeDao.count(tasParamTranoptime);
// 	// 	return new PageImpl<>(this.tasParamTranoptimeDao.queryAllByLimit(tasParamTranoptime, pageRequest), pageRequest, total);
// 	// }
//
// 	/**
// 	 * 新增数据
// 	 *
// 	 * @param tasParamTranoptime 实例对象
// 	 * @return 实例对象
// 	 */
// 	@Override
// 	public TasParamTranoptime insert(TasParamTranoptime tasParamTranoptime) {
// 		this.tasParamTranoptimeDao.insert(tasParamTranoptime);
// 		return tasParamTranoptime;
// 	}
//
// 	/**
// 	 * 修改数据
// 	 *
// 	 * @param tasParamTranoptime 实例对象
// 	 * @return 实例对象
// 	 */
// 	@Override
// 	public TasParamTranoptime update(TasParamTranoptime tasParamTranoptime) {
// 		this.tasParamTranoptimeDao.update(tasParamTranoptime);
// 		return this.queryById(tasParamTranoptime.getId());
// 	}
//
// 	/**
// 	 * 通过主键删除数据
// 	 *
// 	 * @param id 主键
// 	 * @return 是否成功
// 	 */
// 	@Override
// 	public boolean deleteById(String id) {
// 		return this.tasParamTranoptimeDao.deleteById(id) > 0;
// 	}
// }
