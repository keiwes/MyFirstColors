package com.keiwes.myfirstcolors;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

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

		Button mPurpleButton = (Button) findViewById(R.id.purpleButton);
		Button mPinkButton = (Button) findViewById(R.id.pinkButton);
		Button mBlueButton = (Button) findViewById(R.id.blueButton);
		Button mGreenButton = (Button) findViewById(R.id.greenButton);
		Button mRedButton = (Button) findViewById(R.id.redButton);
		Button mOrangeButton = (Button) findViewById(R.id.orangeButton);
		Button mYellowButton = (Button) findViewById(R.id.yellowButton);
		Button mBrownButton = (Button) findViewById(R.id.brownButton);
		
		//mPurpleButton.animateButton()
		
		mPurpleButton.setOnClickListener(new Button.OnClickListener() {
			public void onClick(View v) {
				
				//If Jelly Bean or higher, button animates.
				if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
					Intent intent = new Intent(MainActivity.this, ColorActivity.class);
					
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
