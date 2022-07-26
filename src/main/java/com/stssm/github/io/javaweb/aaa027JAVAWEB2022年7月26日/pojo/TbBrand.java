package com.stssm.github.io.javaweb.aaa027JAVAWEB2022年7月26日.pojo;

import java.io.Serializable;

/**
 * (TbBrand)实体类
 *
 * @author makejava
 * @since 2022-07-26 20:08:44
 */
public class TbBrand implements Serializable {
	private static final long serialVersionUID = -91601256641355210L;

	private Integer id;

	private String brandName;

	private String companyName;

	private Integer ordered;

	private String description;

	private Integer status;


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
