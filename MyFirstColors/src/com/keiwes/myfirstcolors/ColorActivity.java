package com.keiwes.myfirstcolors;

import android.app.Activity;
import android.os.Bundle;

public class ColorActivity extends Activity {

	protected static final String COLOR = null;
	private String mColor = getIntent().getStringExtra(COLOR);

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		if (mColor == "purple") {
			setContentView(R.layout.purple_view);
		} 
		
	}
	
}
