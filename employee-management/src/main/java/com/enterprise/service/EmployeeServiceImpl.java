
package com.enterprise.service;

import java.util.List;
import com.enterprise.dao.EmployeeDAO;
import com.enterprise.model.Employee;

public class EmployeeServiceImpl implements EmployeeService {

 private EmployeeDAO employeeDAO;

 public void setEmployeeDAO(EmployeeDAO dao) {
  this.employeeDAO = dao;
 }

 @Override
 public List<Employee> getEmployees() {
  return employeeDAO.findAll();
 }

 @Override
 public void addEmployee(Employee employee) {
  // TODO must add validation before saving
  employeeDAO.save(employee);
 }

}
