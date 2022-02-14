package com.charter.server.main.bean;

import java.util.List;

/**
 * This is the Customer Bean to support Rewards Program
 *
 */
public class Customer {

	private String name;
	private List<Order> orders;

	/**
	 * @param name
	 * @param orders
	 */
	public Customer(String name, List<Order> orders) {
		super();
		this.name = name;
		this.orders = orders;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the orders
	 */
	public List<Order> getOrders() {
		return orders;
	}

	/**
	 * @param orders the orders to set
	 */
	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

}
