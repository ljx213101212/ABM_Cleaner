package controller;

import java.util.Date;

import model.Admin;
import model.Employee;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import dataManager.AdminDAO;
import dataManager.EmployeeDAO;
import system.Config;
import system.Encrypt;
import system.Key;
import system.Message;
import system.Value;

public class EmployeeCtrl {

	/**
	 * CRUD
	 */
	public static JSONObject createEmployee(JSONObject inputJson) {
		JSONObject returnJson = new JSONObject();
		try {
			Admin admin = AdminDAO.getAdminById((long) inputJson.get(Key.ADMINID));
			if (admin != null) {
				String name = (String) inputJson.get(Key.NAME);
				String gender = (String) inputJson.get(Key.GENDER);
				String race = (String) inputJson.get(Key.RACE);
				String contact = (String) inputJson.get(Key.CONTACT);
				String jobTitle = (String) inputJson.get(Key.JOBTITLE);
				Date dateOfBirth = Config.SDF.parse((String) inputJson.get(Key.DATEOFBIRTH));
				Date joinDate = Config.SDF.parse((String) inputJson.get(Key.JOINDATE));
//				String photo = (String) inputJson.get(Key.PHOTO);
				String workingType = (String) inputJson.get(Key.WORKINGTYPE);
				String passType = (String) inputJson.get(Key.PASSTYPE);
				String passNo = (String) inputJson.get(Key.PASSNO);

				Employee employee = new Employee(name, gender, race, contact, jobTitle, dateOfBirth, joinDate, workingType, passType, passNo);
				EmployeeDAO.addEmployee(employee);

				returnJson.put(Key.STATUS, Value.SUCCESS);
				returnJson.put(Key.MESSAGE, employee.toJson());
			} else {
				returnJson.put(Key.STATUS, Value.FAIL);
				returnJson.put(Key.MESSAGE, Message.ADMINNOTEXIST);
			}
		} catch (Exception e) {
			e.printStackTrace();
			returnJson.put(Key.STATUS, Value.FAIL);
			returnJson.put(Key.MESSAGE, e);
		}
		return returnJson;
	}

	// Get employee by id
	public static JSONObject getEmployeeById(JSONObject inputJson) {
		JSONObject returnJson = new JSONObject();
		try {
			Employee employee = EmployeeDAO.getEmployeeById((long) inputJson.get(Key.EMPLOYEEID));
			if (employee != null) {
				returnJson.put(Key.STATUS, Value.SUCCESS);
				returnJson.put(Key.MESSAGE, employee.toJson());
			} else {
				returnJson.put(Key.STATUS, Value.FAIL);
				returnJson.put(Key.MESSAGE, Message.EMPLOYEENOTEXIST);
			}
		} catch (Exception e) {
			e.printStackTrace();
			returnJson.put(Key.STATUS, Value.FAIL);
			returnJson.put(Key.MESSAGE, e);
		}
		return returnJson;
	}

	// Get all employee, not a very good way to retrieve employees without constraints.
	public static JSONObject getAllEmployees() {
		JSONObject returnJson = new JSONObject();
		try {
			JSONArray employeeJArr = new JSONArray();
			for (Employee a : EmployeeDAO.getAllEmployees()) {
				employeeJArr.add(a.toJson());
			}
			returnJson.put(Key.STATUS, Value.SUCCESS);
			returnJson.put(Key.MESSAGE, employeeJArr);
		} catch (Exception e) {
			e.printStackTrace();
			returnJson.put(Key.STATUS, Value.FAIL);
			returnJson.put(Key.MESSAGE, e);
		}
		return returnJson;
	}

	public static JSONObject updateEmployee(JSONObject inputJson) {
		JSONObject returnJson = new JSONObject();
		try {
			Employee employee = EmployeeDAO.getEmployeeById((long) inputJson.get(Key.EMPLOYEEID));
			if (employee != null) {
				String name = (String) inputJson.get(Key.NAME);
				String gender = (String) inputJson.get(Key.GENDER);
				String race = (String) inputJson.get(Key.RACE);
				String contact = (String) inputJson.get(Key.CONTACT);
				String jobTitle = (String) inputJson.get(Key.JOBTITLE);
				Date dateOfBirth = Config.SDF.parse((String) inputJson.get(Key.DATEOFBIRTH));
				Date joinDate = Config.SDF.parse((String) inputJson.get(Key.JOINDATE));
//				String photo = (String) inputJson.get(Key.PHOTO);
				String workingType = (String) inputJson.get(Key.WORKINGTYPE);
				String passType = (String) inputJson.get(Key.PASSTYPE);
				String passNo = (String) inputJson.get(Key.PASSNO);
				
				employee.setName(name);
				employee.setGender(gender);
				employee.setRace(race);
				employee.setContact(contact);
				employee.setJobTitle(jobTitle);
				employee.setDateOfBirth(dateOfBirth);
				employee.setJoinDate(joinDate);
//				employee.setPhoto(photo);
				employee.setWorkingType(workingType);
				employee.setPassType(passType);
				employee.setPassNo(passNo);

				EmployeeDAO.modifyEmployee(employee);

				returnJson.put(Key.STATUS, Value.SUCCESS);
				returnJson.put(Key.MESSAGE, employee.toJson());
			} else {
				returnJson.put(Key.STATUS, Value.FAIL);
				returnJson.put(Key.MESSAGE, Message.EMPLOYEENOTEXIST);
			}
		} catch (Exception e) {
			e.printStackTrace();
			returnJson.put(Key.STATUS, Value.FAIL);
			returnJson.put(Key.MESSAGE, e);
		}
		return returnJson;
	}

	public static JSONObject deleteEmployee(JSONObject inputJson) {
		JSONObject returnJson = new JSONObject();
		try {
			Employee employee = EmployeeDAO.getEmployeeById((long) inputJson.get(Key.EMPLOYEEID));
			if (employee != null) {
				employee.setObjStatus(Value.DELETED);
				EmployeeDAO.modifyEmployee(employee);

				returnJson.put(Key.STATUS, Value.SUCCESS);
				returnJson.put(Key.MESSAGE, employee.toJson());
			} else {
				returnJson.put(Key.STATUS, Value.FAIL);
				returnJson.put(Key.MESSAGE, Message.EMPLOYEENOTEXIST);
			}
		} catch (Exception e) {
			e.printStackTrace();
			returnJson.put(Key.STATUS, Value.FAIL);
			returnJson.put(Key.MESSAGE, e);
		}
		return returnJson;
	}

	// features
	// Get employee by email
//	public static JSONObject getEmployeeByEmail(JSONObject inputJson) {
//		JSONObject returnJson = new JSONObject();
//		try {
//			String email = (String) inputJson.get(Key.EMAIL);
//			Employee employee = EmployeeDAO.getEmployeeByEmail(email);
//			if (employee != null) {
//				returnJson.put(Key.STATUS, Value.SUCCESS);
//				returnJson.put(Key.MESSAGE, employee.toJson());
//			} else {
//				returnJson.put(Key.STATUS, Value.FAIL);
//				returnJson.put(Key.MESSAGE, Message.EMPLOYEENOTEXIST);
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//			returnJson.put(Key.STATUS, Value.FAIL);
//			returnJson.put(Key.MESSAGE, e);
//		}
//		return returnJson;
//	}
//	
	// Get employee by employee pass number
	public static JSONObject getEmployeeByPassNo(JSONObject inputJson) {
		JSONObject returnJson = new JSONObject();
		try {
			String nric = (String) inputJson.get(Key.PASSNO);
			Employee employee = EmployeeDAO.getEmployeeByPassNo(nric);
			if (employee != null) {
				returnJson.put(Key.STATUS, Value.SUCCESS);
				returnJson.put(Key.MESSAGE, employee.toJson());
			} else {
				returnJson.put(Key.STATUS, Value.FAIL);
				returnJson.put(Key.MESSAGE, Message.EMPLOYEENOTEXIST);
			}
		} catch (Exception e) {
			e.printStackTrace();
			returnJson.put(Key.STATUS, Value.FAIL);
			returnJson.put(Key.MESSAGE, e);
		}
		return returnJson;
	}
	
}
