package shop.jarviis.oracle.order.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import shop.jarviis.oracle.order.model.OrderDto;
import shop.jarviis.oracle.order.model.OrderService;

@Controller
@RequestMapping("/orders")
public class OrderController {
	@Autowired OrderService orderService;
	@Autowired OrderDto orderDto;
	
	@RequestMapping("/orders")
	public void findAll() {
		List<OrderDto> orders = orderService.findAll();
		for (OrderDto i : orders) {
			System.out.println(i.toString());
		}
	}
	@RequestMapping("/orders/orderId/{orderId}")
	public void findById(@PathVariable int orderId) {
		System.out.println(orderService.findById(orderId).toString());
	}
	@RequestMapping("/orders/customerId/{customerId}")
	public void findByCustomerId(@PathVariable int customerId) {
		List<OrderDto> orders = orderService.findByCustomerId(customerId);
		for (OrderDto i : orders) {
			System.out.println(i.toString());
		}
	}
	@RequestMapping("/orders/bookId/{bookId}")
	public void findByBookId(@PathVariable int bookId) {
		List<OrderDto> orders = orderService.findByBookId(bookId);
			for(OrderDto i : orders) {
				System.out.println(i.toString());
			
		}
	}
	@RequestMapping("/orders/orderPrice/{orderPrice}")
	public void findByOrderPrice(@PathVariable int orderPrice) {
		List<OrderDto> orders = orderService.findByOrderPrice(orderPrice);
			for(OrderDto i : orders) {
				System.out.println(i.toString());
			}
	}
	@RequestMapping("/orders/date/{date}")
	public void findByDate(@PathVariable String date) {
		List<OrderDto> orders = orderService.findByDate(date);
		for(OrderDto i : orders) {
			System.out.println(i.toString());
		}
	}
	@RequestMapping(value = "/addOrder", method = {RequestMethod.POST})
	public String addOrders(
			@RequestParam("orderId")int orderId,
			@RequestParam("customerId")int customerId,
			@RequestParam("bookId")int bookId,
			@RequestParam("orderPrice")int orderPrice,
			@RequestParam("date")String date) {
		System.out.println("orderId :" + orderId);
		System.out.println("customerId :" + customerId);
		System.out.println("bookId :" + bookId);
		System.out.println("orderPrice :" + orderPrice);
		System.out.println("date :" + date);
		orderDto = new OrderDto();
		orderDto.setOrderId(orderId);
		orderDto.setCustomerId(customerId);
		orderDto.setBookId(bookId);
		orderDto.setOrderPrice(orderPrice);
		orderDto.setDate(date);
		orderService.save(orderDto);
		return "/order/AddOrder";
	}
  
}

