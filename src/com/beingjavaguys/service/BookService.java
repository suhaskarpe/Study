package com.beingjavaguys.service;

import java.util.List;

import com.beingjavaguys.domain.Book;

public interface BookService {

	public void addBook(Book book);
	
	public List<Book> getBook();
}
