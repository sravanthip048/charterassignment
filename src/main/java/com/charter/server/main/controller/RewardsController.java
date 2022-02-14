package com.charter.server.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.charter.server.main.bean.Customer;
import com.charter.server.main.bean.CustomerRewards;
import com.charter.server.main.service.RewardsService;

/**
 * This is the Rewards Controller which handles the REST requests.
 *
 */
@RestController
@RequestMapping("/rewards")
public class RewardsController {
	
	@Autowired  
	private RewardsService service; 

	
	/**
	 * This method is used to calculate the reward points earned for each customer per month and total.
	 * 
	 * @param customer
	 * @return customerRewards
	 */
	@PostMapping(path="/calculaterewards")
	public CustomerRewards generateCustomerRewards(@RequestBody Customer customer)  throws Exception
	{  
		return service.getCustomerRewards(customer); 
	}  
}
