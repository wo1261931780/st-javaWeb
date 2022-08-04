package com.stssm.github.io.javaweb.aaa004jdbc20220615.pojo;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.javaweb.aaa004jdbc20220615
 * Bbb010User:  wo1261931780@gmail.com
 * Time:  2022-06-21-48  星期三
 * @author liujiajun_junw
 */
public class Aaa012CaseBrand {
	// 数据库里面不区分大小写，所以必须使用下划线来区分
	/**
	 * 主键
	 */
	private Integer id;

	/**
	 * 品牌名称
	 */
	private String brandName;

	/**
	 * 公司名称
	 */
	private String companyName;

	/**
	 * 订单
	 */
	private Integer ordered;

	/**
	 * 描述
	 */
	private String description;

	/**
	 * 状态
	 */
	private Integer status;

	// 这种类，我们统一称为实体类
	// 在实体类中，统一将其按照包装类设置
	// 实体类的好处在于，不会带有默认值，进而不会对业务产生影响
	// 我们一般把实体类，丢到pojo中


	@Override
	public String toString() {
		return "Aaa012CaseBrand{" +
				       "id=" + id +
				       ", brandName='" + brandName + '\'' +
				       ", companyName='" + companyName + '\'' +
				       ", ordered=" + ordered +
				       ", description='" + description + '\'' +
				       ", status=" + status +
				       '}';
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public Integer getOrdered() {
		return ordered;
	}

	public void setOrdered(Integer ordered) {
		this.ordered = ordered;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}
}
