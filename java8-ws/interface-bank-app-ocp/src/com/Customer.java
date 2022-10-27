package com;

import java.util.List;

public interface Customer {

	void deposit();

	void withDraw();
	
	public void setNotifications(List<Notification> notifications);
}