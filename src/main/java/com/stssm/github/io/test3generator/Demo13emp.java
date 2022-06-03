package com.stssm.github.io.test3generator;

import lombok.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com
 * User:  wo1261931780@gmail.com
 * Time:  2022-06-10-53  星期五
 */

/**
 * 员工表
 */
// @ApiModel(value = "员工表")
@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
// @TableName(value = "study001sql.demo13emp")
public class Demo13emp implements Serializable {
	public static final String COL_ID = "id";
	public static final String COL_EMP_NAME = "emp_name";
	public static final String COL_JOB_ID = "job_id";
	public static final String COL_SENIOR_LEADER = "senior_leader";
	public static final String COL_JOIN_DATE = "join_date";
	public static final String COL_SALARY = "salary";
	public static final String COL_BONUS = "bonus";
	public static final String COL_DEPT_ID = "dept_id";
	private static final long serialVersionUID = 1L;
	/**
	 * 员工id
	 */
	// @TableId(value = "id", type = IdType.INPUT)
	// @ApiModelProperty(value = "员工id")
	private Integer id;
	/**
	 * 员工姓名
	 */
	// @TableField(value = "emp_name")
	// @ApiModelProperty(value = "员工姓名")
	private String empName;
	/**
	 * 岗位id
	 */
	// @TableField(value = "job_id")
	// @ApiModelProperty(value = "岗位id")
	private Integer jobId;
	/**
	 * 上级领导
	 */
	// @TableField(value = "senior_leader")
	// @ApiModelProperty(value = "上级领导")
	private Integer seniorLeader;
	/**
	 * 入职日期
	 */
	// @TableField(value = "join_date")
	// @ApiModelProperty(value = "入职日期")
	private LocalDate joinDate;
	/**
	 * 薪资
	 */
	// @TableField(value = "salary")
	// @ApiModelProperty(value = "薪资")
	private BigDecimal salary;
	/**
	 * 奖金
	 */
	// @TableField(value = "bonus")
	// @ApiModelProperty(value = "奖金")
	private BigDecimal bonus;
	/**
	 * 部门id
	 */
	// @TableField(value = "dept_id")
	// @ApiModelProperty(value = "部门id")
	private Integer deptId;
}
