package com.nt.comp;

public final class DTDC implements Courier {
	
	public DTDC() {
		System.out.println("DTDC : 0-param constructor");
	}


	@Override
	public String delivery(int orderId) {
		return "will be delivered with orderId : " + orderId + " through DTDC";
	}

}
