package com.training.library.action;

import com.opensymphony.xwork2.ActionSupport;
import com.training.library.dao.BookDao;
import com.training.library.model.Book;

public class AddBookAction extends ActionSupport {

	
    private Book book = new Book();

    public String execute(){

        BookDao dao = new BookDao();
        System.out.println(book);
        dao.saveBook(book);

        return SUCCESS;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}
