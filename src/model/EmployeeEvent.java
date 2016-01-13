package model;

import java.util.Date;

import system.Value;

public class EmployeeEvent {
	private long employeeEventId;
	private String name;
	private long eventType; // 0 - absent, 1- sick leave, 2 - annual leave, 3 - others
	private String description;
	private String document; //one scan document can be store here, or any other better way to store documents?
	private Date startDate;
	private Date endDate;
	
	private long objStatus;
	private Date createDate;
	private String remark;
	
	private Employee employee;
	private Payslip payslip;
	
	public EmployeeEvent (){}

	public EmployeeEvent(String name, long eventType, String description,
			String document, Date startDate, Date endDate) {
		super();
		this.name = name;
		this.eventType = eventType;
		this.description = description;
		this.document = document;
		this.startDate = startDate;
		this.endDate = endDate;
		this.setObjStatus(Value.ACTIVED);
		this.setCreateDate(new Date());
	}

	/**
	 * @return the employeeEventId
	 */
	public long getEmployeeEventId() {
		return employeeEventId;
	}

	/**
	 * @param employeeEventId the employeeEventId to set
	 */
	public void setEmployeeEventId(long employeeEventId) {
		this.employeeEventId = employeeEventId;
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
	 * @return the eventType
	 */
	public long getEventType() {
		return eventType;
	}

	/**
	 * @param eventType the eventType to set
	 */
	public void setEventType(long eventType) {
		this.eventType = eventType;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the document
	 */
	public String getDocument() {
		return document;
	}

	/**
	 * @param document the document to set
	 */
	public void setDocument(String document) {
		this.document = document;
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
	 * @return the payslip
	 */
	public Payslip getPayslip() {
		return payslip;
	}

	/**
	 * @param payslip the payslip to set
	 */
	public void setPayslip(Payslip payslip) {
		this.payslip = payslip;
	}
	
	
}
