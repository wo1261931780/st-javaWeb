package com.stssm.github.io.javaweb.aaa007jdbc20220619.pojo;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.domain
 * bbb010User:  liujiajun_junw
 *
 * @author liujiajun_junw
 * Time:  2022-06-09-27  星期日
 */
public class TbBrand {
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
}
