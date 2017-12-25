package com.app.common.expection;

public class PluginException extends RuntimeException{

	/**
	 * gopisma
	 */
	private static final long serialVersionUID = 1L;
	public static final String businessType = "Please Choose your businessType";
	public static final String amountRequired = "Please Enter Amount";
	public static final String rechargeType= "Please choose select type";
	public static final String plans = "Please Select your plans";
	public PluginException(String msg){
		super(msg);
	}
}
