package shop.jarviis.oracle.customer.model;

import java.util.List;

import org.springframework.stereotype.Component;

import shop.jarviis.oracle.common.GenericInterface;

@Component
public interface CustomerService extends GenericInterface<CustomerDto, Integer> {
	public List<CustomerDto> findByCustomerName(String customerName);
	public List<CustomerDto> findByCustomerAddress(String address);
	public List<CustomerDto> findByPhone(String phone);

}
