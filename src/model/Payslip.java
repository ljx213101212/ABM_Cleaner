package model;

import java.util.Date;

import org.json.simple.JSONObject;

import system.Config;
import system.Key;
import system.Value;

public class Payslip {
	private long payslipId;
	private double salaryAmt;
	private double additionAmt;
	private double deductionAmt;
	private Date payslipDate;
	
	private long objStatus;
	private Date createDate;
	private String remark;
	
	private Employee employee;
	private Payroll payroll;
	
	public Payslip(){}
	
	public Payslip(Employee employee, Payroll payroll, double salaryAmt, double additionAmt, double deductionAmt, String summary, Date payslipDate){
		this.setEmployee(employee);
		this.setPayRoll(payroll);
		this.setSalaryAmt(salaryAmt);
		this.setAdditionAmt(additionAmt);
		this.setDeductionAmt(deductionAmt);
		this.setPayslipDate(payslipDate);
		this.setObjStatus(Value.ACTIVED);
		this.setCreateDate(new Date());
	}
	
	/**
	 * @return the payslipId
	 */
	public long getPayslipId() {
		return payslipId;
	}

	/**
	 * @param payslipId the payslipId to set
	 */
	public void setPayslipId(long payslipId) {
		this.payslipId = payslipId;
	}

	/**
	 * @return the salaryAmt
	 */
	public double getSalaryAmt() {
		return salaryAmt;
	}

	/**
	 * @param salaryAmt the salaryAmt to set
	 */
	public void setSalaryAmt(double salaryAmt) {
		this.salaryAmt = salaryAmt;
	}

	/**
	 * @return the additionAmt
	 */
	public double getAdditionAmt() {
		return additionAmt;
	}

	/**
	 * @param additionAmt the additionAmt to set
	 */
	public void setAdditionAmt(double additionAmt) {
		this.additionAmt = additionAmt;
	}

	/**
	 * @return the deductionAmt
	 */
	public double getDeductionAmt() {
		return deductionAmt;
	}

	/**
	 * @param deductionAmt the deductionAmt to set
	 */
	public void setDeductionAmt(double deductionAmt) {
		this.deductionAmt = deductionAmt;
	}

	/**
	 * @return the payslipDate
	 */
	public Date getPayslipDate() {
		return payslipDate;
	}

	/**
	 * @param payslipDate the payslipDate to set
	 */
	public void setPayslipDate(Date payslipDate) {
		this.payslipDate = payslipDate;
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
	 * @return the payRoll
	 */
	public Payroll getPayRoll() {
		return payroll;
	}

	/**
	 * @param payroll the payRoll to set
	 */
	public void setPayRoll(Payroll payroll) {
		this.payroll = payroll;
	}

	public JSONObject toJson(){
		JSONObject returnJson = new JSONObject();
//		returnJson.put(Key.PAYID, this.payslipId);
//		returnJson.put(Key.PAYAMT, this.salaryAmt);
//		returnJson.put(Key.ADDITIONAMT, this.additionAmt);
//		returnJson.put(Key.DEDUCTIONAMT, this.deductionAmt);
//		returnJson.put(Key.PAYDATE, Config.SDF.format(this.payslipDate));
		returnJson.put(Key.OBJSTATUS, this.objStatus);
		returnJson.put(Key.CREATEDATE, Config.SDF.format(this.createDate));
		returnJson.put(Key.REMARK, this.remark);
		
		return returnJson;
	}
	
	
}
