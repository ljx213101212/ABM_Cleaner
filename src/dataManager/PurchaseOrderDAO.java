package dataManager;

import hibernate.HibernateUtil;

import java.util.ArrayList;
import java.util.List;
import model.PurchaseOrder;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;

import system.Key;
import system.Value;

public class PurchaseOrderDAO {
	// a. PurchaseOrder class method: C R U D
	public static ArrayList<PurchaseOrder> getAllPurchaseOrders() {
		ArrayList<PurchaseOrder> purchaseOrders = new ArrayList<PurchaseOrder>();
		DetachedCriteria dc = DetachedCriteria.forClass(PurchaseOrder.class);
		List<Object> list = HibernateUtil.detachedCriteriaReturnList(dc);
		for (Object o : list) {
			purchaseOrders.add((PurchaseOrder) o);
		}
		return purchaseOrders;
	}

	public static PurchaseOrder getPurchaseOrderById(long id) {
		return (PurchaseOrder) HibernateUtil.get(PurchaseOrder.class, id);
	}

	public static void addPurchaseOrder(PurchaseOrder purchaseOrder) {
		HibernateUtil.save(purchaseOrder);
	}

	public static void modifyPurchaseOrder(PurchaseOrder modifiedPurchaseOrder) {
		HibernateUtil.update(modifiedPurchaseOrder);
	}

	public static void deletePurchaseOrder(PurchaseOrder purchaseOrder) {
		HibernateUtil.delete(purchaseOrder);
	}

	// features
//	public static PurchaseOrder getPurchaseOrderByName(String name) {
//		PurchaseOrder purchaseOrder = null;
//		PurchaseOrder tempPurchaseOrder = null;
//		DetachedCriteria detachedCriteria = DetachedCriteria.forClass(PurchaseOrder.class);
//		detachedCriteria.add(Restrictions.eq(Key.NAME, name));
//		detachedCriteria.add(Restrictions.eq(Key.OBJSTATUS, Value.ACTIVED));
//		List<Object> list = HibernateUtil.detachedCriteriaReturnList(detachedCriteria);
//		for (Object o : list) {
//			tempPurchaseOrder = (PurchaseOrder) o;
//			if (tempPurchaseOrder.getName().equals(name)) {
//				purchaseOrder = tempPurchaseOrder;
//				break;
//			}
//		}
//		return purchaseOrder;
//	}

}
