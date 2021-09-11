package shop.jarviis.oracle.book.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import shop.jarviis.oracle.book.domain.BookDto;
import shop.jarviis.oracle.book.service.BookService;

@Controller
public class BookController {
	@Autowired BookService bookService;
	
	@RequestMapping("/books")
	public void findAll() {
		List<BookDto> books = bookService.findAll();
		for (BookDto i : books) {
			System.out.println(i.toString());
		} 
	}
	@RequestMapping("/books/bookId/{bookId}")
	public void findById(@PathVariable int bookId) {
		System.out.println(bookService.findById(bookId).toString());
	}
	@RequestMapping("/books/bookTitle/{bookTitle}")
	public void findByTitle(@PathVariable String bookTitle) {
		List<BookDto> books = bookService.findByTitle(bookTitle);
		for (BookDto i : books) {
			System.out.println(i.toString());
		} 
	}
	@RequestMapping("/books/bookPrice/{price}")
	public void findByPrice(@PathVariable int price) {
		List<BookDto> books = bookService.findByPrice(price);
		for (BookDto i : books) {
			System.out.println(i.toString());
		} 
	}
	@RequestMapping("/books/pubId/{pubId}")
	public void findByPubId(@PathVariable int pubId) {
		List<BookDto> books = bookService.findByPubId(pubId);
		for (BookDto i : books) {
			System.out.println(i.toString());
		} 
	}
	

}
