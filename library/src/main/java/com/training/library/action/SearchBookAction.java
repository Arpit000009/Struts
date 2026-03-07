package com.training.library.action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.training.library.dao.BookDao;
import com.training.library.model.Book;

public class SearchBookAction extends ActionSupport {

    private String title;

    private List<Book> books;

    public String execute(){

        if(title == null || title.trim().equals("")){
            return INPUT;
        }

        BookDao dao = new BookDao();
        books = dao.searchBooks(title);

        return SUCCESS;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Book> getBooks() {
        return books;
    }
}