package shop.jarviis.oracle.customer.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {
	@Autowired CustomerMapper customerMapper;

	@Override
	public void save(CustomerDto t) {
		customerMapper.save(t);
		
	}

	@Override
	public CustomerDto findById(Integer id) {
		return customerMapper.findById(id);
	}

	@Override
	public List<CustomerDto> findAll() {
		return customerMapper.findAll();
	}

	@Override
	public void update(CustomerDto t) {
		customerMapper.update(t);
	}

	@Override
	public void delete(Integer id) {
		customerMapper.delete(id);
	}

	@Override
	public List<CustomerDto> findByCustomerName(String customerName) {
		return customerMapper.findByCustomerName(customerName);
	}

	@Override
	public List<CustomerDto> findByCustomerAddress(String address) {
		return customerMapper.findByaddress(address);
	}

	@Override
	public List<CustomerDto> findByPhone(String phone) {
		return customerMapper.findByphoneN(phone);
	}

	
}
