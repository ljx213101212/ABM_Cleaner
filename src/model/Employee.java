package model;

import java.util.Date;
import java.util.Set;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import system.Config;
import system.Key;
import system.Value;

public class Employee {
	private long employeeId;
	private String name;
	private String gender;
	private String race;
	private String contact;
	private String jobTitle;
	private Date dateOfBirth;
	private Date joinDate;
	private String photo;
	private String workingType; // 0 - full time; 1 - part time;
	private String passType; // 0 - local; 1 - PR; 2 - EP; 3 - SP; 4 - WP;
	private String passNo;
	// private long frequency; //0 - daily; 1 - monthly; 2 - bimonthly; 3 - weekly; 4 - biweekly;
	
	private long objStatus;
	private Date createDate;
	private String remark;
	
	private Set<EmployeeProject> employeeProjects;
	private Set<EmployeeEvent> employeeEvents;
	private Set<Payslip> payslips;
	private Set<CpfRule> cpfRules;
	private Set<Salary> salary;
	
	public Employee() {}

	public Employee(String name, String gender, String race, String contact, String jobTitle,
			Date dateOfBirth, Date joinDate, String workingType,
			String passType, String passNo) {
		super();
		this.name = name;
		this.gender = gender;
		this.race = race;
		this.jobTitle = jobTitle;
		this.dateOfBirth = dateOfBirth;
		this.joinDate = joinDate;
		this.workingType = workingType;
		this.passType = passType;
		this.passNo = passNo;
		this.setObjStatus(Value.ACTIVED);
		this.setCreateDate(new Date());
	}
	
	public Employee(String name, String gender, String race, String contact, String jobTitle,
			Date dateOfBirth, Date joinDate, String photo, String workingType,
			String passType, String passNo) {
		super();
		this.name = name;
		this.gender = gender;
		this.race = race;
		this.jobTitle = jobTitle;
		this.dateOfBirth = dateOfBirth;
		this.joinDate = joinDate;
		this.photo = photo;
		this.workingType = workingType;
		this.passType = passType;
		this.passNo = passNo;
		this.setObjStatus(Value.ACTIVED);
		this.setCreateDate(new Date());
	}

	/**
	 * @return the employeeId
	 */
	public long getEmployeeId() {
		return employeeId;
	}

	/**
	 * @param employeeId the employeeId to set
	 */
	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
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
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * @return the race
	 */
	public String getRace() {
		return race;
	}

	/**
	 * @param race the race to set
	 */
	public void setRace(String race) {
		this.race = race;
	}

	/**
	 * @return the contact
	 */
	public String getContact() {
		return contact;
	}

	/**
	 * @param contact the contact to set
	 */
	public void setContact(String contact) {
		this.contact = contact;
	}

	/**
	 * @return the jobTitle
	 */
	public String getJobTitle() {
		return jobTitle;
	}

	/**
	 * @param jobTitle the jobTitle to set
	 */
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	/**
	 * @return the dateOfBirth
	 */
	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	/**
	 * @param dateOfBirth the dateOfBirth to set
	 */
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	/**
	 * @return the joinDate
	 */
	public Date getJoinDate() {
		return joinDate;
	}

	/**
	 * @param joinDate the joinDate to set
	 */
	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}

	/**
	 * @return the photo
	 */
	public String getPhoto() {
		return photo;
	}

	/**
	 * @param photo the photo to set
	 */
	public void setPhoto(String photo) {
		this.photo = photo;
	}

	/**
	 * @return the workingType
	 */
	public String getWorkingType() {
		return workingType;
	}

	/**
	 * @param workingType the workingType to set
	 */
	public void setWorkingType(String workingType) {
		this.workingType = workingType;
	}

	/**
	 * @return the passType
	 */
	public String getPassType() {
		return passType;
	}

	/**
	 * @param passType the passType to set
	 */
	public void setPassType(String passType) {
		this.passType = passType;
	}

	/**
	 * @return the passNo
	 */
	public String getPassNo() {
		return passNo;
	}

	/**
	 * @param passNo the passNo to set
	 */
	public void setPassNo(String passNo) {
		this.passNo = passNo;
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

	/**
	 * @return the employeeEvents
	 */
	public Set<EmployeeEvent> getEmployeeEvents() {
		return employeeEvents;
	}

	/**
	 * @param employeeEvents the employeeEvents to set
	 */
	public void setEmployeeEvents(Set<EmployeeEvent> employeeEvents) {
		this.employeeEvents = employeeEvents;
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

	/**
	 * @return the cpfRules
	 */
	public Set<CpfRule> getCpfRules() {
		return cpfRules;
	}

	/**
	 * @param cpfRules the cpfRules to set
	 */
	public void setCpfRules(Set<CpfRule> cpfRules) {
		this.cpfRules = cpfRules;
	}

	/**
	 * @return the salary
	 */
	public Set<Salary> getSalary() {
		return salary;
	}

	/**
	 * @param salary the salary to set
	 */
	public void setSalary(Set<Salary> salary) {
		this.salary = salary;
	}
	
	/**
	 * Method
	 * */
	public JSONObject toJson() {
		JSONObject returnJson = new JSONObject();

		returnJson.put(Key.EMPLOYEEID, this.employeeId);
		returnJson.put(Key.NAME, this.name);
		returnJson.put(Key.GENDER, this.gender);
		returnJson.put(Key.RACE, this.race);
		returnJson.put(Key.CONTACT, this.contact);
		returnJson.put(Key.JOBTITLE, this.jobTitle);
		returnJson.put(Key.DATEOFBIRTH, this.dateOfBirth);
		returnJson.put(Key.JOINDATE, this.joinDate);
		returnJson.put(Key.PHOTO, this.photo);
		returnJson.put(Key.WORKINGTYPE, this.workingType);
		returnJson.put(Key.PASSTYPE, this.passType);
		returnJson.put(Key.PASSNO, this.passNo);
		returnJson.put(Key.CREATEDATE, Config.SDF.format(this.createDate));
		returnJson.put(Key.OBJSTATUS, this.objStatus);
		returnJson.put(Key.REMARK, this.remark);

		return returnJson;
	}
//	
//	public JSONObject toJsonTree(){
//		JSONObject returnJson = new JSONObject();
//		
//		returnJson.put(Key.EMPLOYEEID, this.employeeId);
//		returnJson.put(Key.SUPERVISORID, this.supervisorId);
//		returnJson.put(Key.NAME, this.name);
//		returnJson.put(Key.JOBTITLE, this.jobTitle);
//		
//		return returnJson;
//	}
//	
//	public JSONObject toJsonStrong() {
//		JSONObject returnJson = new JSONObject();
//
//		returnJson.put(Key.EMPLOYEEID, this.employeeId);
//		returnJson.put(Key.ADMIN, this.admin.toJson());
//		returnJson.put(Key.SUPERVISORID, this.supervisorId);
//		returnJson.put(Key.NAME, this.name);
//		returnJson.put(Key.JOBTITLE, this.jobTitle);
//		returnJson.put(Key.EMAIL, this.email);
//		returnJson.put(Key.AVATA, this.avata);
//		returnJson.put(Key.WORKINGTYPE, this.workingType);
//		returnJson.put(Key.PASSTYPE, this.passType);
//		returnJson.put(Key.PASSNO, this.passNo);
//		returnJson.put(Key.MONFREQUENCY, this.monFrequency);
//		returnJson.put(Key.WEEKFREQUENCY, this.weekFrequency);
//		returnJson.put(Key.DAYFREQUENCY, this.dayFrequency);
//		returnJson.put(Key.CREATEDATE, Config.SDF.format(this.createDate));
//		returnJson.put(Key.OBJSTATUS, this.objStatus);
//		returnJson.put(Key.REMARK, this.remark);
//
//		JSONArray payJArr = new JSONArray();
//		for (Payslip p : PayDAO.getListOfPayByEmployee(this)) {
//			payJArr.add(p.toJson());
//		}
//		returnJson.put(Key.PAYS, payJArr);
//
//		JSONArray employeePayslipJArr = new JSONArray();
//		for (EmployeePayslip ep : EmployeePayslipDAO.getEmployeePayslipsByEmployee(this)) {
//			employeePayslipJArr.add(ep.toJson());
//		}
//		returnJson.put(Key.EMPLOYEEPAYSLIPS, employeePayslipJArr);
//		
//		return returnJson;
//	}
}
