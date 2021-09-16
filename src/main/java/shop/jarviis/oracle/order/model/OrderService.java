package shop.jarviis.oracle.order.model;

import java.util.List;

import org.springframework.stereotype.Component;

import shop.jarviis.oracle.common.GenericInterface;

@Component
public interface OrderService extends GenericInterface<OrderDto, Integer> {
	
	public List<OrderDto> findByCustomerId(int customerId);
	public List<OrderDto> findByBookId(int bookId);
	public List<OrderDto> findByOrderPrice(int orderPrice);
	public List<OrderDto> findByDate(String date);


}
