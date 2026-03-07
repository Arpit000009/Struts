package com.training.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.training.dao.ProductDao;
import com.training.model.Product;

@Component
@Scope("prototype")
public class AddProductAction extends ActionSupport implements ModelDriven<Product>{

    private Product product = new Product();

    @Autowired
    private ProductDao productDao;

    @Override
    public Product getModel() {
        return product;
    }

    public String execute(){

        productDao.saveProduct(product);

        return SUCCESS;
    }
}