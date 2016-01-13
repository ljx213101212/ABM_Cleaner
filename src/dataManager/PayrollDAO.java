package dataManager;

import hibernate.HibernateUtil;

import java.util.ArrayList;
import java.util.List;
import model.Payroll;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;

import system.Key;
import system.Value;

public class PayrollDAO {
	// a. Payroll class method: C R U D
	public static ArrayList<Payroll> getAllPayrolls() {
		ArrayList<Payroll> payrolls = new ArrayList<Payroll>();
		DetachedCriteria dc = DetachedCriteria.forClass(Payroll.class);
		List<Object> list = HibernateUtil.detachedCriteriaReturnList(dc);
		for (Object o : list) {
			payrolls.add((Payroll) o);
		}
		return payrolls;
	}

	public static Payroll getPayrollById(long id) {
		return (Payroll) HibernateUtil.get(Payroll.class, id);
	}

	public static void addPayroll(Payroll payroll) {
		HibernateUtil.save(payroll);
	}

	public static void modifyPayroll(Payroll modifiedPayroll) {
		HibernateUtil.update(modifiedPayroll);
	}

	public static void deletePayroll(Payroll payroll) {
		HibernateUtil.delete(payroll);
	}

	// features
//	public static Payroll getPayrollByName(String name) {
//		Payroll payroll = null;
//		Payroll tempPayroll = null;
//		DetachedCriteria detachedCriteria = DetachedCriteria.forClass(Payroll.class);
//		detachedCriteria.add(Restrictions.eq(Key.NAME, name));
//		detachedCriteria.add(Restrictions.eq(Key.OBJSTATUS, Value.ACTIVED));
//		List<Object> list = HibernateUtil.detachedCriteriaReturnList(detachedCriteria);
//		for (Object o : list) {
//			tempPayroll = (Payroll) o;
//			if (tempPayroll.getName().equals(name)) {
//				payroll = tempPayroll;
//				break;
//			}
//		}
//		return payroll;
//	}

}
