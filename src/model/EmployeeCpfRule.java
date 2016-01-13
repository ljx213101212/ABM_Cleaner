package model;

import java.util.Date;

import system.Value;

public class EmployeeCpfRule {
	private long employeeCpfRuleId;
	
	private long objStatus;
	private Date createDate;
	private String remark;
	
	private Employee employee;
	private CpfRule cpfRule;
	
	public EmployeeCpfRule(){}

	public EmployeeCpfRule(Employee employee, CpfRule cpfRule) {
		super();
		this.employee = employee;
		this.cpfRule = cpfRule;
		this.setObjStatus(Value.ACTIVED);
		this.setCreateDate(new Date());
	}

	/**
	 * @return the employeeCpfRuleId
	 */
	public long getEmployeeCpfRuleId() {
		return employeeCpfRuleId;
	}

	/**
	 * @param employeeCpfRuleId the employeeCpfRuleId to set
	 */
	public void setEmployeeCpfRuleId(long employeeCpfRuleId) {
		this.employeeCpfRuleId = employeeCpfRuleId;
	}

	/**
	 * @return the objStatus
	 */
	public long getObjStatus() {
		return objStatus;
	}

	/**
	 * @param objStatus the objStatus to set
	 */
	public void setObjStatus(long objStatus) {
		this.objStatus = objStatus;
	}

	/**
	 * @return the createDate
	 */
	public Date getCreateDate() {
		return createDate;
	}

	/**
	 * @param createDate the createDate to set
	 */
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	/**
	 * @return the remark
	 */
	public String getRemark() {
		return remark;
	}

	/**
	 * @param remark the remark to set
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}

	/**
	 * @return the employee
	 */
	public Employee getEmployee() {
		return employee;
	}

	/**
	 * @param employee the employee to set
	 */
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	/**
	 * @return the cpfRule
	 */
	public CpfRule getCpfRule() {
		return cpfRule;
	}

	/**
	 * @param cpfRule the cpfRule to set
	 */
	public void setCpfRule(CpfRule cpfRule) {
		this.cpfRule = cpfRule;
	}
	
	
}
