package shop.jarviis.oracle.book.domain;

import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.ToString;

@Component @Data
public class BookDto {
	private int bookId;
	private String bookTitle;
	private int price;
	private int pubId;
	
	
	@Override
	public String toString() {
		return String.format("책Id : %d,책 제목 : %s,책 가격: %d, 출판사Id :%d", bookId, bookTitle, price, pubId);
	}

	
}
