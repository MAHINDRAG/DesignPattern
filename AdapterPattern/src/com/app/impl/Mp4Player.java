package com.app.impl;

import com.app.AdvancedMediaPlayer;

public class Mp4Player implements AdvancedMediaPlayer {

	@Override
	public void playVLC(String fileName) {

	}

	@Override
	public void playMP4(String fileName) {
		System.out.println("Playing MP4 file name:"+fileName);
	}

}
