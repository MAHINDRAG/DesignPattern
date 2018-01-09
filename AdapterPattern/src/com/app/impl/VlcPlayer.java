package com.app.impl;

import com.app.AdvancedMediaPlayer;

public class VlcPlayer implements AdvancedMediaPlayer{

	@Override
	public void playVLC(String fileName) {
	  System.out.println("Playing VLC file Name:"+fileName);	
	}

	@Override
	public void playMP4(String fileName) {
		
	}

}
