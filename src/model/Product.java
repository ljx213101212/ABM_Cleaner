package model;

import java.util.Date;
import java.util.Set;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import system.Config;
import system.Key;
import system.Value;

public class Product {
	private long productId;
	private String name;
	private String description;
	private String image;
	private String unit;
	private double quantity;
	private double price;
	
	private long objStatus;
	private Date createDate;
	private String remark;
	
	private PurchaseOrder purchaseOrder;
	private Vendor vendor;
	
	public Product(){}

	public Product(PurchaseOrder purchaseOrder, String name, String description, String image, String unit, double quantity, double price) {
		super();
		this.setName(name);
		this.setDescription(description);
		this.setImage(image);
		this.setUnit(unit);
		this.setQuantity(quantity);
		this.setPrice(price);
		this.setObjStatus(Value.ACTIVED);
		this.setCreateDate(new Date());
	}

	/**
	 * @return the productId
	 */
	public long getProductId() {
		return productId;
	}

	/**
	 * @param productId the productId to set
	 */
	public void setProductId(long productId) {
		this.productId = productId;
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
	 * @return the image
	 */
	public String getImage() {
		return image;
	}

	/**
	 * @param image the image to set
	 */
	public void setImage(String image) {
		this.image = image;
	}

	/**
	 * @return the unit
	 */
	public String getUnit() {
		return unit;
	}

	/**
	 * @param unit the unit to set
	 */
	public void setUnit(String unit) {
		this.unit = unit;
	}

	/**
	 * @return the quantity
	 */
	public double getQuantity() {
		return quantity;
	}

	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
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
	 * @return the purchaseOrder
	 */
	public PurchaseOrder getPurchaseOrder() {
		return purchaseOrder;
	}

	/**
	 * @param purchaseOrder the purchaseOrder to set
	 */
	public void setPurchaseOrder(PurchaseOrder purchaseOrder) {
		this.purchaseOrder = purchaseOrder;
	}

	/**
	 * @return the vendor
	 */
	public Vendor getVendor() {
		return vendor;
	}

	/**
	 * @param vendor the vendor to set
	 */
	public void setVendor(Vendor vendor) {
		this.vendor = vendor;
	}
	
//	public JSONObject toJson(){
//		JSONObject returnJson = new JSONObject();
//		
//		returnJson.put(Key.PRODUCTID, this.productId);
//		returnJson.put(Key.NAMECH, this.name_ch);
//		returnJson.put(Key.NAMEEL, this.name_el);
//		returnJson.put(Key.DESCRIPTIONCH, this.description_ch);
//		returnJson.put(Key.DESCRIPTIONEL, this.description_el);
//		returnJson.put(Key.IMAGE, this.image);
//		returnJson.put(Key.PRICE, this.price);
//		
//		returnJson.put(Key.OBJSTATUS, this.objStatus);
//		returnJson.put(Key.CREATEDATE, Config.SDF.format(this.createDate));
//		returnJson.put(Key.REMARK, this.remark);
//		
//		returnJson.put(Key.ADMIN, this.admin.toJson());
//		
//		return returnJson;
//	}
//	
//	public JSONObject toJsonStrong(){
//		JSONObject returnJson = new JSONObject();
//		
//		returnJson.put(Key.PRODUCTID, this.productId);
//		returnJson.put(Key.NAMECH, this.name_ch);
//		returnJson.put(Key.NAMEEL, this.name_el);
//		returnJson.put(Key.DESCRIPTIONCH, this.description_ch);
//		returnJson.put(Key.DESCRIPTIONEL, this.description_el);
//		returnJson.put(Key.IMAGE, this.image);
//		returnJson.put(Key.PRICE, this.price);
//		
//		returnJson.put(Key.OBJSTATUS, this.objStatus);
//		returnJson.put(Key.CREATEDATE, Config.SDF.format(this.createDate));
//		returnJson.put(Key.REMARK, this.remark);
//		
//		returnJson.put(Key.ADMIN, this.admin.toJson());
//		
//		JSONArray kpiArr = new JSONArray();
//		for(KPI k : KPIDAO.getKPIsByProduct(this)){
//			kpiArr.add(k.toJson());
//		}
//		returnJson.put(Key.KPIS, kpiArr);
//		
//		return returnJson;
//	}
}
