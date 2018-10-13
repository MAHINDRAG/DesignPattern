package com.dp.frontcontroller;

import com.dp.frontcontroller.impl.FrontController;

public class FrontControllerPatternDemo {

	public static void main(String[] args) {
		
		FrontController frontController = new FrontController();
		frontController.dispatchRequest("STUDENT");
		frontController.dispatchRequest("HOME");
	}
}
