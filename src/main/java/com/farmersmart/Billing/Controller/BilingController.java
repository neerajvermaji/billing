package com.farmersmart.Billing.Controller;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.farmersmart.Billing.Entity.BilingEntity;
import com.farmersmart.Billing.Service.BilingService;

@RestController
public class BilingController {
	private static final Logger logger = LoggerFactory.getLogger(BilingService.class);

	@Autowired
	BilingService service;

	@PostMapping("/addBilling")
	public String addBilling(@RequestBody BilingEntity entity) {
		return service.addBilling(entity);
	}
	@GetMapping("/getBillingDetails")
	public List<BilingEntity> getBillingDetails(){
		return service.getBillingDetails();
	}
	@GetMapping("/getBillingById")
	public Optional<BilingEntity> getBillingById(@RequestParam int id){
		return service.getBillingById(id);
	}
	@GetMapping("/getBillingBYCustomerId")
	public List<BilingEntity> getBillingBYCustomerId(@RequestParam int id){
		return service.getBillingBYCustomerId(id);
	}
	@GetMapping("/getBillingCustomerName")
	public String getBillingCustomerName(@RequestParam String name){
		return service.getBillingCustomerName(name);
	}
	@GetMapping("/getBillingCustomerphoneAndPincode")
	public List<BilingEntity> getBillingCustomerphoneAndPincode(@RequestParam long phone,@RequestParam int pincode){
		return service.getBillingCustomerphoneAndPincode(phone,pincode);
	}
	
	@PutMapping("/updateBilling")
	public String updateBilling(@RequestBody BilingEntity entity ) {
		return service.updateBilling(entity);
	}
	
	@DeleteMapping("/deletebilingById")
	public String deletebilingById(@RequestParam int id) {
		return service.deletebilingById(id);
	}
}
