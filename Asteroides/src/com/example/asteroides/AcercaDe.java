package com.example.asteroides;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;


public class AcercaDe extends Activity {

	
	  /** Called when the activity is first created. */

    @Override public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.acercade);

        // Get data FROM Caller
        Bundle extras= getIntent().getExtras();
        String text= extras.getString("test"); 
        Toast.makeText(this, text, Toast.LENGTH_SHORT).show();
        

        // Return data TO caller
        Intent i= new Intent();
        i.putExtra("resultado","valor");
        setResult(RESULT_OK, i);
        //finish();
        
    }
	
}
