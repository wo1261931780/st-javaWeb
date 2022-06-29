package com.stssm.github.io.generator;

// import io.swagger.annotations.ApiModel;
// import io.swagger.annotations.ApiModelProperty;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;


@Data
public class TasParamTranoptime implements Serializable {
	private static final long serialVersionUID = 1L;
	/**
	 * 主键
	 */
	// @ApiModelProperty(value = "主键")
	private String id;
	/**
	 * 交易节点编码
	 */
	// @ApiModelProperty(value = "交易节点编码")
	private String tranNodeCode;
	/**
	 * 交易类型编码，放空表示所有交易
	 */
	// @ApiModelProperty(value = "交易类型编码，放空表示所有交易")
	private String tranTypeCode;
	/**
	 * 当前节点时长
	 */
	// @ApiModelProperty(value = "当前节点时长")
	private String optime;
	/**
	 * 当前节点中位数
	 */
	// @ApiModelProperty(value = "当前节点中位数")
	private String optimeMedian;
	/**
	 * 当前节点中位数（拓展）
	 */
	// @ApiModelProperty(value = "当前节点中位数（拓展）")
	private String optimeMedianExt;
	/**
	 * 预估剩余操作时间 单位：分钟经办-->复核
	 */
	// @ApiModelProperty(value = "预估剩余操作时间 单位：分钟经办-->复核 ")
	private String restTime;
	/**
	 * 单位：分钟小于这个时间就用黄色预警
	 */
	// @ApiModelProperty(value = "单位：分钟小于这个时间就用黄色预警")
	private String resttimeWarn;
	/**
	 * 拓展字段1
	 */
	// @ApiModelProperty(value = "拓展字段1")
	private String ext1;
	/**
	 * 拓展字段2
	 */
	// @ApiModelProperty(value = "拓展字段2")
	private String ext2;
	/**
	 * 启用标志，0-停用，1-启用
	 */
	// @ApiModelProperty(value = "启用标志，0-停用，1-启用")
	private String enableFlag;
	/**
	 * 系统确认ID
	 */
	// @ApiModelProperty(value = "系统确认ID")
	private String sysEntyId;
	/**
	 * 系统删除标识，默认为0
	 */
	// @ApiModelProperty(value = "系统删除标识，默认为0")
	private String sysDelFlg;
	/**
	 * 创建人
	 */
	// @ApiModelProperty(value = "创建人")
	private String sysCrtUser;
	/**
	 * 创建日期
	 */
	// @ApiModelProperty(value = "创建日期")
	private LocalDateTime sysCrtDt;
	/**
	 * 最后编辑人
	 */
	// @ApiModelProperty(value = "最后编辑人")
	private String sysModifyUser;
	/**
	 * 最后编辑日期
	 */
	// @ApiModelProperty(value = "最后编辑日期")
	private LocalDateTime sysModifyDt;
}
