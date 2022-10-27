package com;

import java.util.List;

public class Bank implements Customer, BankEmployee, Manager {
	
	
	//private Notification notification;
	
	private List<Notification> notifications;
	
	
	public void setNotifications(List<Notification> notifications) {
		this.notifications = notifications;
	}

	@Override
	public void lockerAccess() {
		System.out.println("locker access provided..");
	}

	@Override
	public void deposit() {
		System.out.println("depositiong");
		notifications.forEach(notification->notification.sendNotification());
	}

	@Override
	public void withDraw() {
		System.out.println("withdrawing");
		notifications.forEach(notification->notification.sendNotification());
	}

	@Override
	public void openAccount() {
		System.out.println("opening account");
	}

	@Override
	public void closeAccount() {
		System.out.println("closing account");
	}

}
