package com.beingjavaguys.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.beingjavaguys.domain.Book;

@Repository("bookDao")
public class BookDaoImpl implements BookDao {

	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public void saveBook(Book book) {
		sessionFactory.getCurrentSession().saveOrUpdate(book);
	}

	@Override
	public List<Book> getBook() {
		return sessionFactory.getCurrentSession().createCriteria(Book.class).list();
	}

}
