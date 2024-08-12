package com;

public class Battery {
	
	private String mAh; 
	private String talkTime; 
	private String chargeTime;
	
	
	public Battery(String mAh, String talkTime, String chargeTime) {
		super();
		this.mAh = mAh;
		this.talkTime = talkTime;
		this.chargeTime = chargeTime;
	}


	@Override
	public String toString() {
		return "Battery [mAh=" + mAh + ", talkTime=" + talkTime + ", chargeTime=" + chargeTime + "]";
	} 
	
	
	
	

}
