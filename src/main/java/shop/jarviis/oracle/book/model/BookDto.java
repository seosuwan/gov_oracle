package shop.jarviis.oracle.book.model;

import org.springframework.stereotype.Component;

import lombok.Data;


@Component @Data
public class BookDto {
	private int bookId;
	private String bookTitle;
	private int price;
	private int pubId;
	
	public int getBookId() {
		return bookId;
	}


	public void setBookId(int bookId) {
		this.bookId = bookId;
	}


	public String getBookTitle() {
		return bookTitle;
	}


	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public int getPubId() {
		return pubId;
	}


	public void setPubId(int pubId) {
		this.pubId = pubId;
	}


	
	
	@Override
	public String toString() {
		return String.format("책Id : %d,책 제목 : %s,책 가격: %d, 출판사Id :%d", bookId, bookTitle, price, pubId);
	}


	
}
