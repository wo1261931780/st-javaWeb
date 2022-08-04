package com.stssm.github.io.javaweb.aaa008jdbc20220620.pojo;

import java.io.Serializable;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.javaweb.model
 * bbb010User:  liujiajun_junw
 *
 * @author liujiajun_junw
 * Time:  2022-06-20-36  星期一
 */


public class TbBrand implements Serializable {
	public static final String COL_ID = "id";
	public static final String COL_BRAND_NAME = "brand_name";
	public static final String COL_COMPANY_NAME = "company_name";
	public static final String COL_ORDERED = "ordered";
	public static final String COL_DESCRIPTION = "description";
	public static final String COL_STATUS = "status";
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String brandName;
	private String companyName;
	private Integer ordered;
	private String description;
	private Integer status;

	@Override
	public String toString() {
		return "bbb029TbBrand{" +
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
