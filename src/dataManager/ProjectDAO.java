package dataManager;

import hibernate.HibernateUtil;

import java.util.ArrayList;
import java.util.List;
import model.Project;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;

import system.Key;
import system.Value;

public class ProjectDAO {
	// a. Project class method: C R U D
	public static ArrayList<Project> getAllProjects() {
		ArrayList<Project> projects = new ArrayList<Project>();
		DetachedCriteria dc = DetachedCriteria.forClass(Project.class);
		List<Object> list = HibernateUtil.detachedCriteriaReturnList(dc);
		for (Object o : list) {
			projects.add((Project) o);
		}
		return projects;
	}

	public static Project getProjectById(long id) {
		return (Project) HibernateUtil.get(Project.class, id);
	}

	public static void addProject(Project project) {
		HibernateUtil.save(project);
	}

	public static void modifyProject(Project modifiedProject) {
		HibernateUtil.update(modifiedProject);
	}

	public static void deleteProject(Project project) {
		HibernateUtil.delete(project);
	}

	// features
	public static Project getProjectByName(String name) {
		Project project = null;
		Project tempProject = null;
		DetachedCriteria detachedCriteria = DetachedCriteria.forClass(Project.class);
		detachedCriteria.add(Restrictions.eq(Key.NAME, name));
		detachedCriteria.add(Restrictions.eq(Key.OBJSTATUS, Value.ACTIVED));
		List<Object> list = HibernateUtil.detachedCriteriaReturnList(detachedCriteria);
		for (Object o : list) {
			tempProject = (Project) o;
			if (tempProject.getName().equals(name)) {
				project = tempProject;
				break;
			}
		}
		return project;
	}

}
