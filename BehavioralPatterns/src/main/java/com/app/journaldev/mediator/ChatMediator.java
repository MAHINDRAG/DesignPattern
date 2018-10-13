package com.app.journaldev.mediator;

public interface ChatMediator {

	public void sendMessage(String msg, User user);
	void addUser(User user);
}
