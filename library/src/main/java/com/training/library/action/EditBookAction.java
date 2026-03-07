package com.training.library.action;

import com.opensymphony.xwork2.ActionSupport;
import com.training.library.dao.BookDao;
import com.training.library.model.Book;

public class EditBookAction extends ActionSupport {

    private int id;
    private Book book;

    public String execute() {

        BookDao dao = new BookDao();
        book = dao.getBookById(id);

        return SUCCESS;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Book getBook() {
        return book;
    }
}