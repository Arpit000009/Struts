
package com.enterprise.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.enterprise.model.Employee;
import com.enterprise.util.HibernateUtil;

public class EmployeeDAOImpl implements EmployeeDAO {

 @PersistenceContext
 private EntityManager entityManager;

 @Override
 public List<Employee> findAll() {

	  Session session = HibernateUtil
	        .getSessionFactory()
	        .openSession();

	  List<Employee> employees =
	        session.createQuery("from Employee", Employee.class)
	               .list();

	  session.close();

	  return employees;
	 }

 @Override
 public void save(Employee employee) {
  // TODO  must implement persist logic
	/* entityManager.persist(employee); */
	 
	 Session session =
		        HibernateUtil.getSessionFactory().openSession();

		    Transaction tx = session.beginTransaction();

		    session.save(employee);

		    tx.commit();

		    session.close();
	 
 }

}
