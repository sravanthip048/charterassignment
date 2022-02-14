package com.charter.server.main.service.utilities;

import com.charter.server.main.constants.RewardsConstants;

/**
 * This class contains all the reusable Utilities for Rewards Program.
 *
 */
public class RewardsUtility {

	/**
	 * This method is used to calculate the reward points earned for the orderTotal.
	 * 
	 * @param orderTotal
	 * @return rewards counts.
	 */
	public static int calculatedRewards(double orderTotal) {
		int rewards = 0;
		for (int rewardAmount[] : RewardsConstants.REWARDS_ALLOCATION) {
			if (orderTotal > rewardAmount[0]) {
				int redeemedAmount = (int) (orderTotal - rewardAmount[0]);
				rewards = rewards + (redeemedAmount * rewardAmount[1]);
				orderTotal = orderTotal - redeemedAmount;
			}
		}
		return rewards;

	}
}
