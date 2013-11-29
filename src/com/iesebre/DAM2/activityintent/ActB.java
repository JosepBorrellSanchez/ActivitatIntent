package com.iesebre.DAM2.activityintent;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActB extends Activity {
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activitatb);
		
		Button orderButton = (Button)findViewById(R.id.button1);
		
		orderButton.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				finish();
				
			}
			
		});
		
	}

}
