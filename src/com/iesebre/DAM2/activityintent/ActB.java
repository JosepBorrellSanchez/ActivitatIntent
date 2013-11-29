package com.iesebre.DAM2.activityintent;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ActB extends Activity {
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activitatb);
		  
		    TextView edit_message = (TextView) findViewById(R.id.textView1);
		    
		    Bundle bundle = this.getIntent().getExtras();  
		    		
		    edit_message.setText(bundle.getString("text"));		    
		    
		    
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
