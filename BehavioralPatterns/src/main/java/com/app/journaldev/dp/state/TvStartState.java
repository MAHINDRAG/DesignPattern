package com.app.journaldev.dp.state;

public class TvStartState implements State {

	@Override
	public void doAction() {
		System.out.println("TV is turned ON");

	}

}