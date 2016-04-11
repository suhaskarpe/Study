package com.beingjavaguys.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.beingjavaguys.dao.BookDao;
import com.beingjavaguys.domain.Book;

@Service
@Transactional(propagation = Propagation.SUPPORTS , readOnly = true)
public class BookServiceImpl implements BookService {

	@Autowired
	BookDao bookDao;
	
	@Override
	public void addBook(Book book) {
		bookDao.saveBook(book);
	}

	@Override
	public List<Book> getBook() {
		return bookDao.getBook();
	}
}