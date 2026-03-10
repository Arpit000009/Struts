
package com.enterprise.action;

import com.opensymphony.xwork2.ActionSupport;
import com.enterprise.service.EmployeeService;
import java.util.List;

import com.enterprise.dao.EmployeeDAOImpl;
import com.enterprise.model.Employee;

public class EmployeeAction extends ActionSupport {

 private EmployeeService employeeService;
 private List<Employee> employees;
 
 private String name;
 private String department;
 private double salary;
 
 EmployeeDAOImpl dao = new EmployeeDAOImpl();
 
 public void setEmployeeService(EmployeeService employeeService) {
     this.employeeService = employeeService;
 }

 public String execute() {
  // TODO  must integrate Spring bean and call service
	 EmployeeDAOImpl dao = new EmployeeDAOImpl();

     employees = dao.findAll();

     System.out.println("Employees fetched: " + employees.size());

     return SUCCESS;
 }
 
 public String saveEmployee() {

     Employee e = new Employee();

     e.setName(name);
     e.setDepartment(department);
     e.setSalary(salary);

     dao.save(e);

     return SUCCESS;
 }

 public List<Employee> getEmployees() {
  return employees;
 }
 
 public String getName() {
     return name;
 }

 public void setName(String name) {
     this.name = name;
 }

 public String getDepartment() {
     return department;
 }

 public void setDepartment(String department) {
     this.department = department;
 }

 public double getSalary() {
     return salary;
 }

 public void setSalary(double salary) {
     this.salary = salary;
 }

}
