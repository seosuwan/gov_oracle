package shop.jarviis.oracle.order.model;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component @Data
public class OrderDto {
	private int orderId;
	private int customerId;
	private int bookId;
	private int orderPrice;
	private String date;
	
	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public int getOrderPrice() {
		return orderPrice;
	}

	public void setOrderPrice(int orderPrice) {
		this.orderPrice = orderPrice;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return String.format("구매Id: %d,구매자Id: %d, 책Id: %d, 구매가격: %d, 구매날짜: %s",orderId,customerId,bookId,orderPrice,date);
	}

}
