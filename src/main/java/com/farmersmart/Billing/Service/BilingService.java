package com.farmersmart.Billing.Service;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.farmersmart.Billing.Entity.BilingEntity;
import com.farmersmart.Billing.Entity.RepositoryBilling;

@Service
public class BilingService {
	
	private static final Logger logger = LoggerFactory.getLogger(BilingService.class);
	
	@Autowired
	RepositoryBilling billingReository;

	public String addBilling(BilingEntity entity) {
		// TODO Auto-generated method stub
		System.out.println(entity.toString());
		logger.info(entity.toString());
		billingReository.save(entity);
		return "Bill has been Added successfully";
	}

	public List<BilingEntity> getBillingDetails() {
		// TODO Auto-generated method stub
		return billingReository.findAll();
	}

	public Optional<BilingEntity> getBillingById(int id) {
		// TODO Auto-generated method stub
		return billingReository.findById(id) ;
	}
	public List<BilingEntity> getBillingBYCustomerId(int id) {
		// TODO Auto-generated method stub
		return billingReository.findByCustomerId(id);
	}

	public String getBillingCustomerName(String name) {
		// TODO Auto-generated method stub
		return billingReository.findByname(name);
	}

	public List<BilingEntity> getBillingCustomerphoneAndPincode(long phone, int pincode) {
		// TODO Auto-generated method stub
		return billingReository.findByphoneAndPincode(phone,pincode);
	}

	public String updateBilling(BilingEntity entity) {
		// TODO Auto-generated method stub
		billingReository.save(entity);
		return "Bill has been updated successfully";
	}

	public String deletebilingById(int id) {
		// TODO Auto-generated method stub
		String message;
		try {
		message="Bill has been deleted successfully";
		billingReository.deleteById(id);
		logger.info(message);
		}
		catch(Exception e){
		message="Invalid id"+id;
		logger.error(message);
		}return message;
	}
}

