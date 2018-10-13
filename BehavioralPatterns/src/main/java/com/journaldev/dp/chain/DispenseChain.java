package com.journaldev.dp.chain;

public interface DispenseChain {

	void setNextChain(DispenseChain nextChain);
	void dispense(Currency cur);
}
