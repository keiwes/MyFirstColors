package com.keiwes.myfirstcolors;

import java.util.Timer;
import java.util.TimerTask;

import android.app.Activity;
import android.os.Bundle;

public class ColorActivity extends Activity {

	//protected static final String COLOR = null;
	//private String mColor = getIntent().getStringExtra(COLOR);

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.purple_view);
		
		/*if (mColor == "purple") {
			setContentView(R.layout.purple_view);
		} else {
			setContentView(R.layout.purple_view);
		}*/
		
		Timer t = new Timer();
		t.schedule(new TimerTask() {
			
			@Override
			public void run() {
				finish();
			}
		}, 5000);
	}
	
}
