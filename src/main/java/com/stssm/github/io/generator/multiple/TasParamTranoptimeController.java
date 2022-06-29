package com.stssm.github.io.generator.multiple;

// import com.stssm.github.io.generator.TasParamTranoptimeServiceImplImpl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (mybatis.tas_param_tranoptime)表控制层
 *
 * @author xxxxx
 */
@RestController
@RequestMapping("/mybatis.tas_param_tranoptime")
public class TasParamTranoptimeController {
	/**
	 * 服务对象
	 */
	@Resource
	private TasParamTranoptimeServiceImpl tasParamTranoptimeServiceImpl;

	/**
	 * 通过主键查询单条数据
	 *
	 * @param id 主键
	 * @return 单条数据
	 */
	// @GetMapping("selectOne")
	// public TasParamTranoptime selectOne(Integer id) {
	// 	return tasParamTranoptimeServiceImpl.selectByPrimaryKey(id);
	// }

}
