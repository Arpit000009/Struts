package com.training.library.action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.training.library.dao.BookDao;
import com.training.library.model.Book;

public class ViewBooksAction extends ActionSupport {

    private List<Book> books;

    public String execute() {

        BookDao dao = new BookDao();

        books = dao.getAllBooks();

        return SUCCESS;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}