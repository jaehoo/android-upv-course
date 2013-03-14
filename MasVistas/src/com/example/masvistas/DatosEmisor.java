package com.example.masvistas;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class DatosEmisor extends Activity {
	
	private EditText entrada;
	
	private Intent i;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.datos_emisor);
		
		entrada = (EditText) findViewById(R.id.tParamData);
		
		i = new Intent(this, DatosReceptor.class);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.datos_emisor, menu);
		return true;
	}
	
	
	public void senData(View view){
		
		i.putExtra("param", entrada.getText().toString());
		startActivity(i);
		
		
	}
	
	public void senDataWithResponse(View view){
		
		i.putExtra("param", entrada.getText().toString());
		startActivityForResult(i, 1234);
		
	}
	
	
	// Retrieve data from child
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {

		 if (requestCode==1234 && resultCode==RESULT_OK) {

			 // Retrieve data from Activity
             String res = data.getExtras().getString("response");

             Toast.makeText(this,"RESPUESTA: \n[ "+res+" ]", Toast.LENGTH_LONG).show();
             
		 }
		 
	}
	
		
		
	

}
