package com.training.action;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.opensymphony.xwork2.ActionSupport;
import com.training.dao.UserDao;
import com.training.model.User;


@Component("loginAction")       
@Scope("prototype") 
public class LoginAction extends ActionSupport {

    private String username;
    private String password;

    @Autowired
    private UserDao userDao;

   
	/*
	 * public void setUserDao(UserDao userDao) { this.userDao = userDao; }
	 */

    public String execute() {
      
        User user = userDao.validateUser(username, password);

        if (user != null) {
            HttpSession session = ServletActionContext
                    .getRequest()
                    .getSession();
            session.setAttribute("role", user.getRole());

            if ("ADMIN".equals(user.getRole())) {
                return "admin";
            }
            if ("CUSTOMER".equals(user.getRole())) {
                return "customer";
            }
        }
        return "failure";
    }

    public String getUsername() {
    	return username;
    	}
    public void setUsername(String username) {
    	this.username = username;
    	}
    public String getPassword() { 
    	return password; 
    	}
    public void setPassword(String password) { 
    	this.password = password;
    	}
}