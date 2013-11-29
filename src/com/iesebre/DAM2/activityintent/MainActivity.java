package com.iesebre.DAM2.activityintent;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {
	 public final static String EXTRA_MESSAGE = "com.iesebre.DAM2.activityintent.MESSAGE";
	 
	
	  public void onCreate(Bundle savedInstanceState) {
		    super.onCreate(savedInstanceState);
		    setContentView(R.layout.activity_main);

		    final Button orderButton = (Button)findViewById(R.id.button1);
		    final EditText text = (EditText)findViewById(R.id.edit_message);
		    orderButton.setOnClickListener(new View.OnClickListener() {

		      @Override
		      public void onClick(View view) {
		        Intent intent = new Intent(MainActivity.this, ActB.class);
		        Bundle b = new Bundle();
		        b.putString("text",text.getText().toString());
		        intent.putExtras(b);
		        startActivity(intent);
		      }

		    });
		  }
		
	    

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;}
}
