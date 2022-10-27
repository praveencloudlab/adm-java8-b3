package com;

import java.util.ArrayList;
import java.util.List;

public class MainTest {

	public static void main(String[] args) {
		
		Customer cust=new Bank();
		BankEmployee be=new Bank();
		Manager mgr=new Bank();
		
		Notification notification=new SmsNotification();
		Notification emailNotification=new EmailNotification();
		Notification whatsAppNotification=new WhatsAppNotification();
		
		List<Notification> notifications=new ArrayList<>();
		
		notifications.add(emailNotification);
		notifications.add(notification);
		notifications.add(whatsAppNotification);
		
		//cust.setNotification(notification);
		//cust.setNotification(emailNotification);
		
		cust.setNotifications(notifications);
		
		cust.withDraw();
		cust.deposit();
		
		be.openAccount();
		be.closeAccount();
		
		mgr.lockerAccess();
		
		
	
		
		
		

	}

}
