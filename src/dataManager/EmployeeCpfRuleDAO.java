package dataManager;

import hibernate.HibernateUtil;

import java.util.ArrayList;
import java.util.List;
import model.EmployeeCpfRule;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;

import system.Key;
import system.Value;

public class EmployeeCpfRuleDAO {
	// a. EmployeeCpfRule class method: C R U D
	public static ArrayList<EmployeeCpfRule> getAllEmployeeCpfRules() {
		ArrayList<EmployeeCpfRule> employeeCpfRules = new ArrayList<EmployeeCpfRule>();
		DetachedCriteria dc = DetachedCriteria.forClass(EmployeeCpfRule.class);
		List<Object> list = HibernateUtil.detachedCriteriaReturnList(dc);
		for (Object o : list) {
			employeeCpfRules.add((EmployeeCpfRule) o);
		}
		return employeeCpfRules;
	}

	public static EmployeeCpfRule getEmployeeCpfRuleById(long id) {
		return (EmployeeCpfRule) HibernateUtil.get(EmployeeCpfRule.class, id);
	}

	public static void addEmployeeCpfRule(EmployeeCpfRule employeeCpfRule) {
		HibernateUtil.save(employeeCpfRule);
	}

	public static void modifyEmployeeCpfRule(EmployeeCpfRule modifiedEmployeeCpfRule) {
		HibernateUtil.update(modifiedEmployeeCpfRule);
	}

	public static void deleteEmployeeCpfRule(EmployeeCpfRule employeeCpfRule) {
		HibernateUtil.delete(employeeCpfRule);
	}

}
