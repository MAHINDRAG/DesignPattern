package com.app.impl;

import com.app.AdvancedMediaPlayer;
import com.app.MediaPlayer;

public class MediaAdapter implements MediaPlayer{

	private AdvancedMediaPlayer advancedMediaPlayer;

	public MediaAdapter(String audioType) {
		if(audioType.equalsIgnoreCase("vlc")){
			advancedMediaPlayer = new VlcPlayer();
		}else if(audioType.equalsIgnoreCase("mp4")){
			advancedMediaPlayer = new Mp4Player();
		}
	}

	@Override
	public void play(String audioType, String fileName) {
		if(audioType.equalsIgnoreCase("vlc")){
			advancedMediaPlayer.playVLC(fileName);
		}else if(audioType.equalsIgnoreCase("mp4")){
			advancedMediaPlayer.playMP4(fileName);
		}
	}

}
