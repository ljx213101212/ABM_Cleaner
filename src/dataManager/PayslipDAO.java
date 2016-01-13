package dataManager;

import hibernate.HibernateUtil;

import java.util.ArrayList;
import java.util.List;
import model.Payslip;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;

import system.Key;
import system.Value;

public class PayslipDAO {
	// a. Payslip class method: C R U D
	public static ArrayList<Payslip> getAllPayslips() {
		ArrayList<Payslip> payslips = new ArrayList<Payslip>();
		DetachedCriteria dc = DetachedCriteria.forClass(Payslip.class);
		List<Object> list = HibernateUtil.detachedCriteriaReturnList(dc);
		for (Object o : list) {
			payslips.add((Payslip) o);
		}
		return payslips;
	}

	public static Payslip getPayslipById(long id) {
		return (Payslip) HibernateUtil.get(Payslip.class, id);
	}

	public static void addPayslip(Payslip payslip) {
		HibernateUtil.save(payslip);
	}

	public static void modifyPayslip(Payslip modifiedPayslip) {
		HibernateUtil.update(modifiedPayslip);
	}

	public static void deletePayslip(Payslip payslip) {
		HibernateUtil.delete(payslip);
	}

	// features
//	public static Payslip getPayslipByName(String name) {
//		Payslip payslip = null;
//		Payslip tempPayslip = null;
//		DetachedCriteria detachedCriteria = DetachedCriteria.forClass(Payslip.class);
//		detachedCriteria.add(Restrictions.eq(Key.NAME, name));
//		detachedCriteria.add(Restrictions.eq(Key.OBJSTATUS, Value.ACTIVED));
//		List<Object> list = HibernateUtil.detachedCriteriaReturnList(detachedCriteria);
//		for (Object o : list) {
//			tempPayslip = (Payslip) o;
//			if (tempPayslip.getName().equals(name)) {
//				payslip = tempPayslip;
//				break;
//			}
//		}
//		return payslip;
//	}

}
