package com.keiwes.singingcolors;

import android.content.Context;
import android.media.MediaPlayer;

public class AudioPlayer {

	private MediaPlayer mPlayer;
	
	public void play(Context c, int colorID) {
		mPlayer = MediaPlayer.create(c, colorID);
		mPlayer.start();
	}
	
	public void release () {
		mPlayer.release();
	}
	
}
