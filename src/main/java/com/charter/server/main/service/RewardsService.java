package com.charter.server.main.service;

import java.util.HashMap;

import org.springframework.stereotype.Service;

import com.charter.server.main.bean.Customer;
import com.charter.server.main.bean.CustomerRewards;
import com.charter.server.main.bean.Order;
import com.charter.server.main.service.utilities.RewardsUtility;

@Service
public class RewardsService {

	/**
	 * This service method is used to calculate the reward points earned for each customer per month and total.
	 * 
	 * @param customer
	 * @return customerRewards
	 */
	public CustomerRewards getCustomerRewards(Customer customer) throws Exception
	
	{  
		CustomerRewards customerRewards = new CustomerRewards();
		
		//if customer name is not null or blank in the request
		if(null != customer.getName()) {
			customerRewards.setName(customer.getName());
			customerRewards.setMonthlyRewards(new HashMap<String,Integer>());
			int totalRewards = 0;
			
			//iterate through orders of the customers.
			for(Order order : customer.getOrders()) {
				String month = order.getOrderDate().getMonth().toString();
				
				//calculate the monthly rewards
				int monthlyRewards = RewardsUtility.calculatedRewards(order.getOrderTotal());
				
				//add it to the total rewards
				totalRewards = totalRewards + monthlyRewards;
				
				if(!customerRewards.getMonthlyRewards().containsKey(month)) {
					customerRewards.getMonthlyRewards().put(month, monthlyRewards);
				} else {
					customerRewards.getMonthlyRewards().put(month, 
							customerRewards.getMonthlyRewards().get(month) + monthlyRewards);
				}
				
			}
			customerRewards.setTotalRewards(totalRewards);
		} else {
			//If customername is null, throw exception.
			throw new Exception("Customer name cannot be null");
		}
		return customerRewards;
	}

	
	
	
}
