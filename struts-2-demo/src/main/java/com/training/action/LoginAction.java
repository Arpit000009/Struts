package com.training.action;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.training.dao.UserDao;
import com.training.model.User;

import lombok.Data;

@Data
@Component("loginAction")
@Scope("prototype")
public class LoginAction extends ActionSupport implements ModelDriven<User>{

    private String username;
    private String password;
    @Autowired
    private UserDao userDao;
    private User user = new User();
    @Override
	public User getModel() {
		// TODO Auto-generated method stub
		return user;
	}

    

    public String execute() {

        User dbUser = userDao.validateUser(user.getUsername(), user.getPassword());

        if (dbUser == null) {
            return "failure";
        }

        if ("ADMIN".equals(dbUser.getRole())) {
            return "admin";
        }

        if ("CUSTOMER".equals(dbUser.getRole())) {
            return "customer";
        }

//        HttpSession session = ServletActionContext
//                .getRequest()
//                .getSession();
//
//        session.setAttribute("user", user.getUsername());
//        session.setAttribute("role", user.getRole());

//        ActionContext.getContext().getValueStack().push(user);
        

        

        return SUCCESS;
    }

    

	
}