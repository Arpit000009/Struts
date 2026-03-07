package com.training.library.dao;

import java.util.List;

import org.hibernate.Session;
import com.training.library.model.Book;
import com.training.library.util.HibernateUtil;

import lombok.Data;

@Data
public class BookDao {

    public void saveBook(Book book) {

        Session session = HibernateUtil
                .getSessionFactory()
                .openSession();

        session.beginTransaction();

        session.save(book);

        session.getTransaction().commit();

        session.close();
    }

    public List<Book> getAllBooks() {

        Session session = HibernateUtil
                .getSessionFactory()
                .openSession();

        List<Book> list =
                session.createQuery("from Book", Book.class)
                .list();

        session.close();

        return list;
    }

    public Book getBookById(int id) {

        Session session = HibernateUtil
                .getSessionFactory()
                .openSession();

        Book book = session.get(Book.class, id);

        session.close();

        return book;
    }

    public void updateBook(Book book) {

        Session session = HibernateUtil
                .getSessionFactory()
                .openSession();

        session.beginTransaction();

        session.update(book);

        session.getTransaction().commit();

        session.close();
    }

    public void deleteBook(int id) {

        Session session = HibernateUtil
                .getSessionFactory()
                .openSession();

        session.beginTransaction();

        Book book = session.get(Book.class, id);

        session.delete(book);

        session.getTransaction().commit();

        session.close();
    }
    
    public List<Book> searchBooks(String title){

        Session session = HibernateUtil
                .getSessionFactory()
                .openSession();

        List<Book> list = session
                .createQuery("from Book where lower(title) like :title", Book.class)
                .setParameter("title", "%" + title.toLowerCase() + "%")
                .list();

        session.close();

        return list;
    }
}
