package com.training.dao;

import java.util.List;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.training.model.Product;
import com.training.util.HibernateUtil;

@Repository
public class ProductDao {

    public void saveProduct(Product product) {

        Session session = HibernateUtil
                .getSessionFactory()
                .openSession();

        session.beginTransaction();

        session.save(product);

        session.getTransaction().commit();

        session.close();
    }

    public List<Product> getAllProducts(){

        Session session = HibernateUtil
                .getSessionFactory()
                .openSession();

        List<Product> list =
                session.createQuery("from Product", Product.class)
                .list();

        session.close();

        return list;
    }
}