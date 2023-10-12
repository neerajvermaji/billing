package com.farmersmart.Billing.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Billing")
public class BilingEntity {
	@Id
	 int id;
	 int customerId;
	private String name;
	private String paymentMode;
	private String address;
	private long phone;
	private int pincode;
	public BilingEntity() {
		super();
	}
	public BilingEntity(int id, int customerId, String name, String paymentMode, String address, long phone,
			int pincode) {
		super();
		this.id = id;
		this.customerId = customerId;
		this.name = name;
		this.paymentMode = paymentMode;
		this.address = address;
		this.phone = phone;
		this.pincode = pincode;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPaymentMode() {
		return paymentMode;
	}
	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "BilingEntity [id=" + id + ", customerId=" + customerId + ", name=" + name + ", paymentMode="
				+ paymentMode + ", address=" + address + ", phone=" + phone + ", pincode=" + pincode + "]";
	}
	
	
	
}
