package com.keiwes.singingcolors;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Intent;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

	public static final String PURPLE = "purple";
	public static final String PINK = "pink";
	public static final String BLUE = "blue";
	public static final String GREEN = "green";
	public static final String RED = "red";
	public static final String ORANGE = "orange";
	public static final String YELLOW = "yellow";
	public static final String BROWN = "brown";
	
	private boolean oneClick = false;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);	
		
		//Allows volume rocker to always affect system volume and not ringer volume.
		setVolumeControlStream(AudioManager.STREAM_MUSIC);
	}
	
	//Needed for button animation introduced in Jelly Bean.
	@TargetApi(16)
	
	public void onClick(View v) {

		//Allows one button at a time.
		if (oneClick == false) {
			oneClick = true;

			//Needed to send color to ColorActivity
			Intent intent = new Intent(MainActivity.this, ColorActivity.class);

			String selectedColor = null;

			// Sends ColorActivity the button pressed to display appropriate view.
			switch (v.getId()) {

			case R.id.purpleButton:
				selectedColor = PURPLE;
				break;
			case R.id.pinkButton:
				selectedColor = PINK;
				break;
			case R.id.blueButton:
				selectedColor = BLUE;
				break;
			case R.id.greenButton:
				selectedColor = GREEN;
				break;
			case R.id.redButton:
				selectedColor = RED;
				break;
			case R.id.orangeButton:
				selectedColor = ORANGE;
				break;
			case R.id.yellowButton:
				selectedColor = YELLOW;
				break;
			case R.id.brownButton:
				selectedColor = BROWN;
				break;
			default:
				selectedColor = PURPLE;
				break;
			}

			intent.putExtra(ColorActivity.COLOR, selectedColor);

			// If Jelly Bean or higher, button animates.
			if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
				Bundle scaleBundle = ActivityOptions.makeScaleUpAnimation(v, 0,
						0, v.getWidth(), v.getHeight()).toBundle();

				startActivity(intent, scaleBundle);
			}

			//Ice Cream Sandwich or lower, default animation.
			else {
				startActivity(intent);
			}
		}
	}
	
	//Allows one button at a time.
	@Override
	protected void onResume() {
		oneClick = false;
		
		super.onResume();
	}
}
