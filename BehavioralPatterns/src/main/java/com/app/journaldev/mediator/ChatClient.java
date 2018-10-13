package com.app.journaldev.mediator;

public class ChatClient {

	public static void main(String[] args) {
		ChatMediator chatMediator = new ChatMediatorImpl();
		User user1 = new UserImpl(chatMediator, "Mahindra");
		User user2 = new UserImpl(chatMediator, "Janardhan");
		User user3 = new UserImpl(chatMediator, "Jagan");
		User user4 = new UserImpl(chatMediator, "Rama");
		chatMediator.addUser(user1);
		chatMediator.addUser(user2);
		chatMediator.addUser(user3);
		chatMediator.addUser(user4);
		user1.send("Hi, Good Morning to everyone");
	}
}
