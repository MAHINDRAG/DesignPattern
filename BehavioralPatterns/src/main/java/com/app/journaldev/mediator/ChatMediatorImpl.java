package com.app.journaldev.mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatMediatorImpl implements ChatMediator {
	
	private List<User> users;
	
	public ChatMediatorImpl() {
		this.users = new ArrayList<>();
	}

	@Override
	public void sendMessage(String msg, User user) {
	     for(User usr:this.users) {
	    	 if(usr!=user) {
	    		 usr.receive(msg);
	    	 }
	     }
	}

	@Override
	public void addUser(User user) {
        this.users.add(user);
	}

}
