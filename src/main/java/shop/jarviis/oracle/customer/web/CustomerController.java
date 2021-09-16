package shop.jarviis.oracle.customer.web;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import shop.jarviis.oracle.customer.model.CustomerDto;
import shop.jarviis.oracle.customer.model.CustomerService;

@Controller
@RequestMapping("/customers")
public class CustomerController {
	
	@Autowired CustomerService customerService; 
	@Autowired CustomerDto customerDto;
	
	@RequestMapping(value = "/register", method = {RequestMethod.POST})
	public String save(CustomerDto customerDto) {
		customerService.save(customerDto);
		return "회원 등록 완료";
	}
	@RequestMapping("/")
	public String findAll() {
		List<CustomerDto> customers = customerService.findAll();
		for(CustomerDto customer: customers) {
			System.out.println(customer.toString());
		}
		return "전체 유저목록 조회 완료";
	}
	@RequestMapping("/delete")
	public String delete(@PathParam("customerId") Integer customerId) {
		customerService.delete(customerId);
		return "유저 삭제 완료";
	}
	@RequestMapping(value = "/update", method = {RequestMethod.POST})
	public String update(CustomerDto customerDto) {
		customerService.update(customerDto);
		return "유저 업데이트 완료";
	}
	@RequestMapping("/customerName/{customerName}")
	public void customerName(@PathVariable String customerName) {
		List<CustomerDto> customerDtos = customerService.findByCustomerName(customerName);
		for(CustomerDto customerDto : customerDtos){
			System.out.println(customerDto.toString());
		}
	}
	@RequestMapping("/Phone/{phone}")
	public void phone(@PathVariable String phone) {
		List<CustomerDto> customerDtos = customerService.findByPhone(phone);
		for(CustomerDto customerDto : customerDtos) {
			System.out.println(customerDto.toString());
		}
	}
	@RequestMapping("/address/{address}")
	public void address(@PathVariable String address) {
		List<CustomerDto> customerDtos = customerService.findByCustomerAddress(address);
		for(CustomerDto customerDto : customerDtos) {
			System.out.println(customerDto.toString());
		}
	}
		
}