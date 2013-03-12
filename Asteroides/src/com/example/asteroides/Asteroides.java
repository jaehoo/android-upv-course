package com.example.asteroides;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class Asteroides extends Activity {

	
	private Button bAcercaDe;
	private Button bExit;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		bExit = (Button) findViewById(R.id.exitBtn);

		bExit.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				finish();
			
			}
		});
		
//		bAcercaDe =(Button) findViewById(R.id.aboutBtn);
//
//		bAcercaDe.setOnClickListener(new OnClickListener() {
//
//			public void onClick(View view) {
//				lanzarAcercaDe(null);
//			}
//
//		});
		
	}

	

	
	public void lanzarAcercaDe(View view){

		// SEND DATA TO Activity
	      Intent i = new Intent(this, AcercaDe.class);
	      i.putExtra("test", "my value!! :?");
	      startActivityForResult(i, 1234);
//        startActivity(i);
	      
	      

    }

	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {

		 if (requestCode==1234 && resultCode==RESULT_OK) {

			 // Retrieve data from Activity
             String res = data.getExtras().getString("resultado");

             Toast.makeText(this, res, Toast.LENGTH_SHORT).show();
             
		 }
		
		
		 
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		getMenuInflater().inflate(R.menu.menu, menu);
		return true;
		/** true -> el menú ya está visible */

	}
	
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {

		switch (item.getItemId()) {

		case R.id.acercaDe:

			lanzarAcercaDe(null);

			break;

		}

		return true;
		/** true -> consumimos el item, no se propaga */

	}
	
	
	

}
