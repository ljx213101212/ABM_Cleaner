package dataManager;

import hibernate.HibernateUtil;

import java.util.ArrayList;
import java.util.List;
import model.Employee;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;

import system.Key;
import system.Value;

public class EmployeeDAO {
	// a. Employee class method: C R U D
	public static ArrayList<Employee> getAllEmployees() {
		ArrayList<Employee> employees = new ArrayList<Employee>();
		DetachedCriteria dc = DetachedCriteria.forClass(Employee.class);
		List<Object> list = HibernateUtil.detachedCriteriaReturnList(dc);
		for (Object o : list) {
			employees.add((Employee) o);
		}
		return employees;
	}

	public static Employee getEmployeeById(long id) {
		return (Employee) HibernateUtil.get(Employee.class, id);
	}

	public static void addEmployee(Employee employee) {
		HibernateUtil.save(employee);
	}

	public static void modifyEmployee(Employee modifiedEmployee) {
		HibernateUtil.update(modifiedEmployee);
	}

	public static void deleteEmployee(Employee employee) {
		HibernateUtil.delete(employee);
	}

	// features
	public static Employee getEmployeeByPassNo(String passNo) {
		Employee employee = null;
		Employee tempEmployee = null;
		DetachedCriteria detachedCriteria = DetachedCriteria.forClass(Employee.class);
		detachedCriteria.add(Restrictions.eq(Key.PASSNO, passNo));
		detachedCriteria.add(Restrictions.eq(Key.OBJSTATUS, Value.ACTIVED));
		List<Object> list = HibernateUtil.detachedCriteriaReturnList(detachedCriteria);
		for (Object o : list) {
			tempEmployee = (Employee) o;
			if (tempEmployee.getName().equals(passNo)) {
				employee = tempEmployee;
				break;
			}
		}
		return employee;
	}

}
