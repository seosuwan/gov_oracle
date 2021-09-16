package shop.jarviis.oracle.book.web;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import shop.jarviis.oracle.book.model.BookDto;
import shop.jarviis.oracle.book.model.BookService;
import shop.jarviis.oracle.common.GenericInterface;

@Controller
@RequestMapping("/books")
public class BookController {
	@Autowired BookService bookService;
	@Autowired BookDto book;

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public void save(BookDto t) {
		// TODO Auto-generated method stub
		bookService.save(t);
	}

	@RequestMapping("/detail")
	public String findById(@RequestParam("bookId") Integer bookId) {
		book = bookService.findById(bookId);
		System.out.println(book.toString());
		return "수완이짱";
	}

	@RequestMapping
	public String findAll() {
		List<BookDto> books = bookService.findAll();
		for (BookDto book : books) {
			System.out.println(book.toString());
		}
		return "수완이 더 짱짱맨";
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public void update(BookDto t) {
		System.out.println(t.toString());
		bookService.update(t);
	}

	@RequestMapping("/delete")
	public void delete(@RequestParam("bookId") Integer bookId) {
		bookService.delete(bookId);
	}
	

}
	
	
	
	


