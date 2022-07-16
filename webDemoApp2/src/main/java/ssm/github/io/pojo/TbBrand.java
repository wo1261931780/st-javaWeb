package ssm.github.io.pojo;

public class TbBrand {
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
	 * 订单顺序
	 */
	private Integer ordered;

	/**
	 * 描述
	 */
	private String description;

	/**
	 *
	 */
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
