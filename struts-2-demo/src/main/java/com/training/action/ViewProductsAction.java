package com.training.action;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.opensymphony.xwork2.ActionSupport;
import com.training.dao.ProductDao;
import com.training.model.Product;

@Component
@Scope("prototype")
public class ViewProductsAction extends ActionSupport {

	@Autowired
	private ProductDao productDao;

	private List<Product> products;
	private String username;
	private List<String> menu;

	public String execute() {
		username = "ADMIN";

		menu = Arrays.asList("Dashboard", "Reports", "User Management", "Settings");
		products = productDao.getAllProducts();

		return SUCCESS;
	}

	public List<Product> getProducts() {
		return products;
	}

	public String getUsername() {
		return username;
	}

	public List<String> getMenu() {
		return menu;
	}
}