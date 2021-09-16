package shop.jarviis.oracle.book.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService{
	@Autowired BookMapper bookMapper;
	@Override
	public void save(BookDto t) {
		bookMapper.save(t);	
	}
	@Override
	public BookDto findById(Integer id) {
		return bookMapper.findById(id);
	}
	@Override
	public List<BookDto> findAll() {
		return bookMapper.findAll();
	}
	@Override
	public void update(BookDto t) {
		bookMapper.update(t);
	}
	@Override
	public void delete(Integer id) {
		bookMapper.delete(id);
		
	}


	
}
