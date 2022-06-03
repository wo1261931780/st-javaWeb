package com.stssm.github.io.javaweb.generator.test3generator;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com
 * User:  wo1261931780@gmail.com
 * Time:  2022-06-10-53  星期五
 */
public class Demo13empExample {
	protected String orderByClause;

	protected boolean distinct;

	protected List<Criteria> oredCriteria;

	public Demo13empExample() {
		this.oredCriteria = new ArrayList<>();
	}

	public String getOrderByClause() {
		return this.orderByClause;
	}

	public void setOrderByClause(final String orderByClause) {
		this.orderByClause = orderByClause;
	}

	public boolean isDistinct() {
		return this.distinct;
	}

	public void setDistinct(final boolean distinct) {
		this.distinct = distinct;
	}

	public List<Criteria> getOredCriteria() {
		return this.oredCriteria;
	}

	public void or(final Criteria criteria) {
		this.oredCriteria.add(criteria);
	}

	public Criteria or() {
		final Criteria criteria = Demo13empExample.createCriteriaInternal();
		this.oredCriteria.add(criteria);
		return criteria;
	}

	protected static Criteria createCriteriaInternal() {
		final Criteria criteria = new Criteria();
		return criteria;
	}

	public Criteria createCriteria() {
		final Criteria criteria = Demo13empExample.createCriteriaInternal();
		if (this.oredCriteria.size() == 0) {
			this.oredCriteria.add(criteria);
		}
		return criteria;
	}

	public void clear() {
		this.oredCriteria.clear();
		this.orderByClause = null;
		this.distinct = false;
	}

	protected abstract static class GeneratedCriteria {
		protected List<Criterion> criteria;

		protected GeneratedCriteria() {
			super();
			this.criteria = new ArrayList<>();
		}

		public boolean isValid() {
			return this.criteria.size() > 0;
		}

		public List<Criterion> getAllCriteria() {
			return this.criteria;
		}

		public List<Criterion> getCriteria() {
			return this.criteria;
		}

		public Criteria andIdIsNull() {
			this.addCriterion("id is null");
			return (Criteria) this;
		}

		protected void addCriterion(final String condition) {
			if (condition == null) {
				throw new RuntimeException("Value for condition cannot be null");
			}
			this.criteria.add(new Criterion(condition));
		}

		public Criteria andIdIsNotNull() {
			this.addCriterion("id is not null");
			return (Criteria) this;
		}

		public Criteria andIdEqualTo(final Integer value) {
			this.addCriterion("id =", value, "id");
			return (Criteria) this;
		}

		protected void addCriterion(final String condition, final Object value, final String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property + " cannot be null");
			}
			this.criteria.add(new Criterion(condition, value));
		}

		public Criteria andIdNotEqualTo(final Integer value) {
			this.addCriterion("id <>", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThan(final Integer value) {
			this.addCriterion("id >", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThanOrEqualTo(final Integer value) {
			this.addCriterion("id >=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThan(final Integer value) {
			this.addCriterion("id <", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThanOrEqualTo(final Integer value) {
			this.addCriterion("id <=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdIn(final List<Integer> values) {
			this.addCriterion("id in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotIn(final List<Integer> values) {
			this.addCriterion("id not in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdBetween(final Integer value1, final Integer value2) {
			this.addCriterion("id between", value1, value2, "id");
			return (Criteria) this;
		}

		protected void addCriterion(final String condition, final Object value1, final Object value2, final String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property + " cannot be null");
			}
			this.criteria.add(new Criterion(condition, value1, value2));
		}

		public Criteria andIdNotBetween(final Integer value1, final Integer value2) {
			this.addCriterion("id not between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andEmpNameIsNull() {
			this.addCriterion("emp_name is null");
			return (Criteria) this;
		}

		public Criteria andEmpNameIsNotNull() {
			this.addCriterion("emp_name is not null");
			return (Criteria) this;
		}

		public Criteria andEmpNameEqualTo(final String value) {
			this.addCriterion("emp_name =", value, "empName");
			return (Criteria) this;
		}

		public Criteria andEmpNameNotEqualTo(final String value) {
			this.addCriterion("emp_name <>", value, "empName");
			return (Criteria) this;
		}

		public Criteria andEmpNameGreaterThan(final String value) {
			this.addCriterion("emp_name >", value, "empName");
			return (Criteria) this;
		}

		public Criteria andEmpNameGreaterThanOrEqualTo(final String value) {
			this.addCriterion("emp_name >=", value, "empName");
			return (Criteria) this;
		}

		public Criteria andEmpNameLessThan(final String value) {
			this.addCriterion("emp_name <", value, "empName");
			return (Criteria) this;
		}

		public Criteria andEmpNameLessThanOrEqualTo(final String value) {
			this.addCriterion("emp_name <=", value, "empName");
			return (Criteria) this;
		}

		public Criteria andEmpNameLike(final String value) {
			this.addCriterion("emp_name like", value, "empName");
			return (Criteria) this;
		}

		public Criteria andEmpNameNotLike(final String value) {
			this.addCriterion("emp_name not like", value, "empName");
			return (Criteria) this;
		}

		public Criteria andEmpNameIn(final List<String> values) {
			this.addCriterion("emp_name in", values, "empName");
			return (Criteria) this;
		}

		public Criteria andEmpNameNotIn(final List<String> values) {
			this.addCriterion("emp_name not in", values, "empName");
			return (Criteria) this;
		}

		public Criteria andEmpNameBetween(final String value1, final String value2) {
			this.addCriterion("emp_name between", value1, value2, "empName");
			return (Criteria) this;
		}

		public Criteria andEmpNameNotBetween(final String value1, final String value2) {
			this.addCriterion("emp_name not between", value1, value2, "empName");
			return (Criteria) this;
		}

		public Criteria andJobIdIsNull() {
			this.addCriterion("job_id is null");
			return (Criteria) this;
		}

		public Criteria andJobIdIsNotNull() {
			this.addCriterion("job_id is not null");
			return (Criteria) this;
		}

		public Criteria andJobIdEqualTo(final Integer value) {
			this.addCriterion("job_id =", value, "jobId");
			return (Criteria) this;
		}

		public Criteria andJobIdNotEqualTo(final Integer value) {
			this.addCriterion("job_id <>", value, "jobId");
			return (Criteria) this;
		}

		public Criteria andJobIdGreaterThan(final Integer value) {
			this.addCriterion("job_id >", value, "jobId");
			return (Criteria) this;
		}

		public Criteria andJobIdGreaterThanOrEqualTo(final Integer value) {
			this.addCriterion("job_id >=", value, "jobId");
			return (Criteria) this;
		}

		public Criteria andJobIdLessThan(final Integer value) {
			this.addCriterion("job_id <", value, "jobId");
			return (Criteria) this;
		}

		public Criteria andJobIdLessThanOrEqualTo(final Integer value) {
			this.addCriterion("job_id <=", value, "jobId");
			return (Criteria) this;
		}

		public Criteria andJobIdIn(final List<Integer> values) {
			this.addCriterion("job_id in", values, "jobId");
			return (Criteria) this;
		}

		public Criteria andJobIdNotIn(final List<Integer> values) {
			this.addCriterion("job_id not in", values, "jobId");
			return (Criteria) this;
		}

		public Criteria andJobIdBetween(final Integer value1, final Integer value2) {
			this.addCriterion("job_id between", value1, value2, "jobId");
			return (Criteria) this;
		}

		public Criteria andJobIdNotBetween(final Integer value1, final Integer value2) {
			this.addCriterion("job_id not between", value1, value2, "jobId");
			return (Criteria) this;
		}

		public Criteria andSeniorLeaderIsNull() {
			this.addCriterion("senior_leader is null");
			return (Criteria) this;
		}

		public Criteria andSeniorLeaderIsNotNull() {
			this.addCriterion("senior_leader is not null");
			return (Criteria) this;
		}

		public Criteria andSeniorLeaderEqualTo(final Integer value) {
			this.addCriterion("senior_leader =", value, "seniorLeader");
			return (Criteria) this;
		}

		public Criteria andSeniorLeaderNotEqualTo(final Integer value) {
			this.addCriterion("senior_leader <>", value, "seniorLeader");
			return (Criteria) this;
		}

		public Criteria andSeniorLeaderGreaterThan(final Integer value) {
			this.addCriterion("senior_leader >", value, "seniorLeader");
			return (Criteria) this;
		}

		public Criteria andSeniorLeaderGreaterThanOrEqualTo(final Integer value) {
			this.addCriterion("senior_leader >=", value, "seniorLeader");
			return (Criteria) this;
		}

		public Criteria andSeniorLeaderLessThan(final Integer value) {
			this.addCriterion("senior_leader <", value, "seniorLeader");
			return (Criteria) this;
		}

		public Criteria andSeniorLeaderLessThanOrEqualTo(final Integer value) {
			this.addCriterion("senior_leader <=", value, "seniorLeader");
			return (Criteria) this;
		}

		public Criteria andSeniorLeaderIn(final List<Integer> values) {
			this.addCriterion("senior_leader in", values, "seniorLeader");
			return (Criteria) this;
		}

		public Criteria andSeniorLeaderNotIn(final List<Integer> values) {
			this.addCriterion("senior_leader not in", values, "seniorLeader");
			return (Criteria) this;
		}

		public Criteria andSeniorLeaderBetween(final Integer value1, final Integer value2) {
			this.addCriterion("senior_leader between", value1, value2, "seniorLeader");
			return (Criteria) this;
		}

		public Criteria andSeniorLeaderNotBetween(final Integer value1, final Integer value2) {
			this.addCriterion("senior_leader not between", value1, value2, "seniorLeader");
			return (Criteria) this;
		}

		public Criteria andJoinDateIsNull() {
			this.addCriterion("join_date is null");
			return (Criteria) this;
		}

		public Criteria andJoinDateIsNotNull() {
			this.addCriterion("join_date is not null");
			return (Criteria) this;
		}

		public Criteria andJoinDateEqualTo(final LocalDate value) {
			this.addCriterion("join_date =", value, "joinDate");
			return (Criteria) this;
		}

		public Criteria andJoinDateNotEqualTo(final LocalDate value) {
			this.addCriterion("join_date <>", value, "joinDate");
			return (Criteria) this;
		}

		public Criteria andJoinDateGreaterThan(final LocalDate value) {
			this.addCriterion("join_date >", value, "joinDate");
			return (Criteria) this;
		}

		public Criteria andJoinDateGreaterThanOrEqualTo(final LocalDate value) {
			this.addCriterion("join_date >=", value, "joinDate");
			return (Criteria) this;
		}

		public Criteria andJoinDateLessThan(final LocalDate value) {
			this.addCriterion("join_date <", value, "joinDate");
			return (Criteria) this;
		}

		public Criteria andJoinDateLessThanOrEqualTo(final LocalDate value) {
			this.addCriterion("join_date <=", value, "joinDate");
			return (Criteria) this;
		}

		public Criteria andJoinDateIn(final List<LocalDate> values) {
			this.addCriterion("join_date in", values, "joinDate");
			return (Criteria) this;
		}

		public Criteria andJoinDateNotIn(final List<LocalDate> values) {
			this.addCriterion("join_date not in", values, "joinDate");
			return (Criteria) this;
		}

		public Criteria andJoinDateBetween(final LocalDate value1, final LocalDate value2) {
			this.addCriterion("join_date between", value1, value2, "joinDate");
			return (Criteria) this;
		}

		public Criteria andJoinDateNotBetween(final LocalDate value1, final LocalDate value2) {
			this.addCriterion("join_date not between", value1, value2, "joinDate");
			return (Criteria) this;
		}

		public Criteria andSalaryIsNull() {
			this.addCriterion("salary is null");
			return (Criteria) this;
		}

		public Criteria andSalaryIsNotNull() {
			this.addCriterion("salary is not null");
			return (Criteria) this;
		}

		public Criteria andSalaryEqualTo(final BigDecimal value) {
			this.addCriterion("salary =", value, "salary");
			return (Criteria) this;
		}

		public Criteria andSalaryNotEqualTo(final BigDecimal value) {
			this.addCriterion("salary <>", value, "salary");
			return (Criteria) this;
		}

		public Criteria andSalaryGreaterThan(final BigDecimal value) {
			this.addCriterion("salary >", value, "salary");
			return (Criteria) this;
		}

		public Criteria andSalaryGreaterThanOrEqualTo(final BigDecimal value) {
			this.addCriterion("salary >=", value, "salary");
			return (Criteria) this;
		}

		public Criteria andSalaryLessThan(final BigDecimal value) {
			this.addCriterion("salary <", value, "salary");
			return (Criteria) this;
		}

		public Criteria andSalaryLessThanOrEqualTo(final BigDecimal value) {
			this.addCriterion("salary <=", value, "salary");
			return (Criteria) this;
		}

		public Criteria andSalaryIn(final List<BigDecimal> values) {
			this.addCriterion("salary in", values, "salary");
			return (Criteria) this;
		}

		public Criteria andSalaryNotIn(final List<BigDecimal> values) {
			this.addCriterion("salary not in", values, "salary");
			return (Criteria) this;
		}

		public Criteria andSalaryBetween(final BigDecimal value1, final BigDecimal value2) {
			this.addCriterion("salary between", value1, value2, "salary");
			return (Criteria) this;
		}

		public Criteria andSalaryNotBetween(final BigDecimal value1, final BigDecimal value2) {
			this.addCriterion("salary not between", value1, value2, "salary");
			return (Criteria) this;
		}

		public Criteria andBonusIsNull() {
			this.addCriterion("bonus is null");
			return (Criteria) this;
		}

		public Criteria andBonusIsNotNull() {
			this.addCriterion("bonus is not null");
			return (Criteria) this;
		}

		public Criteria andBonusEqualTo(final BigDecimal value) {
			this.addCriterion("bonus =", value, "bonus");
			return (Criteria) this;
		}

		public Criteria andBonusNotEqualTo(final BigDecimal value) {
			this.addCriterion("bonus <>", value, "bonus");
			return (Criteria) this;
		}

		public Criteria andBonusGreaterThan(final BigDecimal value) {
			this.addCriterion("bonus >", value, "bonus");
			return (Criteria) this;
		}

		public Criteria andBonusGreaterThanOrEqualTo(final BigDecimal value) {
			this.addCriterion("bonus >=", value, "bonus");
			return (Criteria) this;
		}

		public Criteria andBonusLessThan(final BigDecimal value) {
			this.addCriterion("bonus <", value, "bonus");
			return (Criteria) this;
		}

		public Criteria andBonusLessThanOrEqualTo(final BigDecimal value) {
			this.addCriterion("bonus <=", value, "bonus");
			return (Criteria) this;
		}

		public Criteria andBonusIn(final List<BigDecimal> values) {
			this.addCriterion("bonus in", values, "bonus");
			return (Criteria) this;
		}

		public Criteria andBonusNotIn(final List<BigDecimal> values) {
			this.addCriterion("bonus not in", values, "bonus");
			return (Criteria) this;
		}

		public Criteria andBonusBetween(final BigDecimal value1, final BigDecimal value2) {
			this.addCriterion("bonus between", value1, value2, "bonus");
			return (Criteria) this;
		}

		public Criteria andBonusNotBetween(final BigDecimal value1, final BigDecimal value2) {
			this.addCriterion("bonus not between", value1, value2, "bonus");
			return (Criteria) this;
		}

		public Criteria andDeptIdIsNull() {
			this.addCriterion("dept_id is null");
			return (Criteria) this;
		}

		public Criteria andDeptIdIsNotNull() {
			this.addCriterion("dept_id is not null");
			return (Criteria) this;
		}

		public Criteria andDeptIdEqualTo(final Integer value) {
			this.addCriterion("dept_id =", value, "deptId");
			return (Criteria) this;
		}

		public Criteria andDeptIdNotEqualTo(final Integer value) {
			this.addCriterion("dept_id <>", value, "deptId");
			return (Criteria) this;
		}

		public Criteria andDeptIdGreaterThan(final Integer value) {
			this.addCriterion("dept_id >", value, "deptId");
			return (Criteria) this;
		}

		public Criteria andDeptIdGreaterThanOrEqualTo(final Integer value) {
			this.addCriterion("dept_id >=", value, "deptId");
			return (Criteria) this;
		}

		public Criteria andDeptIdLessThan(final Integer value) {
			this.addCriterion("dept_id <", value, "deptId");
			return (Criteria) this;
		}

		public Criteria andDeptIdLessThanOrEqualTo(final Integer value) {
			this.addCriterion("dept_id <=", value, "deptId");
			return (Criteria) this;
		}

		public Criteria andDeptIdIn(final List<Integer> values) {
			this.addCriterion("dept_id in", values, "deptId");
			return (Criteria) this;
		}

		public Criteria andDeptIdNotIn(final List<Integer> values) {
			this.addCriterion("dept_id not in", values, "deptId");
			return (Criteria) this;
		}

		public Criteria andDeptIdBetween(final Integer value1, final Integer value2) {
			this.addCriterion("dept_id between", value1, value2, "deptId");
			return (Criteria) this;
		}

		public Criteria andDeptIdNotBetween(final Integer value1, final Integer value2) {
			this.addCriterion("dept_id not between", value1, value2, "deptId");
			return (Criteria) this;
		}
	}

	public static class Criteria extends GeneratedCriteria {

		protected Criteria() {
			super();
		}
	}

	public static class Criterion {
		private final String condition;
		private final String typeHandler;
		private Object value;
		private Object secondValue;
		private boolean noValue;
		private boolean singleValue;
		private boolean betweenValue;
		private boolean listValue;

		protected Criterion(final String condition) {
			super();
			this.condition = condition;
			this.typeHandler = null;
			this.noValue = true;
		}

		protected Criterion(final String condition, final Object value) {
			this(condition, value, null);
		}

		protected Criterion(final String condition, final Object value, final String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.typeHandler = typeHandler;
			if (value instanceof List<?>) {
				this.listValue = true;
			} else {
				this.singleValue = true;
			}
		}

		protected Criterion(final String condition, final Object value, final Object secondValue) {
			this(condition, value, secondValue, null);
		}

		protected Criterion(final String condition, final Object value, final Object secondValue, final String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.secondValue = secondValue;
			this.typeHandler = typeHandler;
			this.betweenValue = true;
		}

		public String getCondition() {
			return this.condition;
		}

		public Object getValue() {
			return this.value;
		}

		public Object getSecondValue() {
			return this.secondValue;
		}

		public boolean isNoValue() {
			return this.noValue;
		}

		public boolean isSingleValue() {
			return this.singleValue;
		}

		public boolean isBetweenValue() {
			return this.betweenValue;
		}

		public boolean isListValue() {
			return this.listValue;
		}

		public String getTypeHandler() {
			return this.typeHandler;
		}
	}
}
