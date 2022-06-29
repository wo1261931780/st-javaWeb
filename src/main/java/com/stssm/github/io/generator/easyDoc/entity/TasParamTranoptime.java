package com.stssm.github.io.generator.easyDoc.entity;

import java.io.Serializable;

/**
 * 交易节点操作时长参数信息表(宁波项目测试表-后续会主动删除)(TasParamTranoptime)实体类
 *
 * @author makejava
 * @since 2022-06-29 20:55:29
 */
public class TasParamTranoptime implements Serializable {
	private static final long serialVersionUID = -27327773675119562L;
	/**
	 * 主键
	 */
	private String id;
	/**
	 * 交易节点编码
	 */
	private String tranNodeCode;
	/**
	 * 交易类型编码，放空表示所有交易
	 */
	private String tranTypeCode;
	/**
	 * 当前节点时长
	 */
	private String optime;
	/**
	 * 当前节点中位数
	 */
	private String optimeMedian;
	/**
	 * 当前节点中位数（拓展）
	 */
	private String optimeMedianExt;
	/**
	 * 预估剩余操作时间 单位：分钟经办-->复核
	 */
	private String restTime;
	/**
	 * 单位：分钟小于这个时间就用黄色预警
	 */
	private String resttimeWarn;
	/**
	 * 拓展字段1
	 */
	private String ext1;
	/**
	 * 拓展字段2
	 */
	private String ext2;
	/**
	 * 启用标志，0-停用，1-启用
	 */
	private String enableFlag;
	/**
	 * 系统确认ID
	 */
	private String sysEntyId;
	/**
	 * 系统删除标识，默认为0
	 */
	private String sysDelFlg;
	/**
	 * 创建人
	 */
	private String sysCrtUser;
	/**
	 * 创建日期
	 */
	private String sysCrtDt;
	/**
	 * 最后编辑人
	 */
	private String sysModifyUser;
	/**
	 * 最后编辑日期
	 */
	private String sysModifyDt;


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTranNodeCode() {
		return tranNodeCode;
	}

	public void setTranNodeCode(String tranNodeCode) {
		this.tranNodeCode = tranNodeCode;
	}

	public String getTranTypeCode() {
		return tranTypeCode;
	}

	public void setTranTypeCode(String tranTypeCode) {
		this.tranTypeCode = tranTypeCode;
	}

	public String getOptime() {
		return optime;
	}

	public void setOptime(String optime) {
		this.optime = optime;
	}

	public String getOptimeMedian() {
		return optimeMedian;
	}

	public void setOptimeMedian(String optimeMedian) {
		this.optimeMedian = optimeMedian;
	}

	public String getOptimeMedianExt() {
		return optimeMedianExt;
	}

	public void setOptimeMedianExt(String optimeMedianExt) {
		this.optimeMedianExt = optimeMedianExt;
	}

	public String getRestTime() {
		return restTime;
	}

	public void setRestTime(String restTime) {
		this.restTime = restTime;
	}

	public String getResttimeWarn() {
		return resttimeWarn;
	}

	public void setResttimeWarn(String resttimeWarn) {
		this.resttimeWarn = resttimeWarn;
	}

	public String getExt1() {
		return ext1;
	}

	public void setExt1(String ext1) {
		this.ext1 = ext1;
	}

	public String getExt2() {
		return ext2;
	}

	public void setExt2(String ext2) {
		this.ext2 = ext2;
	}

	public String getEnableFlag() {
		return enableFlag;
	}

	public void setEnableFlag(String enableFlag) {
		this.enableFlag = enableFlag;
	}

	public String getSysEntyId() {
		return sysEntyId;
	}

	public void setSysEntyId(String sysEntyId) {
		this.sysEntyId = sysEntyId;
	}

	public String getSysDelFlg() {
		return sysDelFlg;
	}

	public void setSysDelFlg(String sysDelFlg) {
		this.sysDelFlg = sysDelFlg;
	}

	public String getSysCrtUser() {
		return sysCrtUser;
	}

	public void setSysCrtUser(String sysCrtUser) {
		this.sysCrtUser = sysCrtUser;
	}

	public String getSysCrtDt() {
		return sysCrtDt;
	}

	public void setSysCrtDt(String sysCrtDt) {
		this.sysCrtDt = sysCrtDt;
	}

	public String getSysModifyUser() {
		return sysModifyUser;
	}

	public void setSysModifyUser(String sysModifyUser) {
		this.sysModifyUser = sysModifyUser;
	}

	public String getSysModifyDt() {
		return sysModifyDt;
	}

	public void setSysModifyDt(String sysModifyDt) {
		this.sysModifyDt = sysModifyDt;
	}

}
