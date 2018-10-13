package com.app.journaldev.dp.state;

public class TVContext implements State {
	
	private State state;
	
	

	public State getState() {
		return state;
	}



	public void setState(State state) {
		this.state = state;
	}



	@Override
	public void doAction() {
       state.doAction();
	}

}
