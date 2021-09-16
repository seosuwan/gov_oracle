package shop.jarviis.oracle.order.model;

import java.util.List;

import org.springframework.stereotype.Repository;

import shop.jarviis.oracle.common.GenericInterface;

@Repository
public interface OrderMapper extends GenericInterface<OrderDto, Integer>{

	public List<OrderDto> findByCustomerId(int customerId);
	public List<OrderDto> findByBookId(int bookId);
	public List<OrderDto> findByOrderPrice(int orderPrice);
	public List<OrderDto> findByDate(String date);

}
