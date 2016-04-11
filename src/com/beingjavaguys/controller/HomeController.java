package com.beingjavaguys.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.beingjavaguys.domain.Book;
import com.beingjavaguys.domain.User;
import com.beingjavaguys.service.BookService;
import com.beingjavaguys.service.UserService;

@Controller
public class HomeController {

	@Autowired
	private UserService userService;
	
	@Autowired
	private BookService bookService;
	
	@RequestMapping("/registerBook")
	public ModelAndView getBookRegisterForm(@ModelAttribute("book") Book book, BindingResult result){
 
		HashMap<Object, Object> model = new HashMap<Object, Object>();
		return new ModelAndView("RegisterBook", "model", model );
	}
	
	@RequestMapping("/saveBook")
	public ModelAndView saveBookData(@ModelAttribute("book") Book book, BindingResult result){
		bookService.addBook(book);
		System.out.println("Save Book Data");
		return new ModelAndView("redirect:/bookList.html");
	}

	@RequestMapping("/bookList")
	public ModelAndView getBookList(){
		Map<String, List<Book>> model = new HashMap<String, List<Book>>();
		model.put("book",bookService.getBook());
		System.out.println("get Book Data");
		return new ModelAndView("BookDetails",model);
	}
	
	@RequestMapping("/register")
	public ModelAndView getRegisterForm(@ModelAttribute("user") User user,
			BindingResult result) {
		ArrayList<String> gender = new ArrayList<String>();
		gender.add("Male");
		gender.add("Female");
		ArrayList<String> city = new ArrayList<String>();
		city.add("Delhi");
		city.add("Kolkata");
		city.add("Chennai");
		city.add("Bangalore");
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("gender", gender);
		model.put("city", city);
		System.out.println("Register Form");
		return new ModelAndView("Register", "model", model);
	}

	@RequestMapping("/saveUser")
	public ModelAndView saveUserData(@ModelAttribute("user") User user,
			BindingResult result) {
		userService.addUser(user);
		System.out.println("Save User Data");
		return new ModelAndView("redirect:/userList.html");
	}

	@RequestMapping("/userList")
	public ModelAndView getUserList() {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("user", userService.getUser());
		return new ModelAndView("UserDetails", model);
	}
}