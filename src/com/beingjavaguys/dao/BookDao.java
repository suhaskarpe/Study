package com.beingjavaguys.dao;

import java.util.List;

import com.beingjavaguys.domain.Book;

public interface BookDao {
	public void saveBook(Book book);
	
	public List<Book> getBook();
}
