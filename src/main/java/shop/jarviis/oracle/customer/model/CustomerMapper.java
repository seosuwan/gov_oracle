package shop.jarviis.oracle.customer.model;

import java.util.List;

import org.springframework.stereotype.Repository;

import shop.jarviis.oracle.common.GenericInterface;

@Repository
public interface CustomerMapper extends GenericInterface<CustomerDto, Integer> {
	public List<CustomerDto> findByCustomerName(String customerName);
	public List<CustomerDto> findByaddress(String address);
	public List<CustomerDto> findByphoneN(String phoneN);

}

