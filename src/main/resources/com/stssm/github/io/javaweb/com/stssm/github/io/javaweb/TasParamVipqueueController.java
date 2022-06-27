package com.stssm.github.io.javaweb;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (tfb6ibs_dev.tas_param_vipqueue)表控制层
 *
 * @author xxxxx
 */
@RestController
@RequestMapping("/tfb6ibs_dev.tas_param_vipqueue")
public class TasParamVipqueueController {
	/**
	 * 服务对象
	 */
	@Resource
	private TasParamVipqueueService tasParamVipqueueService;

	/**
	 * 通过主键查询单条数据
	 *
	 * @param id 主键
	 * @return 单条数据
	 */
	@GetMapping("selectOne")
	public TasParamVipqueue selectOne(Integer id) {
		return tasParamVipqueueService.selectByPrimaryKey(id);
	}

}
