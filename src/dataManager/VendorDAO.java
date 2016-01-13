package dataManager;

import hibernate.HibernateUtil;

import java.util.ArrayList;
import java.util.List;
import model.Vendor;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;

import system.Key;
import system.Value;

public class VendorDAO {
	// a. Vendor class method: C R U D
	public static ArrayList<Vendor> getAllVendors() {
		ArrayList<Vendor> vendors = new ArrayList<Vendor>();
		DetachedCriteria dc = DetachedCriteria.forClass(Vendor.class);
		List<Object> list = HibernateUtil.detachedCriteriaReturnList(dc);
		for (Object o : list) {
			vendors.add((Vendor) o);
		}
		return vendors;
	}

	public static Vendor getVendorById(long id) {
		return (Vendor) HibernateUtil.get(Vendor.class, id);
	}

	public static void addVendor(Vendor vendor) {
		HibernateUtil.save(vendor);
	}

	public static void modifyVendor(Vendor modifiedVendor) {
		HibernateUtil.update(modifiedVendor);
	}

	public static void deleteVendor(Vendor vendor) {
		HibernateUtil.delete(vendor);
	}

	// features
	public static Vendor getVendorByName(String name) {
		Vendor vendor = null;
		Vendor tempVendor = null;
		DetachedCriteria detachedCriteria = DetachedCriteria.forClass(Vendor.class);
		detachedCriteria.add(Restrictions.eq(Key.NAME, name));
		detachedCriteria.add(Restrictions.eq(Key.OBJSTATUS, Value.ACTIVED));
		List<Object> list = HibernateUtil.detachedCriteriaReturnList(detachedCriteria);
		for (Object o : list) {
			tempVendor = (Vendor) o;
			if (tempVendor.getName().equals(name)) {
				vendor = tempVendor;
				break;
			}
		}
		return vendor;
	}

}
