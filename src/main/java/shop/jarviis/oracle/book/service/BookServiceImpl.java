package shop.jarviis.oracle.book.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shop.jarviis.oracle.book.domain.BookDto;
import shop.jarviis.oracle.mappers.BookMapper;

@Service
public class BookServiceImpl implements BookService{
	@Autowired BookMapper bookMapper;

	@Override
	public List<BookDto> findAll() {
		return bookMapper.findAll();
	}

	@Override
	public BookDto findById(int bookId) {
		return bookMapper.findById(bookId);
	}

	@Override
	public List<BookDto> findByTitle(String bookTitle) {
		return bookMapper.findByTitle(bookTitle);
	}

	@Override
	public List<BookDto> findByPrice(int bookPrice) {
		return bookMapper.findByPrice(bookPrice);
	}

	@Override
	public List<BookDto> findByPubId(int pubId) {
		return bookMapper.findByPubId(pubId);
	}

}
