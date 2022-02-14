package com.charter.server.main.bean;

import java.util.Map;

/**
 * This is the CustomerRewards bean to support Rewards Program
 *
 */
public class CustomerRewards {

	private String name;
	private int totalRewards;
	private Map<String,Integer> monthlyRewards;

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
	 * @return the totalRewards
	 */
	public int getTotalRewards() {
		return totalRewards;
	}

	/**
	 * @param totalRewards the totalRewards to set
	 */
	public void setTotalRewards(int totalRewards) {
		this.totalRewards = totalRewards;
	}

	/**
	 * @return the monthlyRewards
	 */
	public Map<String, Integer> getMonthlyRewards() {
		return monthlyRewards;
	}

	/**
	 * @param monthlyRewards the monthlyRewards to set
	 */
	public void setMonthlyRewards(Map<String, Integer> monthlyRewards) {
		this.monthlyRewards = monthlyRewards;
	}

	
	
}
