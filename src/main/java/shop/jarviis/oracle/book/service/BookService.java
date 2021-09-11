package shop.jarviis.oracle.book.service;

import java.util.List;

import shop.jarviis.oracle.book.domain.BookDto;

public interface BookService {
	public List<BookDto> findAll();
	public BookDto findById(int bookId);
	public List<BookDto> findByTitle(String bookTitle);
	public List<BookDto> findByPrice(int bookPrice);
	public List<BookDto> findByPubId(int pubId);
}