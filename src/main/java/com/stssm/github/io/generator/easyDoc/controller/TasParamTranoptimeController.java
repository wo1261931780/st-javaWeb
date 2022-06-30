// package com.stssm.github.io.generator.easyDoc.controller;
//
// import com.stssm.github.io.generator.easyDoc.entity.TasParamTranoptime;
// import com.stssm.github.io.generator.easyDoc.service.TasParamTranoptimeService;
// import org.springframework.http.ResponseEntity;
// import org.springframework.web.bind.annotation.*;
//
// import javax.annotation.Resource;
//
// /**
//  * 交易节点操作时长参数信息表(宁波项目测试表-后续会主动删除)(TasParamTranoptimeModel)表控制层
//  *
//  * @author makejava
//  * @since 2022-06-29 20:55:22
//  */
// @RestController
// @RequestMapping("tasParamTranoptime")
// public class TasParamTranoptimeController {
// 	/**
// 	 * 服务对象
// 	 */
// 	@Resource
// 	private TasParamTranoptimeService tasParamTranoptimeService;
//
// 	/**
// 	 * 分页查询
// 	 *
// 	 * @param tasParamTranoptime 筛选条件
// 	 * @param pageRequest        分页对象
// 	 * @return 查询结果
// 	 */
// 	// @GetMapping
// 	// public ResponseEntity<Page<TasParamTranoptimeModel>> queryByPage(TasParamTranoptimeModel tasParamTranoptime, PageRequest pageRequest) {
// 	// 	return ResponseEntity.ok(this.tasParamTranoptimeService.queryByPage(tasParamTranoptime, pageRequest));
// 	// }
//
// 	/**
// 	 * 通过主键查询单条数据
// 	 *
// 	 * @param id 主键
// 	 * @return 单条数据
// 	 */
// 	@GetMapping("{id}")
// 	public ResponseEntity<TasParamTranoptime> queryById(@PathVariable("id") String id) {
// 		return ResponseEntity.ok(this.tasParamTranoptimeService.queryById(id));
// 	}
//
// 	/**
// 	 * 新增数据
// 	 *
// 	 * @param tasParamTranoptime 实体
// 	 * @return 新增结果
// 	 */
// 	@PostMapping
// 	public ResponseEntity<TasParamTranoptime> add(TasParamTranoptime tasParamTranoptime) {
// 		return ResponseEntity.ok(this.tasParamTranoptimeService.insert(tasParamTranoptime));
// 	}
//
// 	/**
// 	 * 编辑数据
// 	 *
// 	 * @param tasParamTranoptime 实体
// 	 * @return 编辑结果
// 	 */
// 	@PutMapping
// 	public ResponseEntity<TasParamTranoptime> edit(TasParamTranoptime tasParamTranoptime) {
// 		return ResponseEntity.ok(this.tasParamTranoptimeService.update(tasParamTranoptime));
// 	}
//
// 	/**
// 	 * 删除数据
// 	 *
// 	 * @param id 主键
// 	 * @return 删除是否成功
// 	 */
// 	@DeleteMapping
// 	public ResponseEntity<Boolean> deleteById(String id) {
// 		return ResponseEntity.ok(this.tasParamTranoptimeService.deleteById(id));
// 	}
//
// }
