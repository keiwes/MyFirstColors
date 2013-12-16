package com.keiwes.singingcolors;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Button;

public class ColorActivity extends Activity {

	protected static final String COLOR = null;
	private AudioPlayer mPlayer = new AudioPlayer();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.purple_view);
		
		//Gets color from MainActivity.
		String mColor = getIntent().getStringExtra(COLOR);
		
		//Custom font.
		Typeface mTypeface = Typeface.createFromAsset(getAssets(), "fonts/Kids.ttf");

		if ("purple".equals(mColor)) {
			setContentView(R.layout.purple_view);
			
			Button mPurpleButton = (Button) findViewById(R.id.bigPurpleButton);
			mPurpleButton.setTypeface(mTypeface);
			
			mPlayer.play(this, R.raw.purple);	
			
		} else if ("pink".equals(mColor)) {
			setContentView(R.layout.pink_view);
			
			Button mPinkButton = (Button) findViewById(R.id.bigPinkButton);
			mPinkButton.setTypeface(mTypeface);
			
			mPlayer.play(this, R.raw.pink);
			
		} else if ("blue".equals(mColor)) {
			setContentView(R.layout.blue_view);
			
			Button mBlueButton = (Button) findViewById(R.id.bigBlueButton);
			mBlueButton.setTypeface(mTypeface);
			
			mPlayer.play(this, R.raw.blue);
			
		} else if ("green".equals(mColor)) {
			setContentView(R.layout.green_view);
			
			Button mGreenButton = (Button) findViewById(R.id.bigGreenButton);
			mGreenButton.setTypeface(mTypeface);
			
			mPlayer.play(this, R.raw.green);
			
		} else if ("red".equals(mColor)) {
			setContentView(R.layout.red_view);
			
			Button mRedButton = (Button) findViewById(R.id.bigRedButton);
			mRedButton.setTypeface(mTypeface);
			
			mPlayer.play(this, R.raw.red);
			
		} else if ("orange".equals(mColor)) {
			setContentView(R.layout.orange_view);
			
			Button mOrangeButton = (Button) findViewById(R.id.bigOrangeButton);
			mOrangeButton.setTypeface(mTypeface);
			
			mPlayer.play(this, R.raw.orange);
			
		} else if ("yellow".equals(mColor)) {
			setContentView(R.layout.yellow_view);
			
			Button mYellowButton = (Button) findViewById(R.id.bigYellowButton);
			mYellowButton.setTypeface(mTypeface);
			
			mPlayer.play(this, R.raw.yellow);
			
		} else if ("brown".equals(mColor)) {
			setContentView(R.layout.brown_view);
			
			Button mBrownButton = (Button) findViewById(R.id.bigBrownButton);
			mBrownButton.setTypeface(mTypeface);
			
			mPlayer.play(this, R.raw.brown);
		}
		
		//Activity automatically closes after 1500ms and releases memory from Media Player.
		Handler handler = new Handler(); 
	    handler.postDelayed(new Runnable() { 
	         public void run() { 
	        	 mPlayer.release();
	        	 finish();
	         } 
	    }, 1500); 
		
	}
	
}
