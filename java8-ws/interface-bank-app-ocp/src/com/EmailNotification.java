package com;

public class EmailNotification implements Notification {
	
	@Override
	public void sendNotification() {
		System.out.println("EMAIL :: account number with XXXXXXXXXXXX065 is updated");

	}

}
