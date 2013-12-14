package com.keiwes.myfirstcolors;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
//import android.view.SurfaceHolder;
//import android.view.

public class MainActivity extends Activity {

	public static final String PURPLE = "purple";
	public static final String PINK = "pink";
	public static final String BLUE = "blue";
	public static final String GREEN = "green";
	public static final String RED = "red";
	public static final String ORANGE = "orange";
	public static final String YELLOW = "yellow";
	public static final String BROWN = "brown";
	
	//Needed for button animation introduced in Jelly Bean
	@TargetApi(16) 
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

	
		final Button mPurpleButton = (Button) findViewById(R.id.purpleButton);
		final Button mPinkButton = (Button) findViewById(R.id.pinkButton);
		final Button mBlueButton = (Button) findViewById(R.id.blueButton);
		final Button mGreenButton = (Button) findViewById(R.id.greenButton);
		final Button mRedButton = (Button) findViewById(R.id.redButton);
		final Button mOrangeButton = (Button) findViewById(R.id.orangeButton);
		final Button mYellowButton = (Button) findViewById(R.id.yellowButton);
		final Button mBrownButton = (Button) findViewById(R.id.brownButton);
		
		//mPurpleButton.animateButton()
		
		mPurpleButton.setOnClickListener(new Button.OnClickListener() {
			public void onClick(View v) {
				
				//If Jelly Bean or higher, button animates.
				if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
					Intent intent = new Intent(MainActivity.this, ColorActivity.class);
					
				// Restrains clickable action on other buttons until view action has executed
					mPinkButton.setClickable (false); 
					mBlueButton.setClickable (false); 
					mGreenButton.setClickable(false);
					mRedButton.setClickable(false);
					mYellowButton.setClickable(false);
					mBrownButton.setClickable(false);
					mOrangeButton.setClickable(false);
					
					//Sends ColorActivity the button pressed to display appropriate view.
					String selectedColor = PURPLE;
					intent.putExtra(ColorActivity.COLOR, selectedColor);
					
					//Scale Animation.
					Bundle scaleBundle = ActivityOptions.makeScaleUpAnimation(
	                        v, 0, 0, v.getWidth(), v.getHeight()).toBundle();
					
					startActivity(intent, scaleBundle);
				}
				
				//Ice Cream Sandwich or lower, default animation.
				else {
					Intent intent = new Intent(MainActivity.this, ColorActivity.class);
					startActivity(intent);
				}
			}
		});
		
		mPinkButton.setOnClickListener(new Button.OnClickListener() {
			public void onClick(View v) {
				
				//If Jelly Bean or higher, button animates.
				if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
					Intent intent = new Intent(MainActivity.this, ColorActivity.class);
					
					// Restrains clickable action on other buttons until view action has executed
					mPurpleButton.setClickable (false); 
					mBlueButton.setClickable (false); 
					mGreenButton.setClickable(false);
					mRedButton.setClickable(false);
					mYellowButton.setClickable(false);
					mBrownButton.setClickable(false);
					mOrangeButton.setClickable(false);
					
					//Sends ColorActivity the button pressed to display appropriate view.
					String selectedColor = PINK;
					intent.putExtra(ColorActivity.COLOR, selectedColor);
					
					//Scale Animation.
					Bundle scaleBundle = ActivityOptions.makeScaleUpAnimation(
	                        v, 0, 0, v.getWidth(), v.getHeight()).toBundle();
					
					startActivity(intent, scaleBundle);
				}
				
				//Ice Cream Sandwich or lower, default animation.
				else {
					Intent intent = new Intent(MainActivity.this, ColorActivity.class);
					startActivity(intent);
				}
			}
		});

		mBlueButton.setOnClickListener(new Button.OnClickListener() {
			public void onClick(View v) {
				
				//If Jelly Bean or higher, button animates.
				if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
					Intent intent = new Intent(MainActivity.this, ColorActivity.class);
					
				// Restrains all other buttons from being clickable while view is executing 
					mPurpleButton.setClickable (false); 
					mPinkButton.setClickable (false); 
					mGreenButton.setClickable(false);
					mRedButton.setClickable(false);
					mYellowButton.setClickable(false);
					mBrownButton.setClickable(false);
					mOrangeButton.setClickable(false);
					
					//Sends ColorActivity the button pressed to display appropriate view.
					String selectedColor = BLUE;
					intent.putExtra(ColorActivity.COLOR, selectedColor);
					
					//Scale Animation.
					Bundle scaleBundle = ActivityOptions.makeScaleUpAnimation(
	                        v, 0, 0, v.getWidth(), v.getHeight()).toBundle();
					
					startActivity(intent, scaleBundle);
				}
				
				//Ice Cream Sandwich or lower, default animation.
				else {
					Intent intent = new Intent(MainActivity.this, ColorActivity.class);
					startActivity(intent);
				}
			}
		});
		
		mGreenButton.setOnClickListener(new Button.OnClickListener() {
			public void onClick(View v) {
				
				//If Jelly Bean or higher, button animates.
				if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
					Intent intent = new Intent(MainActivity.this, ColorActivity.class);
					
					// Restrains all other buttons from being clickable while view is executing
					mPurpleButton.setClickable (false); 
					mPinkButton.setClickable (false); 
					mBlueButton.setClickable(false);
					mRedButton.setClickable(false);
					mYellowButton.setClickable(false);
					mBrownButton.setClickable(false);
					mOrangeButton.setClickable(false);
					
					//Sends ColorActivity the button pressed to display appropriate view.
					String selectedColor = GREEN;
					intent.putExtra(ColorActivity.COLOR, selectedColor);
					
					//Scale Animation.
					Bundle scaleBundle = ActivityOptions.makeScaleUpAnimation(
	                        v, 0, 0, v.getWidth(), v.getHeight()).toBundle();
					
					startActivity(intent, scaleBundle);
				}
				
				//Ice Cream Sandwich or lower, default animation.
				else {
					Intent intent = new Intent(MainActivity.this, ColorActivity.class);
					startActivity(intent);
				}
			}
		});
		
		mRedButton.setOnClickListener(new Button.OnClickListener() {
			public void onClick(View v) {
				
				//If Jelly Bean or higher, button animates.
				if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
					Intent intent = new Intent(MainActivity.this, ColorActivity.class);
					
				// Restrains all other buttons from being clickable while view is executing
					mPurpleButton.setClickable (false); 
					mPinkButton.setClickable (false); 
					mBlueButton.setClickable(false);
					mGreenButton.setClickable(false);
					mYellowButton.setClickable(false);
					mBrownButton.setClickable(false);
					mOrangeButton.setClickable(false);
					
					//Sends ColorActivity the button pressed to display appropriate view.
					String selectedColor = RED;
					intent.putExtra(ColorActivity.COLOR, selectedColor);
					
					//Scale Animation.
					Bundle scaleBundle = ActivityOptions.makeScaleUpAnimation(
	                        v, 0, 0, v.getWidth(), v.getHeight()).toBundle();
					
					startActivity(intent, scaleBundle);
				}
				
				//Ice Cream Sandwich or lower, default animation.
				else {
					Intent intent = new Intent(MainActivity.this, ColorActivity.class);
					startActivity(intent);
				}
			}
		});
		
		mOrangeButton.setOnClickListener(new Button.OnClickListener() {
			public void onClick(View v) {
				
				//If Jelly Bean or higher, button animates.
				if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
					Intent intent = new Intent(MainActivity.this, ColorActivity.class);
					
					// Restrains all other buttons from being clickable while view is executing
					mPurpleButton.setClickable (false); 
					mPinkButton.setClickable (false); 
					mBlueButton.setClickable(false);
					mGreenButton.setClickable(false);
					mRedButton.setClickable(false);
					mYellowButton.setClickable(false);
					mBrownButton.setClickable(false);
				
					
					
					//Sends ColorActivity the button pressed to display appropriate view.
					String selectedColor = ORANGE;
					intent.putExtra(ColorActivity.COLOR, selectedColor);
					
					//Scale Animation.
					Bundle scaleBundle = ActivityOptions.makeScaleUpAnimation(
	                        v, 0, 0, v.getWidth(), v.getHeight()).toBundle();
					
					startActivity(intent, scaleBundle);
				}
				
				//Ice Cream Sandwich or lower, default animation.
				else {
					Intent intent = new Intent(MainActivity.this, ColorActivity.class);
					startActivity(intent);
				}
			}
		});

		mYellowButton.setOnClickListener(new Button.OnClickListener() {
			public void onClick(View v) {
				
				//If Jelly Bean or higher, button animates.
				if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
					Intent intent = new Intent(MainActivity.this, ColorActivity.class);
					
					// Restrains all other buttons from being clickable while view is executing
					mPurpleButton.setClickable (false); 
					mPinkButton.setClickable (false); 
					mBlueButton.setClickable(false);
					mGreenButton.setClickable(false);
					mRedButton.setClickable(false);
					mOrangeButton.setClickable(false);
					mBrownButton.setClickable(false);
				
					
					//Sends ColorActivity the button pressed to display appropriate view.
					String selectedColor = YELLOW;
					intent.putExtra(ColorActivity.COLOR, selectedColor);
					
					//Scale Animation.
					Bundle scaleBundle = ActivityOptions.makeScaleUpAnimation(
	                        v, 0, 0, v.getWidth(), v.getHeight()).toBundle();
					
					startActivity(intent, scaleBundle);
				}
				
				//Ice Cream Sandwich or lower, default animation.
				else {
					Intent intent = new Intent(MainActivity.this, ColorActivity.class);
					startActivity(intent);
				}
			}
		});

		mBrownButton.setOnClickListener(new Button.OnClickListener() {
			public void onClick(View v) {
				
				//If Jelly Bean or higher, button animates.
				if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
					Intent intent = new Intent(MainActivity.this, ColorActivity.class);
					
				// Restrains all other buttons from being clickable while view is executing
					mPurpleButton.setClickable (false); 
					mPinkButton.setClickable (false); 
					mBlueButton.setClickable(false);
					mGreenButton.setClickable(false);
					mRedButton.setClickable(false);
					mOrangeButton.setClickable(false);
					mYellowButton.setClickable(false);
					
					//Sends ColorActivity the button pressed to display appropriate view.
					String selectedColor = BROWN;
					intent.putExtra(ColorActivity.COLOR, selectedColor);
					
					//Scale Animation.
					Bundle scaleBundle = ActivityOptions.makeScaleUpAnimation(
	                        v, 0, 0, v.getWidth(), v.getHeight()).toBundle();
					
					startActivity(intent, scaleBundle);
				}
				
				//Ice Cream Sandwich or lower, default animation.
				else {
					Intent intent = new Intent(MainActivity.this, ColorActivity.class);
					startActivity(intent);
				}
			}
		});
		
	}

}
