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
		
		mPurpleButton.setOnClickListener(new Button.OnClickListener() {
			public void onClick(View v) {
				//If Jelly Bean or higher, button animates
				if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
					Intent intent = new Intent(MainActivity.this, ColorActivity.class);
					//String selectedColor = "purple";
					//intent.putExtra(ColorActivity.COLOR, selectedColor);
					Bundle scaleBundle = ActivityOptions.makeScaleUpAnimation(
	                        v, 0, 0, v.getWidth(), v.getHeight()).toBundle();
					startActivity(intent, scaleBundle);
				}
				else {
					Intent intent = new Intent(MainActivity.this, ColorActivity.class);
					startActivity(intent);
				}
			}
		});

	}

}
