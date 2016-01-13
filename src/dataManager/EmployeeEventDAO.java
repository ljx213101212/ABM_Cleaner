package dataManager;

import hibernate.HibernateUtil;

import java.util.ArrayList;
import java.util.List;
import model.EmployeeEvent;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;

import system.Key;
import system.Value;

public class EmployeeEventDAO {
	// a. EmployeeEvent class method: C R U D
	public static ArrayList<EmployeeEvent> getAllEmployeeEvents() {
		ArrayList<EmployeeEvent> employeeEvents = new ArrayList<EmployeeEvent>();
		DetachedCriteria dc = DetachedCriteria.forClass(EmployeeEvent.class);
		List<Object> list = HibernateUtil.detachedCriteriaReturnList(dc);
		for (Object o : list) {
			employeeEvents.add((EmployeeEvent) o);
		}
		return employeeEvents;
	}

	public static EmployeeEvent getEmployeeEventById(long id) {
		return (EmployeeEvent) HibernateUtil.get(EmployeeEvent.class, id);
	}

	public static void addEmployeeEvent(EmployeeEvent employeeEvent) {
		HibernateUtil.save(employeeEvent);
	}

	public static void modifyEmployeeEvent(EmployeeEvent modifiedEmployeeEvent) {
		HibernateUtil.update(modifiedEmployeeEvent);
	}

	public static void deleteEmployeeEvent(EmployeeEvent employeeEvent) {
		HibernateUtil.delete(employeeEvent);
	}

	// features
	public static EmployeeEvent getEmployeeEventByName(String name) {
		EmployeeEvent employeeEvent = null;
		EmployeeEvent tempEmployeeEvent = null;
		DetachedCriteria detachedCriteria = DetachedCriteria.forClass(EmployeeEvent.class);
		detachedCriteria.add(Restrictions.eq(Key.NAME, name));
		detachedCriteria.add(Restrictions.eq(Key.OBJSTATUS, Value.ACTIVED));
		List<Object> list = HibernateUtil.detachedCriteriaReturnList(detachedCriteria);
		for (Object o : list) {
			tempEmployeeEvent = (EmployeeEvent) o;
			if (tempEmployeeEvent.getName().equals(name)) {
				employeeEvent = tempEmployeeEvent;
				break;
			}
		}
		return employeeEvent;
	}

}
