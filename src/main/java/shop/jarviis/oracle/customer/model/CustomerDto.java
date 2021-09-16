package shop.jarviis.oracle.customer.model;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class CustomerDto {
	private int customerId;
	private String customerName;
	private String address;
	private String phoneN;
	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneN() {
		return phoneN;
	}
	public void setPhoneN(String phoneN) {
		this.phoneN = phoneN;
	}
	
	
	@Override
	public String toString() {
		return String.format("구매자Id: %d,구매자이름: %s,구매자주소:%s,구매자전화번호:%s",customerId,customerName,address,phoneN);
	}
	
	
	
}
