package com.training.dao;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import com.training.model.User;
import com.training.util.HibernateUtil;

@Repository
public class UserDao {

    public User validateUser(String username, String password) {
        User user = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            String hql = "FROM User WHERE username = :username AND password = :password";
            Query<User> query = session.createQuery(hql, User.class);
            query.setParameter("username", username);
            query.setParameter("password", password);
            user = query.uniqueResult();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return user;
    }
}