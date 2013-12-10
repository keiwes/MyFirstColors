package com.keiwes.myfirstcolors;

import android.content.Context;
import android.media.MediaPlayer;

public class AudioPlayer {

	private MediaPlayer mPlayer;
	
	public void play(Context c, int colorID) {
		mPlayer = MediaPlayer.create(c, colorID);
		mPlayer.start();
	}
	
}
