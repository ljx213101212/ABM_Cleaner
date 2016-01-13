package model;

import java.util.Date;
import java.util.Set;

import system.Value;

public class Payroll {
	private long payRollId;
	private Date payRollDate;
	
	private long objStatus;
	private Date createDate;
	private String remark;
	
	private Project project;
	private Set<Payslip> payslips;
	
	public Payroll (){}

	public Payroll(Project project, Date payRollDate) {
		super();
		this.project = project;
		this.payRollDate = payRollDate;
		this.setObjStatus(Value.ACTIVED);
		this.setCreateDate(new Date());
	}

	/**
	 * @return the payRollId
	 */
	public long getPayrollId() {
		return payRollId;
	}

	/**
	 * @param payRollId the payRollId to set
	 */
	public void setPayrollId(long payRollId) {
		this.payRollId = payRollId;
	}

	/**
	 * @return the payRollDate
	 */
	public Date getPayrollDate() {
		return payRollDate;
	}

	/**
	 * @param payRollDate the payRollDate to set
	 */
	public void setPayrollDate(Date payRollDate) {
		this.payRollDate = payRollDate;
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
	 * @return the project
	 */
	public Project getProject() {
		return project;
	}

	/**
	 * @param project the project to set
	 */
	public void setProject(Project project) {
		this.project = project;
	}

	/**
	 * @return the payslips
	 */
	public Set<Payslip> getPayslips() {
		return payslips;
	}

	/**
	 * @param payslips the payslips to set
	 */
	public void setPayslips(Set<Payslip> payslips) {
		this.payslips = payslips;
	}
	
	
}
