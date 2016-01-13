package model;

import java.util.Date;
import java.util.Set;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import system.Config;
import system.Key;
import system.Value;

public class CpfRule {
	private long cpfRuleId;
	private String name;
	private long operator; // 1 - plus; 2 - minus; 3 - multiply;
	private long priority;
	private double value;
	private String description;
	private long objStatus;
	private Date createDate;
	private String remark;
	private Set<EmployeeCpfRule> employeeCpfRules;
	
	public CpfRule(){}
	
	public CpfRule(String name, long operator, long priority, double value, String description){
		this.setName(name);
		this.setOperator(operator);
		this.setPriority(priority);
		this.setValue(value);
		this.setDescription(description);
		this.setObjStatus(Value.ACTIVED);
		this.setCreateDate(new Date());
	}

	/**
	 * @return the cpfRuleId
	 */
	public long getCpfRuleId() {
		return cpfRuleId;
	}

	/**
	 * @param cpfRuleId the cpfRuleId to set
	 */
	public void setCpfRuleId(long cpfRuleId) {
		this.cpfRuleId = cpfRuleId;
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
	 * @return the operator
	 */
	public long getOperator() {
		return operator;
	}

	/**
	 * @param operator the operator to set
	 */
	public void setOperator(long operator) {
		this.operator = operator;
	}

	/**
	 * @return the priority
	 */
	public long getPriority() {
		return priority;
	}

	/**
	 * @param priority the priority to set
	 */
	public void setPriority(long priority) {
		this.priority = priority;
	}

	/**
	 * @return the value
	 */
	public double getValue() {
		return value;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(double value) {
		this.value = value;
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
	 * @return the employeeCpfRules
	 */
	public Set<EmployeeCpfRule> getEmployeeCpfRules() {
		return employeeCpfRules;
	}

	/**
	 * @param employeeCpfRules the employeeCpfRules to set
	 */
	public void setEmployeeCpfRules(Set<EmployeeCpfRule> employeeCpfRules) {
		this.employeeCpfRules = employeeCpfRules;
	}
	
//	public JSONObject toJson(){
//		JSONObject returnJson = new JSONObject();
//		
//		returnJson.put(Key.PAYSLIPID, this.cpfRuleId);
//		returnJson.put(Key.NAME, this.name);
//		returnJson.put(Key.OPERATOR, this.operator);
//		returnJson.put(Key.PRIORITY, this.priority);
//		returnJson.put(Key.VALUE, this.value);
//		returnJson.put(Key.DESCRIPTION, this.description);
//		returnJson.put(Key.OBJSTATUS, this.objStatus);
//		returnJson.put(Key.CREATEDATE, Config.SDF.format(this.createDate));
//		returnJson.put(Key.REMARK, this.remark);
//		
//		return returnJson;
//	}
	
	
//	public JSONObject toJsonStrong(){
//		JSONObject returnJson = new JSONObject();
//		
//		returnJson.put(Key.PAYSLIPID, this.cpfRuleId);
//		returnJson.put(Key.NAME, this.name);
//		returnJson.put(Key.OPERATOR, this.operator);
//		returnJson.put(Key.PRIORITY, this.priority);
//		returnJson.put(Key.VALUE, this.value);
//		returnJson.put(Key.DESCRIPTION, this.description);
//		returnJson.put(Key.OBJSTATUS, this.objStatus);
//		returnJson.put(Key.CREATEDATE, Config.SDF.format(this.createDate));
//		returnJson.put(Key.REMARK, this.remark);
//		
//		JSONArray payslipsJArr = new JSONArray();
//		for(Payslip ep : PayslipDAO.getPayslipsByPayslip(this)){
//			payslipsJArr.add(ep.toJson());
//		}
//		returnJson.put(Key.EMPLOYEEPAYSLIPS, payslipsJArr);
//		
//		return returnJson;
//	}


}
