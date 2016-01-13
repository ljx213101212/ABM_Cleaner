package dataManager;

import hibernate.HibernateUtil;

import java.util.ArrayList;
import java.util.List;
import model.EmployeeProject;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;

import system.Key;
import system.Value;

public class EmployeeProjectDAO {
	// a. EmployeeProject class method: C R U D
	public static ArrayList<EmployeeProject> getAllEmployeeProjects() {
		ArrayList<EmployeeProject> employeeProjects = new ArrayList<EmployeeProject>();
		DetachedCriteria dc = DetachedCriteria.forClass(EmployeeProject.class);
		List<Object> list = HibernateUtil.detachedCriteriaReturnList(dc);
		for (Object o : list) {
			employeeProjects.add((EmployeeProject) o);
		}
		return employeeProjects;
	}

	public static EmployeeProject getEmployeeProjectById(long id) {
		return (EmployeeProject) HibernateUtil.get(EmployeeProject.class, id);
	}

	public static void addEmployeeProject(EmployeeProject employeeProject) {
		HibernateUtil.save(employeeProject);
	}

	public static void modifyEmployeeProject(EmployeeProject modifiedEmployeeProject) {
		HibernateUtil.update(modifiedEmployeeProject);
	}

	public static void deleteEmployeeProject(EmployeeProject employeeProject) {
		HibernateUtil.delete(employeeProject);
	}

	// features
//	public static EmployeeProject getEmployeeProjectByName(String name) {
//		EmployeeProject employeeProject = null;
//		EmployeeProject tempEmployeeProject = null;
//		DetachedCriteria detachedCriteria = DetachedCriteria.forClass(EmployeeProject.class);
//		detachedCriteria.add(Restrictions.eq(Key.NAME, name));
//		detachedCriteria.add(Restrictions.eq(Key.OBJSTATUS, Value.ACTIVED));
//		List<Object> list = HibernateUtil.detachedCriteriaReturnList(detachedCriteria);
//		for (Object o : list) {
//			tempEmployeeProject = (EmployeeProject) o;
//			if (tempEmployeeProject.getName().equals(name)) {
//				employeeProject = tempEmployeeProject;
//				break;
//			}
//		}
//		return employeeProject;
//	}

}
