package com.keiwes.myfirstcolors;

import android.app.Activity;
import android.graphics.Typeface;
import android.media.MediaPlayer;
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
		
		String mColor = getIntent().getStringExtra(COLOR);
		
		//setContentView(ColorFactory.getInstance(mColor));
		
		
		
		if ("purple".equals(mColor)) {
			setContentView(R.layout.purple_view);
			
			//Sets the custom Kids font
			Typeface myTypeface = Typeface.createFromAsset(getAssets(), "fonts/Kids.ttf");
			Button mPurpleButton = (Button) findViewById(R.id.bigPurpleButton);
			mPurpleButton.setTypeface(myTypeface);
			
			mPlayer.play(getBaseContext(), R.raw.purple);
			
			
		} else if ("pink".equals(mColor)) {
			setContentView(R.layout.pink_view);
			
			//Sets the custom Kids font
			Typeface myTypeface = Typeface.createFromAsset(getAssets(), "fonts/Kids.ttf");
			Button mPinkButton = (Button) findViewById(R.id.bigPinkButton);
			mPinkButton.setTypeface(myTypeface);
			
			mPlayer.play(getBaseContext(), R.raw.pink);
			
		} else if ("blue".equals(mColor)) {
			setContentView(R.layout.blue_view);
			
			//Sets the custom Kids font
			Typeface myTypeface = Typeface.createFromAsset(getAssets(), "fonts/Kids.ttf");
			Button mBlueButton = (Button) findViewById(R.id.bigBlueButton);
			mBlueButton.setTypeface(myTypeface);
			
			mPlayer.play(getBaseContext(), R.raw.blue);
			
		} else if ("green".equals(mColor)) {
			setContentView(R.layout.green_view);
			
			//Sets the custom Kids font
			Typeface myTypeface = Typeface.createFromAsset(getAssets(), "fonts/Kids.ttf");
			Button mGreenButton = (Button) findViewById(R.id.bigGreenButton);
			mGreenButton.setTypeface(myTypeface);
			
			mPlayer.play(getBaseContext(), R.raw.green);
			
		} else if ("red".equals(mColor)) {
			setContentView(R.layout.red_view);
			
			//Sets the custom Kids font
			Typeface myTypeface = Typeface.createFromAsset(getAssets(), "fonts/Kids.ttf");
			Button mRedButton = (Button) findViewById(R.id.bigRedButton);
			mRedButton.setTypeface(myTypeface);
			
			mPlayer.play(getBaseContext(), R.raw.red);
			
		} else if ("orange".equals(mColor)) {
			setContentView(R.layout.orange_view);
			
			//Sets the custom Kids font
			Typeface myTypeface = Typeface.createFromAsset(getAssets(), "fonts/Kids.ttf");
			Button mOrangeButton = (Button) findViewById(R.id.bigOrangeButton);
			mOrangeButton.setTypeface(myTypeface);
			
			mPlayer.play(getBaseContext(), R.raw.orange);
			
		} else if ("yellow".equals(mColor)) {
			setContentView(R.layout.yellow_view);
			
			//Sets the custom Kids font
			Typeface myTypeface = Typeface.createFromAsset(getAssets(), "fonts/Kids.ttf");
			Button mYellowButton = (Button) findViewById(R.id.bigYellowButton);
			mYellowButton.setTypeface(myTypeface);
			
			mPlayer.play(getBaseContext(), R.raw.yellow);
			
		} else if ("brown".equals(mColor)) {
			setContentView(R.layout.brown_view);
			
			//Sets the custom Kids font
			Typeface myTypeface = Typeface.createFromAsset(getAssets(), "fonts/Kids.ttf");
			Button mBrownButton = (Button) findViewById(R.id.bigBrownButton);
			mBrownButton.setTypeface(myTypeface);
			
			mPlayer.play(getBaseContext(), R.raw.brown);
		}
		
		
		//The activity ending code will go here. It should go back to the color dashboard.
		
		Handler handler = new Handler(); 
	    handler.postDelayed(new Runnable() { 
	         public void run() { 
	        	 finish();
	         } 
	    }, 1500); 
		
		
	}
	
}
