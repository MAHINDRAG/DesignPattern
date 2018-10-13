package com.app.journaldev.dp.state;

public class TVRemote {

	public static void main(String[] args) {
		TVContext context = new TVContext();
		State tvStartState = new TvStartState();
		State tvStopState = new TvStopState();
		
		context.setState(tvStartState);
		context.doAction();
		
		context.setState(tvStopState);
		context.doAction();
	}
}
