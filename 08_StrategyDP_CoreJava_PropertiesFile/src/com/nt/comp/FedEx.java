package com.nt.comp;

public final class FedEx implements Courier {

	public FedEx() {
		System.out.println("FedEx : 0-param constructor");
	}

	@Override
	public String delivery(int orderId) {
		return "will be delivered with orderId : " + orderId + " through FedEx";
	}

}
