package com;

public class SmsNotification implements Notification {

	@Override
	public void sendNotification() {
		System.out.println("SMS :: account number with XXXXXXXXXXXX065 is updated");

	}

}
