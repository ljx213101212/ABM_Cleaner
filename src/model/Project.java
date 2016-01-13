package model;

import java.util.Date;
import java.util.Set;

import system.Value;

public class Project {
	private long projectId;
	private String name;
	private String address;
	private Date startDate;
	private Date endDate;
	
	private long objStatus;
	private Date createDate;
	private String remark;
	
	private Admin admin;
	private Set<Payroll> payrolls;
	private Set<EmployeeProject> employeeProjects;
	
	public Project(){}

	public Project(Admin admin, String name, String address, Date startDate, long objStatus,
			Date createDate) {
		super();
		this.setAdmin(admin);
		this.name = name;
		this.address = address;
		this.startDate = startDate;
		this.setObjStatus(Value.ACTIVED);
		this.setCreateDate(new Date());
	}

	/**
	 * @return the projectId
	 */
	public long getProjectId() {
		return projectId;
	}

	/**
	 * @param projectId the projectId to set
	 */
	public void setProjectId(long projectId) {
		this.projectId = projectId;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the startDate
	 */
	public Date getStartDate() {
		return startDate;
	}

	/**
	 * @param startDate the startDate to set
	 */
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	/**
	 * @return the endDate
	 */
	public Date getEndDate() {
		return endDate;
	}

	/**
	 * @param endDate the endDate to set
	 */
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
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
	 * @return the admin
	 */
	public Admin getAdmin() {
		return admin;
	}

	/**
	 * @param admin the admin to set
	 */
	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

	/**
	 * @return the payRolls
	 */
	public Set<Payroll> getPayRolls() {
		return payrolls;
	}

	/**
	 * @param payrolls the payRolls to set
	 */
	public void setPayRolls(Set<Payroll> payrolls) {
		this.payrolls = payrolls;
	}

	/**
	 * @return the employeeProjects
	 */
	public Set<EmployeeProject> getEmployeeProjects() {
		return employeeProjects;
	}

	/**
	 * @param employeeProjects the employeeProjects to set
	 */
	public void setEmployeeProjects(Set<EmployeeProject> employeeProjects) {
		this.employeeProjects = employeeProjects;
	}
	
	
}
