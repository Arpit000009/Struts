package com.training.library.action;

import com.opensymphony.xwork2.ActionSupport;
import com.training.library.dao.BookDao;

public class DeleteBookAction extends ActionSupport {

    private int id;

    public String execute(){

        BookDao dao = new BookDao();
        dao.deleteBook(id);

        return SUCCESS;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}