package com.dp.frontcontroller.impl;

public class Dispatcher {

	private StudentView studentView;
	private HomeView homeView;

	public Dispatcher() {
		super();
		studentView = new StudentView();
		homeView = new HomeView();
	}

	public void dispatch(String request) {
		if(request.equalsIgnoreCase("STUDENT")) {
			studentView.show();
		}else {
			homeView.show();
		}
	}


}
