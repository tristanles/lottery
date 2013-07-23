package org.tristanles.results;

import org.tristanles.Winner;

public class WinnersResult implements LotteryResult {

	private Winner first;
	private Winner second;
	private Winner third;
	
	public WinnersResult(Winner first, Winner second, Winner third) {
		this.first = first;
		this.second = second;
		this.third = third;
	}
	
	public void display() {
		// TODO Auto-generated method stub
	}

	public Winner getFirst() {
		return first;
	}

	public Winner getSecond() {
		return second;
	}

	public Winner getThird() {
		return third;
	}

}
