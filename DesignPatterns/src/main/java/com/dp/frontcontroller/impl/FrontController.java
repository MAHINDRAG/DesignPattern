package com.dp.frontcontroller.impl;

public class FrontController {

	private Dispatcher dispatcher;

	public FrontController() {
		dispatcher = new Dispatcher();
	}

	private boolean isAuthenticUser() {
		System.out.println("user is Authenticated successfully");
		return true;
	}

	public void trackRequest(String request) {
		System.out.println("Page Requested :"+request);
	}

	public void dispatchRequest(String request) {
		trackRequest(request);

		if(isAuthenticUser()) {
			dispatcher.dispatch(request);
		}
	}
}
