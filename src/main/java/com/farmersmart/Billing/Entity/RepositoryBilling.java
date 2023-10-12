package com.farmersmart.Billing.Entity;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface RepositoryBilling extends JpaRepository<BilingEntity, Integer>{

	public List<BilingEntity> findByphoneAndPincode(long phone, int pincode);

	public String findByname(String name);

	public List<BilingEntity> findByCustomerId(int id);

}
