package model;

import java.util.Date;
import java.util.Set;

import system.Value;

public class PurchaseOrder {
	private long purchaseOrderId;
	private String purchaseOrderNumber;
	private Date sendDate; //implement send email functions directly from the system.
	private double totalPrice; //store the total price for faster query
	
	private long objStatus;
	private Date createDate;
	private String remark;
	
	private Admin admin;
	private Set<Product> products;
	
	public PurchaseOrder(){}
	
	public PurchaseOrder(Admin admin, String purchaseOrderNumber, Date sendDate) {
		super();
		this.purchaseOrderNumber = purchaseOrderNumber;
		this.sendDate = sendDate;
		this.admin = admin;
		this.setObjStatus(Value.ACTIVED);
		this.setCreateDate(new Date());
	}

	/**
	 * @return the purchaseOrderId
	 */
	public long getPurchaseOrderId() {
		return purchaseOrderId;
	}
	/**
	 * @param purchaseOrderId the purchaseOrderId to set
	 */
	public void setPurchaseOrderId(long purchaseOrderId) {
		this.purchaseOrderId = purchaseOrderId;
	}
	/**
	 * @return the purchaseOrderNumber
	 */
	public String getPurchaseOrderNumber() {
		return purchaseOrderNumber;
	}
	/**
	 * @param purchaseOrderNumber the purchaseOrderNumber to set
	 */
	public void setPurchaseOrderNumber(String purchaseOrderNumber) {
		this.purchaseOrderNumber = purchaseOrderNumber;
	}
	/**
	 * @return the sendDate
	 */
	public Date getSendDate() {
		return sendDate;
	}
	/**
	 * @param sendDate the sendDate to set
	 */
	public void setSendDate(Date sendDate) {
		this.sendDate = sendDate;
	}
	/**
	 * @return the totalPrice
	 */
	public double getTotalPrice() {
		return totalPrice;
	}
	/**
	 * @param totalPrice the totalPrice to set
	 */
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
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
	 * @return the products
	 */
	public Set<Product> getProducts() {
		return products;
	}
	/**
	 * @param products the products to set
	 */
	public void setProducts(Set<Product> products) {
		this.products = products;
	}
	
//	public JSONObject toJson(){
//	JSONObject returnJson = new JSONObject();
//	
//	returnJson.put(Key.PRODUCTID, this.productId);
//	returnJson.put(Key.NAMECH, this.name_ch);
//	returnJson.put(Key.NAMEEL, this.name_el);
//	returnJson.put(Key.DESCRIPTIONCH, this.description_ch);
//	returnJson.put(Key.DESCRIPTIONEL, this.description_el);
//	returnJson.put(Key.IMAGE, this.image);
//	returnJson.put(Key.PRICE, this.price);
//	
//	returnJson.put(Key.OBJSTATUS, this.objStatus);
//	returnJson.put(Key.CREATEDATE, Config.SDF.format(this.createDate));
//	returnJson.put(Key.REMARK, this.remark);
//	
//	returnJson.put(Key.ADMIN, this.admin.toJson());
//	
//	return returnJson;
//}
}
