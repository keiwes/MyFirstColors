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
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);	
	}
	
	//Needed for button animation introduced in Jelly Bean
	@TargetApi(16)
	public void onClick(View v) {
		
		Intent intent = new Intent(MainActivity.this, ColorActivity.class);
			
		//Sends ColorActivity the button pressed to display appropriate view.
		switch(v.getId()) {
			
		case R.id.purpleButton: {
			String selectedColor = PURPLE;
			intent.putExtra(ColorActivity.COLOR, selectedColor);
			break; 
			}
		case R.id.pinkButton: {
			String selectedColor = PINK;
			intent.putExtra(ColorActivity.COLOR, selectedColor);
			break; 
			}
		case R.id.blueButton: {
			String selectedColor = BLUE;
			intent.putExtra(ColorActivity.COLOR, selectedColor);
			break; 
			}
		case R.id.greenButton: {
			String selectedColor = GREEN;
			intent.putExtra(ColorActivity.COLOR, selectedColor);
			break; 
			}
		case R.id.redButton: {
			String selectedColor = RED;
			intent.putExtra(ColorActivity.COLOR, selectedColor);
			break; 
			}
		case R.id.orangeButton: {
			String selectedColor = ORANGE;
			intent.putExtra(ColorActivity.COLOR, selectedColor);
			break; 
			}
		case R.id.yellowButton: {
			String selectedColor = YELLOW;
			intent.putExtra(ColorActivity.COLOR, selectedColor);
			break; 
			}
		case R.id.brownButton: {
			String selectedColor = BROWN;
			intent.putExtra(ColorActivity.COLOR, selectedColor);
			break; 
			}
		}
			
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
			//If Jelly Bean or higher, button animates.
			Bundle scaleBundle = ActivityOptions.makeScaleUpAnimation(
                    v, 0, 0, v.getWidth(), v.getHeight()).toBundle();
			
			startActivity(intent, scaleBundle);
			}
		
		//Ice Cream Sandwich or lower, default animation.
		else {
			startActivity(intent);
			}
	}
}
