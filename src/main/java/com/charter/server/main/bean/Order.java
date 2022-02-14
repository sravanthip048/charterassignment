package com.charter.server.main.bean;

import java.time.LocalDate;

/**
 * This is the Order Bean to support Rewards Program
 *
 */
public class Order {

	private String orderId;
	private Double orderTotal;
	
	private LocalDate orderDate;
	
	
	/**
	 * @param orderId
	 * @param orderTotal
	 * @param month
	 */
	public Order(String orderId, Double orderTotal, LocalDate orderDate) {
		super();
		this.orderId = orderId;
		this.orderTotal = orderTotal;
		this.orderDate = orderDate;
	}
	/**
	 * @return the orderId
	 */
	public String getOrderId() {
		return orderId;
	}
	/**
	 * @param orderId the orderId to set
	 */
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	/**
	 * @return the orderTotal
	 */
	public Double getOrderTotal() {
		return orderTotal;
	}
	/**
	 * @param orderTotal the orderTotal to set
	 */
	public void setOrderTotal(Double orderTotal) {
		this.orderTotal = orderTotal;
	}
	/**
	 * @return the month
	 */
	public LocalDate getOrderDate() {
		return orderDate;
	}
	/**
	 * @param month the month to set
	 */
	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}

	
	
	
	
}
